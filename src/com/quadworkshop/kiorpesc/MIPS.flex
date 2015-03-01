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
                                    return symbol(DATA_SECTION); }
<YYINITIAL> ".text"             {   inDataSegment = false;
                                    return symbol(TEXT_SECTION); }

<YYINITIAL> {

  {Register}                    { return symbol(REGISTER, getRegisterNum(yytext())); }

  /* instructions */
  "addi"                        {  return symbol(I_TYPE, Integer.valueOf(0x8)); }
  "add"                         {  return symbol(R_TYPE, Integer.valueOf(0x20)); }
  "sub"                         {  return symbol(R_TYPE, Integer.valueOf(0x22)); }
  "slt"                         {  return symbol(R_TYPE, Integer.valueOf(0x2a)); }
  "beq"                         {  return symbol(I_TYPE, Integer.valueOf(0x4)); }
  "bne"                         {  return symbol(I_TYPE, Integer.valueOf(0x5)); }
  "syscall"                     {  return symbol(R_TYPE, Integer.valueOf(0xc)); }
  "lbu"                         {  return symbol(I_TYPE, Integer.valueOf(0x24)); }
  "sb"                          {  return symbol(I_TYPE, Integer.valueOf(0x28)); }
  "jal"                         {  return symbol(J_TYPE, Integer.valueOf(0x3)); }
  "jr"                          {  return symbol(R_TYPE, Integer.valueOf(0x8)); }
  "j"                           {  return symbol(J_TYPE, Integer.valueOf(0x2)); }
  "lui"                         {  return symbol(I_TYPE, Integer.valueOf(0xf)); }
  "and"                         {  return symbol(R_TYPE, Integer.valueOf(0x24)); }
  "ori"                         {  return symbol(I_TYPE, Integer.valueOf(0xd)); }
  "nor"                         {  return symbol(R_TYPE, Integer.valueOf(0x27)); }

    /* types */
    ".asciiz"                   { return symbol(TYPE, yytext()); }

  /* labels */
  {Label}                       { return symbol(LABEL, yytext()); }
  {Identifier}                  { return symbol(IDENT, yytext()); }


  /* literals */
  {DecIntegerLiteral}            { return symbol(INTEGER_LITERAL, Integer.valueOf(yytext())); }
  {HexIntegerLiteral}            { return symbol(INTEGER_LITERAL, Integer.valueOf(yytext())); }
  \"                             { string.setLength(0); yybegin(STRING); }

  /* comments */
  {Comment}                      { /* ignore */ }

  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }

  /* separator */
  {Separator}                               { /* ignore */ }
  {LineTerminator}               { return symbol(EOL); }

}

<STRING> {
  \"                             { yybegin(YYINITIAL);
                                   return symbol(STRING_LITERAL,
                                   string.toString()); }
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

<<EOF>>                          { return symbol(EOF); }