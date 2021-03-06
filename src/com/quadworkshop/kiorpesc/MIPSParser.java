
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Mar 01 17:37:15 EST 2015
//----------------------------------------------------

package com.quadworkshop.kiorpesc;

import java.util.HashMap;
import java.util.ArrayList;
import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Mar 01 17:37:15 EST 2015
  */
public class MIPSParser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public MIPSParser() {super();}

  /** Constructor which sets the default scanner. */
  public MIPSParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public MIPSParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\005\000\002\004\005" +
    "\000\002\005\005\000\002\005\004\000\002\005\002\000" +
    "\002\006\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\004\000\002\007\006\000\002\007\004\000\002\007" +
    "\003\000\002\010\006\000\002\010\006\000\002\010\006" +
    "\000\002\010\005\000\002\010\005\000\002\011\004\000" +
    "\002\011\004\000\002\012\004\000\002\012\002\000\002" +
    "\013\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\050\000\020\002\ufff9\004\006\005\011\006\ufff9\007" +
    "\ufff9\010\ufff9\012\ufff9\001\002\000\004\002\052\001\002" +
    "\000\004\002\000\001\002\000\004\015\043\001\002\000" +
    "\014\002\ufffe\006\022\007\020\010\016\012\017\001\002" +
    "\000\006\004\006\005\011\001\002\000\004\015\012\001" +
    "\002\000\020\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007\ufff9" +
    "\010\ufff9\012\ufff9\001\002\000\020\002\ufffc\004\ufffc\005" +
    "\ufffc\006\022\007\020\010\016\012\017\001\002\000\022" +
    "\002\ufff6\004\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\012" +
    "\ufff6\015\ufff6\001\002\000\022\002\ufff7\004\ufff7\005\ufff7" +
    "\006\ufff7\007\ufff7\010\ufff7\012\ufff7\015\ufff7\001\002\000" +
    "\006\013\041\016\040\001\002\000\004\015\037\001\002" +
    "\000\004\011\030\001\002\000\022\002\ufff8\004\ufff8\005" +
    "\ufff8\006\ufff8\007\ufff8\010\ufff8\012\ufff8\015\ufff8\001\002" +
    "\000\024\002\ufff2\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010" +
    "\ufff2\011\025\012\ufff2\015\ufff2\001\002\000\022\002\ufffa" +
    "\004\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa\012\ufffa\015" +
    "\024\001\002\000\020\002\ufffb\004\ufffb\005\ufffb\006\ufffb" +
    "\007\ufffb\010\ufffb\012\ufffb\001\002\000\024\002\ufff3\004" +
    "\ufff3\005\ufff3\006\ufff3\007\ufff3\010\ufff3\011\026\012\ufff3" +
    "\015\ufff3\001\002\000\004\011\027\001\002\000\022\002" +
    "\ufff4\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\012\ufff4" +
    "\015\ufff4\001\002\000\010\011\031\013\033\016\032\001" +
    "\002\000\006\013\036\016\035\001\002\000\024\002\uffed" +
    "\004\uffed\005\uffed\006\uffed\007\uffed\010\uffed\011\034\012" +
    "\uffed\015\uffed\001\002\000\022\002\uffee\004\uffee\005\uffee" +
    "\006\uffee\007\uffee\010\uffee\012\uffee\015\uffee\001\002\000" +
    "\022\002\uffef\004\uffef\005\uffef\006\uffef\007\uffef\010\uffef" +
    "\012\uffef\015\uffef\001\002\000\022\002\ufff1\004\ufff1\005" +
    "\ufff1\006\ufff1\007\ufff1\010\ufff1\012\ufff1\015\ufff1\001\002" +
    "\000\022\002\ufff0\004\ufff0\005\ufff0\006\ufff0\007\ufff0\010" +
    "\ufff0\012\ufff0\015\ufff0\001\002\000\022\002\ufff5\004\ufff5" +
    "\005\ufff5\006\ufff5\007\ufff5\010\ufff5\012\ufff5\015\ufff5\001" +
    "\002\000\022\002\uffec\004\uffec\005\uffec\006\uffec\007\uffec" +
    "\010\uffec\012\uffec\015\uffec\001\002\000\022\002\uffeb\004" +
    "\uffeb\005\uffeb\006\uffeb\007\uffeb\010\uffeb\012\uffeb\015\uffeb" +
    "\001\002\000\004\002\uffff\001\002\000\012\002\uffe9\004" +
    "\uffe9\005\uffe9\012\uffe9\001\002\000\012\002\ufffd\004\ufffd" +
    "\005\ufffd\012\046\001\002\000\012\002\uffea\004\uffea\005" +
    "\uffea\012\uffea\001\002\000\004\014\047\001\002\000\004" +
    "\017\050\001\002\000\004\015\051\001\002\000\012\002" +
    "\uffe8\004\uffe8\005\uffe8\012\uffe8\001\002\000\004\002\001" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\050\000\012\002\003\003\004\004\007\005\006\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\006\022\007\020\010\014\011\013\001\001\000" +
    "\004\004\041\001\001\000\002\001\001\000\004\005\012" +
    "\001\001\000\012\006\022\007\020\010\014\011\013\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\012\043\001\001\000\004\013\044\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MIPSParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MIPSParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MIPSParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return lexer.next_token(); 
    }


    boolean parsing_failed = false;
    int lineCount = 0;
    int errorCount = 0;
    int sixteenBitMask = 0x0FFFF;
    int twentySixBitMask = 0x03FFFFFF;
    boolean labelNextLine = false;
    String currentLabel = "";

    HashMap<String, Integer> labelLocs = new HashMap<String, Integer>();
    HashMap<String, Integer> idLocs = new HashMap<String, Integer>();
    HashMap<String, Integer> memoryMap = new HashMap<String, Integer>();
    int memOffset = 0;  // how many words into memory are we?
    int memStart = 0x10010000;
    int textStart = 0x00400000;

    Lexer lexer;
    public boolean inDataSec;
    public ArrayList<Instruction> abstractSyntaxList;
    public ArrayList<Declaration> declarationList;

    public MIPSParser(Lexer lex) {
        super(lex);
        lexer = lex;
        abstractSyntaxList = new ArrayList<Instruction>();
        declarationList = new ArrayList<Declaration>();
    }

    public void addLabelStart(String label) {
        //MIPSOutput.append(label);
        String stripped = label.substring(0, label.length() - 1);
        labelLocs.put(stripped, lineCount);  // FORCES ZERO-INDEXING OF LINES
        labelNextLine = true;
        currentLabel = label;
    }

    public void addLabelEnd(String id) {
        Instruction current = abstractSyntaxList.get(abstractSyntaxList.size() - 1);
        current.addId(id);
        idLocs.put(id, lineCount - 1);
    }

    // add the instruction to the list
    public void addInstruction(Instruction instruction) {
        abstractSyntaxList.add(instruction);
        lineCount++;
    }

    public Instruction constructRType(Object func, Object rs, Object rt, Object rd){
        int s = ((Integer)rs).intValue();
        int t = ((Integer)rt).intValue();
        int d = ((Integer)rd).intValue();
        int fun = ((Integer)func).intValue();
        int instruction = s << 21;
        instruction = instruction | t << 16;
        instruction = instruction | d << 11;
        instruction = instruction | fun;
        Instruction result;

        if(labelNextLine){
            result = new Instruction('r', instruction, lineCount, currentLabel);
            labelNextLine = false;
        } else {
            result = new Instruction('r', instruction, lineCount);
        }

        return result;
    }

    public Instruction constructRType(Object func, Object rs){
        int s = ((Integer)rs).intValue();
        int t = 0;
        int d = 0;
        int fun = ((Integer)func).intValue();
        int instruction = s << 21;
        instruction = instruction | t << 16;
        instruction = instruction | d << 11;
        instruction = instruction | fun;

        Instruction result;

        if(labelNextLine){
            result = new Instruction('r', instruction, lineCount, currentLabel);
            labelNextLine = false;
        } else {
            result = new Instruction('r', instruction, lineCount);
        }
        return result;
    }

    public Instruction constructRType(Object func){
        int s = 0;
        int t = 0;
        int d = 0;
        int fun = ((Integer)func).intValue();
        int instruction = s << 21;
        instruction = instruction | t << 16;
        instruction = instruction | d << 11;
        instruction = instruction | fun;

        Instruction result;

        if(labelNextLine){
            result = new Instruction('r', instruction, lineCount, currentLabel);
            labelNextLine = false;
        } else {
            result = new Instruction('r', instruction, lineCount);
        }

        return result;
    }

    public Instruction constructIType(Object opc, Object rs, Object rt, Object literal) {
        int s = ((Integer)rs).intValue();
        int t = ((Integer)rt).intValue();
        int op = ((Integer)opc).intValue();
        Integer litInt = (Integer) literal;
        int lit = ((Integer)literal).intValue();
        if(lit > 32767 || lit < -32768) {
            System.out.println("ERROR: Integer literal greater than 16 bits: instruction " + lineCount);
            errorCount++;
            lit = 0x0000;
        } else {
            lit = lit & sixteenBitMask;
        }
        int instruction = op << 26;
        instruction = instruction | (s << 21);
        instruction = instruction | (t << 16);
        instruction = instruction | lit;

        Instruction result;

        if(labelNextLine){
            result = new Instruction('i', instruction, lineCount, currentLabel);
            labelNextLine = false;
        } else {
            result = new Instruction('i', instruction, lineCount);
        }
        return result;
    }

    public Instruction constructJType(Object opc, Integer imm) {
        int op = ((Integer)opc).intValue();
        int addr = imm.intValue();
        if(addr > 33554431 || addr < -33554432) {
            addr = 0x0000;
            errorCount++;
            System.out.println("ERROR: Address value too large: instruction " + (lineCount));
        }
        int instruction = op << 26;
        addr = addr & twentySixBitMask;
        instruction = instruction | addr;

        Instruction result;

        if(labelNextLine){
            result = new Instruction('j', instruction, lineCount, currentLabel);
            labelNextLine = false;
        } else {
            result = new Instruction('j', instruction, lineCount);
        }
        return result;
    }

    public void constructDeclaration(String lab, Object type, String str) {
        int bytes = str.length() + 1;
        int words = bytes / 4;
        if(bytes % 4 != 0) {
            words += 1;
        }

        declarationList.add(new Declaration(lab, memOffset, str));
        memoryMap.put(lab.substring(0, lab.length()-1), memOffset);
        memOffset += words;
    }

    public void syntax_error(java_cup.runtime.Symbol cur_token) {
        parsing_failed = true;
        System.err.println("Syntax error " + cur_token.toString()
            + " Got: " + cur_token.toString());
    }

    public boolean hasFailed() { return parsing_failed;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$MIPSParser$actions {
  private final MIPSParser parser;

  /** Constructor */
  CUP$MIPSParser$actions(MIPSParser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$MIPSParser$do_action(
    int                        CUP$MIPSParser$act_num,
    java_cup.runtime.lr_parser CUP$MIPSParser$parser,
    java.util.Stack            CUP$MIPSParser$stack,
    int                        CUP$MIPSParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MIPSParser$result;

      /* select the action based on the action number */
      switch (CUP$MIPSParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // decl ::= LABEL TYPE STRING_LITERAL EOL 
            {
              Object RESULT =null;
		int lableft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).left;
		int labright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).right;
		Object lab = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).value;
		int typeleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).left;
		int typeright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).right;
		Object type = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).value;
		int strleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int strright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		 parser.constructDeclaration((String)lab, type, str); 
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("decl",9, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // decl_list ::= 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("decl_list",8, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // decl_list ::= decl_list decl 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("decl_list",8, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // j_expr ::= J_TYPE IDENT 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		  Instruction instruction = parser.constructJType(op, new Integer(0));
                    parser.addInstruction(instruction);
                    parser.addLabelEnd((String)id);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("j_expr",7, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // j_expr ::= J_TYPE INTEGER_LITERAL 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int addrleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int addrright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Integer addr = (Integer)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		  Instruction instruction = parser.constructJType(op, addr);
                    parser.addInstruction(instruction);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("j_expr",7, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // i_expr ::= I_TYPE REGISTER INTEGER_LITERAL 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int immleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int immright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Integer imm = (Integer)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructIType(op, new Integer(0), rt, (Integer)imm);
                    parser.addInstruction(instruction);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("i_expr",6, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // i_expr ::= I_TYPE REGISTER IDENT 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructIType(op, new Integer(0), rt, new Integer(0));
                    parser.addInstruction(instruction);
                    parser.addLabelEnd((String)id);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("i_expr",6, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // i_expr ::= I_TYPE REGISTER INTEGER_LITERAL REGISTER 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).value;
		int immleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int immright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Integer imm = (Integer)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructIType(op, rs, rt, imm);
                    parser.addInstruction(instruction);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("i_expr",6, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // i_expr ::= I_TYPE REGISTER REGISTER IDENT 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructIType(op, rs, rt, new Integer(0));
                    parser.addInstruction(instruction);
                    parser.addLabelEnd((String)id);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("i_expr",6, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // i_expr ::= I_TYPE REGISTER REGISTER INTEGER_LITERAL 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int immleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int immright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Integer imm = (Integer)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructIType(op, rs, rt, imm);
                    parser.addInstruction(instruction);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("i_expr",6, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // r_expr ::= R_TYPE 
            {
              Object RESULT =null;
		int funcleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int funcright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object func = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructRType(func);
                    parser.addInstruction(instruction);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("r_expr",5, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // r_expr ::= R_TYPE REGISTER 
            {
              Object RESULT =null;
		int funcleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int funcright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object func = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructRType(func, rs);
                    parser.addInstruction(instruction);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("r_expr",5, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // r_expr ::= R_TYPE REGISTER REGISTER REGISTER 
            {
              Object RESULT =null;
		int funcleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).left;
		int funcright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).right;
		Object func = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)).value;
		int rdleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).left;
		int rdright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).right;
		Object rd = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)).value;
		int rsleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int rsright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object rs = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		int rtleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int rtright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object rt = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;
		
                    Instruction instruction = parser.constructRType(func, rs, rt, rd);
                    parser.addInstruction(instruction);
                    RESULT = instruction;
                
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("r_expr",5, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-3)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= LABEL EOL 
            {
              Object RESULT =null;
		int lableft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int labright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object lab = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		  parser.addLabelStart((String)lab); 
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("expr",4, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= j_expr 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("expr",4, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= i_expr 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("expr",4, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= r_expr 
            {
              Object RESULT =null;
		int outleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).left;
		int outright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()).right;
		Object out = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.peek()).value;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("expr",4, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr_list ::= 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("expr_list",3, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr_list ::= expr_list expr 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("expr_list",3, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr_list ::= expr_list expr EOL 
            {
              Object RESULT =null;
		  /*System.out.println("Got to expr_list"); */  
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("expr_list",3, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // section ::= TEXT_SECTION EOL expr_list 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("section",2, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // section ::= DATA_SECTION EOL decl_list 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("section",2, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-2)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // section_list ::= expr_list 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("section_list",1, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // section_list ::= section section 
            {
              Object RESULT =null;

              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("section_list",1, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= section_list 
            {
              Object RESULT =null;
		 /*System.out.println("SECTION LIST");*/ 
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          return CUP$MIPSParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)).value;
		RESULT = start_val;
              CUP$MIPSParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.elementAt(CUP$MIPSParser$top-1)), ((java_cup.runtime.Symbol)CUP$MIPSParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$MIPSParser$parser.done_parsing();
          return CUP$MIPSParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

