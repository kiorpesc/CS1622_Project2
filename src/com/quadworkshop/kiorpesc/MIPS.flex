/* JFlex specification for subset of MIPS */
package com.quadworkshop.kiorpesc;
import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
 */
%%

%class Lexer
%implements sym
%unicode
%cup
%line
%column

%{

  StringBuffer string = new StringBuffer();
  private boolean inDataSegment = false;

    private Symbol lastSym;

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

  private Integer getRegisterNum(String regName) {
        String num = regName.substring(2);
        Integer result = Integer.valueOf(num);
        return result;
  }
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = [ \t\f]

Separator = [(,)]

/* comments */
Comment = {EndOfLineComment}

EndOfLineComment     = "#" {InputCharacter}* {LineTerminator}?

Register = \$r[1-9]?[0-9]

Identifier = [:jletter:] [:jletterdigit:]*
Label = [:jletter:] [:jletterdigit:]*:

DecIntegerLiteral = 0 | -?[1-9][0-9]*
HexIntegerLiteral = 0x[0-9a-fA-F]*

%state STRING

%%

/* keywords */
<YYINITIAL> ".data"             {   inDataSegment = true;
                                    lastSym = symbol(DATA_SECTION);
                                    return lastSym; }
<YYINITIAL> ".text"             {   inDataSegment = false;
                                    lastSym = symbol(TEXT_SECTION);
                                     return lastSym; }

<YYINITIAL> {

  {Register}                    { lastSym = symbol(REGISTER, getRegisterNum(yytext()));
                                    return lastSym; }

  /* instructions */
  "addi"                        {  lastSym = symbol(I_TYPE, Integer.valueOf(0x8));
                                    return lastSym; }
  "add"                         {  lastSym = symbol(R_TYPE, Integer.valueOf(0x20)); return lastSym;}
  "sub"                         {  lastSym = symbol(R_TYPE, Integer.valueOf(0x22)); return lastSym;}
  "slt"                         {  lastSym = symbol(R_TYPE, Integer.valueOf(0x2a)); return lastSym;}
  "beq"                         {  lastSym = symbol(I_TYPE, Integer.valueOf(0x4)); return lastSym;}
  "bne"                         {  lastSym = symbol(I_TYPE, Integer.valueOf(0x5)); return lastSym;}
  "syscall"                     {  lastSym = symbol(R_TYPE, Integer.valueOf(0xc)); return lastSym;}
  "lbu"                         {  lastSym = symbol(I_TYPE, Integer.valueOf(0x24)); return lastSym;}
  "sb"                          {  lastSym = symbol(I_TYPE, Integer.valueOf(0x28)); return lastSym;}
  "jal"                         {  lastSym = symbol(J_TYPE, Integer.valueOf(0x3)); return lastSym;}
  "jr"                          {  lastSym = symbol(R_TYPE, Integer.valueOf(0x8)); return lastSym;}
  "j"                           {  lastSym = symbol(J_TYPE, Integer.valueOf(0x2)); return lastSym;}
  "lui"                         {  lastSym = symbol(I_TYPE, Integer.valueOf(0xf)); return lastSym;}
  "and"                         {  lastSym = symbol(R_TYPE, Integer.valueOf(0x24)); return lastSym;}
  "ori"                         {  lastSym = symbol(I_TYPE, Integer.valueOf(0xd)); return lastSym;}
  "nor"                         {  lastSym = symbol(R_TYPE, Integer.valueOf(0x27)); return lastSym;}

    /* types */
    ".asciiz"                   { lastSym = symbol(TYPE, yytext()); return lastSym;}

  /* labels */
  {Label}                       { lastSym = symbol(LABEL, yytext()); return lastSym;}
  {Identifier}                  { lastSym = symbol(IDENT, yytext()); return lastSym;}


  /* literals */
  {DecIntegerLiteral}            { lastSym = symbol(INTEGER_LITERAL, Integer.valueOf(yytext())); return lastSym; }
  {HexIntegerLiteral}            { lastSym = symbol(INTEGER_LITERAL, Integer.decode(yytext())); return lastSym; }
  \"                             { string.setLength(0); yybegin(STRING); }

  /* comments */
  {Comment}                      { /* ignore */ }

  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }

  /* separator */
  {Separator}                               { /* ignore */ }
  {LineTerminator}               { if(lastSym == null || lastSym.sym != EOL){
                                    lastSym = symbol(EOL);
                                    return lastSym;
                                   } else lastSym = symbol(EOL);
                                 }

}

<STRING> {
  \"                             { yybegin(YYINITIAL);
                                   lastSym = symbol(STRING_LITERAL,
                                   string.toString());
                                   return lastSym; }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\"                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}

/* error fallback */
[^]                              { throw new Error("Illegal character <"+
                                                    yytext()+">"); }

<<EOF>>                          { lastSym = symbol(EOF);
                                   return lastSym; }