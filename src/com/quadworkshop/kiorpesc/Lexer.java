/* The following code was generated by JFlex 1.6.0 */

/* JFlex specification for subset of MIPS */
package com.quadworkshop.kiorpesc;
import java_cup.runtime.*;

/**
 * This class is a simple example lexer.
 */

class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\12\1\3\1\2\1\0\1\3\1\1\16\12\4\0\1\3\1\0"+
    "\1\44\1\4\1\5\3\0\2\3\2\0\1\3\1\14\1\17\1\0"+
    "\1\10\11\7\1\13\6\0\6\16\24\11\1\0\1\45\2\0\1\11"+
    "\1\0\1\21\1\27\1\34\1\20\1\23\1\41\1\11\1\40\1\24"+
    "\1\35\1\11\1\30\1\11\1\32\1\36\1\43\1\31\1\6\1\25"+
    "\1\22\1\26\1\11\1\42\1\15\1\33\1\37\4\0\41\12\2\0"+
    "\4\11\4\0\1\11\2\0\1\12\7\0\1\11\4\0\1\11\5\0"+
    "\27\11\1\0\37\11\1\0\u01ca\11\4\0\14\11\16\0\5\11\7\0"+
    "\1\11\1\0\1\11\21\0\160\12\5\11\1\0\2\11\2\0\4\11"+
    "\10\0\1\11\1\0\3\11\1\0\1\11\1\0\24\11\1\0\123\11"+
    "\1\0\213\11\1\0\5\12\2\0\236\11\11\0\46\11\2\0\1\11"+
    "\7\0\47\11\7\0\1\11\1\0\55\12\1\0\1\12\1\0\2\12"+
    "\1\0\2\12\1\0\1\12\10\0\33\11\5\0\3\11\15\0\5\12"+
    "\6\0\1\11\4\0\13\12\5\0\53\11\37\12\4\0\2\11\1\12"+
    "\143\11\1\0\1\11\10\12\1\0\6\12\2\11\2\12\1\0\4\12"+
    "\2\11\12\12\3\11\2\0\1\11\17\0\1\12\1\11\1\12\36\11"+
    "\33\12\2\0\131\11\13\12\1\11\16\0\12\12\41\11\11\12\2\11"+
    "\4\0\1\11\5\0\26\11\4\12\1\11\11\12\1\11\3\12\1\11"+
    "\5\12\22\0\31\11\3\12\104\0\1\11\1\0\13\11\67\0\33\12"+
    "\1\0\4\12\66\11\3\12\1\11\22\12\1\11\7\12\12\11\2\12"+
    "\2\0\12\12\1\0\7\11\1\0\7\11\1\0\3\12\1\0\10\11"+
    "\2\0\2\11\2\0\26\11\1\0\7\11\1\0\1\11\3\0\4\11"+
    "\2\0\1\12\1\11\7\12\2\0\2\12\2\0\3\12\1\11\10\0"+
    "\1\12\4\0\2\11\1\0\3\11\2\12\2\0\12\12\4\11\7\0"+
    "\1\11\5\0\3\12\1\0\6\11\4\0\2\11\2\0\26\11\1\0"+
    "\7\11\1\0\2\11\1\0\2\11\1\0\2\11\2\0\1\12\1\0"+
    "\5\12\4\0\2\12\2\0\3\12\3\0\1\12\7\0\4\11\1\0"+
    "\1\11\7\0\14\12\3\11\1\12\13\0\3\12\1\0\11\11\1\0"+
    "\3\11\1\0\26\11\1\0\7\11\1\0\2\11\1\0\5\11\2\0"+
    "\1\12\1\11\10\12\1\0\3\12\1\0\3\12\2\0\1\11\17\0"+
    "\2\11\2\12\2\0\12\12\1\0\1\11\17\0\3\12\1\0\10\11"+
    "\2\0\2\11\2\0\26\11\1\0\7\11\1\0\2\11\1\0\5\11"+
    "\2\0\1\12\1\11\7\12\2\0\2\12\2\0\3\12\10\0\2\12"+
    "\4\0\2\11\1\0\3\11\2\12\2\0\12\12\1\0\1\11\20\0"+
    "\1\12\1\11\1\0\6\11\3\0\3\11\1\0\4\11\3\0\2\11"+
    "\1\0\1\11\1\0\2\11\3\0\2\11\3\0\3\11\3\0\14\11"+
    "\4\0\5\12\3\0\3\12\1\0\4\12\2\0\1\11\6\0\1\12"+
    "\16\0\12\12\11\0\1\11\7\0\3\12\1\0\10\11\1\0\3\11"+
    "\1\0\27\11\1\0\12\11\1\0\5\11\3\0\1\11\7\12\1\0"+
    "\3\12\1\0\4\12\7\0\2\12\1\0\2\11\6\0\2\11\2\12"+
    "\2\0\12\12\22\0\2\12\1\0\10\11\1\0\3\11\1\0\27\11"+
    "\1\0\12\11\1\0\5\11\2\0\1\12\1\11\7\12\1\0\3\12"+
    "\1\0\4\12\7\0\2\12\7\0\1\11\1\0\2\11\2\12\2\0"+
    "\12\12\1\0\2\11\17\0\2\12\1\0\10\11\1\0\3\11\1\0"+
    "\51\11\2\0\1\11\7\12\1\0\3\12\1\0\4\12\1\11\10\0"+
    "\1\12\10\0\2\11\2\12\2\0\12\12\12\0\6\11\2\0\2\12"+
    "\1\0\22\11\3\0\30\11\1\0\11\11\1\0\1\11\2\0\7\11"+
    "\3\0\1\12\4\0\6\12\1\0\1\12\1\0\10\12\22\0\2\12"+
    "\15\0\60\11\1\12\2\11\7\12\4\0\10\11\10\12\1\0\12\12"+
    "\47\0\2\11\1\0\1\11\2\0\2\11\1\0\1\11\2\0\1\11"+
    "\6\0\4\11\1\0\7\11\1\0\3\11\1\0\1\11\1\0\1\11"+
    "\2\0\2\11\1\0\4\11\1\12\2\11\6\12\1\0\2\12\1\11"+
    "\2\0\5\11\1\0\1\11\1\0\6\12\2\0\12\12\2\0\4\11"+
    "\40\0\1\11\27\0\2\12\6\0\12\12\13\0\1\12\1\0\1\12"+
    "\1\0\1\12\4\0\2\12\10\11\1\0\44\11\4\0\24\12\1\0"+
    "\2\12\5\11\13\12\1\0\44\12\11\0\1\12\71\0\53\11\24\12"+
    "\1\11\12\12\6\0\6\11\4\12\4\11\3\12\1\11\3\12\2\11"+
    "\7\12\3\11\4\12\15\11\14\12\1\11\17\12\2\0\46\11\1\0"+
    "\1\11\5\0\1\11\2\0\53\11\1\0\u014d\11\1\0\4\11\2\0"+
    "\7\11\1\0\1\11\1\0\4\11\2\0\51\11\1\0\4\11\2\0"+
    "\41\11\1\0\4\11\2\0\7\11\1\0\1\11\1\0\4\11\2\0"+
    "\17\11\1\0\71\11\1\0\4\11\2\0\103\11\2\0\3\12\40\0"+
    "\20\11\20\0\125\11\14\0\u026c\11\2\0\21\11\1\0\32\11\5\0"+
    "\113\11\3\0\3\11\17\0\15\11\1\0\4\11\3\12\13\0\22\11"+
    "\3\12\13\0\22\11\2\12\14\0\15\11\1\0\3\11\1\0\2\12"+
    "\14\0\64\11\40\12\3\0\1\11\3\0\2\11\1\12\2\0\12\12"+
    "\41\0\3\12\2\0\12\12\6\0\130\11\10\0\51\11\1\12\1\11"+
    "\5\0\106\11\12\0\35\11\3\0\14\12\4\0\14\12\12\0\12\12"+
    "\36\11\2\0\5\11\13\0\54\11\4\0\21\12\7\11\2\12\6\0"+
    "\12\12\46\0\27\11\5\12\4\0\65\11\12\12\1\0\35\12\2\0"+
    "\13\12\6\0\12\12\15\0\1\11\130\0\5\12\57\11\21\12\7\11"+
    "\4\0\12\12\21\0\11\12\14\0\3\12\36\11\15\12\2\11\12\12"+
    "\54\11\16\12\14\0\44\11\24\12\10\0\12\12\3\0\3\11\12\12"+
    "\44\11\122\0\3\12\1\0\25\12\4\11\1\12\4\11\3\12\2\11"+
    "\11\0\300\11\47\12\25\0\4\12\u0116\11\2\0\6\11\2\0\46\11"+
    "\2\0\6\11\2\0\10\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\1\0\37\11\2\0\65\11\1\0\7\11\1\0\1\11\3\0\3\11"+
    "\1\0\7\11\3\0\4\11\2\0\6\11\4\0\15\11\5\0\3\11"+
    "\1\0\7\11\16\0\5\12\32\0\5\12\20\0\2\11\23\0\1\11"+
    "\13\0\5\12\5\0\6\12\1\0\1\11\15\0\1\11\20\0\15\11"+
    "\3\0\33\11\25\0\15\12\4\0\1\12\3\0\14\12\21\0\1\11"+
    "\4\0\1\11\2\0\12\11\1\0\1\11\3\0\5\11\6\0\1\11"+
    "\1\0\1\11\1\0\1\11\1\0\4\11\1\0\13\11\2\0\4\11"+
    "\5\0\5\11\4\0\1\11\21\0\51\11\u0a77\0\57\11\1\0\57\11"+
    "\1\0\205\11\6\0\4\11\3\12\2\11\14\0\46\11\1\0\1\11"+
    "\5\0\1\11\2\0\70\11\7\0\1\11\17\0\1\12\27\11\11\0"+
    "\7\11\1\0\7\11\1\0\7\11\1\0\7\11\1\0\7\11\1\0"+
    "\7\11\1\0\7\11\1\0\7\11\1\0\40\12\57\0\1\11\u01d5\0"+
    "\3\11\31\0\11\11\6\12\1\0\5\11\2\0\5\11\4\0\126\11"+
    "\2\0\2\12\2\0\3\11\1\0\132\11\1\0\4\11\5\0\51\11"+
    "\3\0\136\11\21\0\33\11\65\0\20\11\u0200\0\u19b6\11\112\0\u51cd\11"+
    "\63\0\u048d\11\103\0\56\11\2\0\u010d\11\3\0\20\11\12\12\2\11"+
    "\24\0\57\11\1\12\4\0\12\12\1\0\31\11\7\0\1\12\120\11"+
    "\2\12\45\0\11\11\2\0\147\11\2\0\4\11\1\0\4\11\14\0"+
    "\13\11\115\0\12\11\1\12\3\11\1\12\4\11\1\12\27\11\5\12"+
    "\20\0\1\11\7\0\64\11\14\0\2\12\62\11\21\12\13\0\12\12"+
    "\6\0\22\12\6\11\3\0\1\11\4\0\12\12\34\11\10\12\2\0"+
    "\27\11\15\12\14\0\35\11\3\0\4\12\57\11\16\12\16\0\1\11"+
    "\12\12\46\0\51\11\16\12\11\0\3\11\1\12\10\11\2\12\2\0"+
    "\12\12\6\0\27\11\3\0\1\11\1\12\4\0\60\11\1\12\1\11"+
    "\3\12\2\11\2\12\5\11\2\12\1\11\1\12\1\11\30\0\3\11"+
    "\2\0\13\11\5\12\2\0\3\11\2\12\12\0\6\11\2\0\6\11"+
    "\2\0\6\11\11\0\7\11\1\0\7\11\221\0\43\11\10\12\1\0"+
    "\2\12\2\0\12\12\6\0\u2ba4\11\14\0\27\11\4\0\61\11\u2104\0"+
    "\u016e\11\2\0\152\11\46\0\7\11\14\0\5\11\5\0\1\11\1\12"+
    "\12\11\1\0\15\11\1\0\5\11\1\0\1\11\1\0\2\11\1\0"+
    "\2\11\1\0\154\11\41\0\u016b\11\22\0\100\11\2\0\66\11\50\0"+
    "\15\11\3\0\20\12\20\0\7\12\14\0\2\11\30\0\3\11\31\0"+
    "\1\11\6\0\5\11\1\0\207\11\2\0\1\12\4\0\1\11\13\0"+
    "\12\12\7\0\32\11\4\0\1\11\1\0\32\11\13\0\131\11\3\0"+
    "\6\11\2\0\6\11\2\0\6\11\2\0\3\11\3\0\2\11\3\0"+
    "\2\11\22\0\3\12\4\0\14\11\1\0\32\11\1\0\23\11\1\0"+
    "\2\11\1\0\17\11\2\0\16\11\42\0\173\11\105\0\65\11\210\0"+
    "\1\12\202\0\35\11\3\0\61\11\57\0\37\11\21\0\33\11\65\0"+
    "\36\11\2\0\44\11\4\0\10\11\1\0\5\11\52\0\236\11\2\0"+
    "\12\12\u0356\0\6\11\2\0\1\11\1\0\54\11\1\0\2\11\3\0"+
    "\1\11\2\0\27\11\252\0\26\11\12\0\32\11\106\0\70\11\6\0"+
    "\2\11\100\0\1\11\3\12\1\0\2\12\5\0\4\12\4\11\1\0"+
    "\3\11\1\0\33\11\4\0\3\12\4\0\1\12\40\0\35\11\203\0"+
    "\66\11\12\0\26\11\12\0\23\11\215\0\111\11\u03b7\0\3\12\65\11"+
    "\17\12\37\0\12\12\20\0\3\12\55\11\13\12\2\0\1\12\22\0"+
    "\31\11\7\0\12\12\6\0\3\12\44\11\16\12\1\0\12\12\100\0"+
    "\3\12\60\11\16\12\4\11\13\0\12\12\u04a6\0\53\11\15\12\10\0"+
    "\12\12\u0936\0\u036f\11\221\0\143\11\u0b9d\0\u042f\11\u33d1\0\u0239\11\u04c7\0"+
    "\105\11\13\0\1\11\56\12\20\0\4\12\15\11\u4060\0\2\11\u2163\0"+
    "\5\12\3\0\26\12\2\0\7\12\36\0\4\12\224\0\3\12\u01bb\0"+
    "\125\11\1\0\107\11\1\0\2\11\2\0\1\11\2\0\2\11\2\0"+
    "\4\11\1\0\14\11\1\0\1\11\1\0\7\11\1\0\101\11\1\0"+
    "\4\11\2\0\10\11\1\0\7\11\1\0\34\11\1\0\4\11\1\0"+
    "\5\11\1\0\1\11\3\0\7\11\1\0\u0154\11\2\0\31\11\1\0"+
    "\31\11\1\0\37\11\1\0\31\11\1\0\37\11\1\0\31\11\1\0"+
    "\37\11\1\0\31\11\1\0\37\11\1\0\31\11\1\0\10\11\2\0"+
    "\62\12\u1600\0\4\11\1\0\33\11\1\0\2\11\1\0\1\11\2\0"+
    "\1\11\1\0\12\11\1\0\4\11\1\0\1\11\1\0\1\11\6\0"+
    "\1\11\4\0\1\11\1\0\1\11\1\0\1\11\1\0\3\11\1\0"+
    "\2\11\1\0\1\11\2\0\1\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\1\0\2\11\1\0\1\11\2\0\4\11\1\0"+
    "\7\11\1\0\4\11\1\0\4\11\1\0\1\11\1\0\12\11\1\0"+
    "\21\11\5\0\3\11\1\0\5\11\1\0\21\11\u1144\0\ua6d7\11\51\0"+
    "\u1035\11\13\0\336\11\u3fe2\0\u021e\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\12\36\0\140\12\200\0\360\12\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\2\3\2\4\2\5\2\1\5\4"+
    "\1\6\1\4\1\7\1\10\1\11\1\12\1\3\1\4"+
    "\1\13\1\5\7\0\3\4\1\14\7\4\1\15\2\4"+
    "\1\16\1\17\1\20\1\21\2\22\7\0\1\23\1\24"+
    "\1\25\1\26\1\4\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\7\0\1\36\1\4\1\37\1\0\1\40"+
    "\1\41\1\0\1\4\1\42\1\4\1\42\1\43";

  private static int [] zzUnpackAction() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\114\0\114\0\230\0\276"+
    "\0\344\0\u010a\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee"+
    "\0\u0214\0\u023a\0\u0260\0\u0286\0\114\0\u02ac\0\114\0\u02d2"+
    "\0\u02f8\0\u031e\0\114\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc"+
    "\0\u0402\0\u0428\0\u044e\0\u0474\0\u049a\0\u04c0\0\344\0\u04e6"+
    "\0\u050c\0\u0532\0\u0558\0\u057e\0\u05a4\0\u05ca\0\344\0\u05f0"+
    "\0\u0616\0\114\0\114\0\114\0\114\0\u063c\0\344\0\u0662"+
    "\0\u0688\0\u06ae\0\u06d4\0\u06fa\0\u0720\0\u0746\0\u076c\0\344"+
    "\0\344\0\344\0\u0792\0\344\0\344\0\344\0\344\0\344"+
    "\0\344\0\344\0\u07b8\0\u07de\0\u0804\0\u082a\0\u0850\0\u0876"+
    "\0\u089c\0\344\0\u08c2\0\114\0\u08e8\0\114\0\114\0\u090e"+
    "\0\u0934\0\u095a\0\u0980\0\114\0\344";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\11\2\3\1\14\2\11\1\15\1\11\1\16"+
    "\3\11\1\17\1\11\1\20\1\21\1\11\1\22\2\11"+
    "\1\23\1\24\5\11\1\25\1\3\1\26\2\3\41\26"+
    "\1\27\1\30\50\0\1\5\43\0\1\7\1\31\1\6"+
    "\43\7\5\0\1\11\1\32\4\11\1\33\1\0\2\11"+
    "\1\0\24\11\7\0\6\11\1\33\1\0\2\11\1\0"+
    "\24\11\11\0\2\12\52\0\1\34\37\0\1\12\56\0"+
    "\1\35\1\36\1\37\2\0\1\40\1\0\1\41\10\0"+
    "\1\42\1\0\1\43\10\0\6\11\1\33\1\0\2\11"+
    "\1\0\1\44\11\11\1\45\11\11\7\0\6\11\1\33"+
    "\1\0\2\11\1\0\6\11\1\46\1\47\1\50\2\11"+
    "\1\51\10\11\7\0\6\11\1\33\1\0\2\11\1\0"+
    "\3\11\1\52\6\11\1\53\11\11\7\0\6\11\1\33"+
    "\1\0\2\11\1\0\6\11\1\54\1\55\14\11\7\0"+
    "\6\11\1\33\1\0\2\11\1\0\16\11\1\56\5\11"+
    "\7\0\1\11\1\57\4\11\1\33\1\0\2\11\1\0"+
    "\1\11\1\60\22\11\7\0\1\11\1\61\4\11\1\33"+
    "\1\0\2\11\1\0\24\11\2\0\1\26\2\0\41\26"+
    "\10\0\1\62\13\0\1\63\7\0\1\64\11\0\1\65"+
    "\3\0\1\6\50\0\2\11\1\66\1\67\2\11\1\33"+
    "\1\0\2\11\1\0\24\11\11\0\2\34\5\0\1\34"+
    "\1\0\2\34\1\0\1\34\3\0\1\34\4\0\1\34"+
    "\4\0\1\34\25\0\1\70\51\0\1\71\43\0\1\72"+
    "\65\0\1\73\35\0\1\74\33\0\1\75\62\0\1\76"+
    "\14\0\6\11\1\33\1\0\2\11\1\0\1\77\23\11"+
    "\7\0\6\11\1\33\1\0\2\11\1\0\1\100\23\11"+
    "\7\0\6\11\1\33\1\0\2\11\1\0\7\11\1\101"+
    "\14\11\7\0\6\11\1\33\1\0\2\11\1\0\2\11"+
    "\1\102\21\11\7\0\6\11\1\33\1\0\2\11\1\0"+
    "\5\11\1\103\16\11\7\0\6\11\1\33\1\0\2\11"+
    "\1\0\11\11\1\104\12\11\7\0\6\11\1\33\1\0"+
    "\2\11\1\0\3\11\1\105\20\11\7\0\6\11\1\33"+
    "\1\0\2\11\1\0\4\11\1\106\17\11\7\0\6\11"+
    "\1\33\1\0\2\11\1\0\6\11\1\107\15\11\7\0"+
    "\1\11\1\110\4\11\1\33\1\0\2\11\1\0\24\11"+
    "\7\0\6\11\1\33\1\0\2\11\1\0\10\11\1\111"+
    "\13\11\7\0\6\11\1\33\1\0\2\11\1\0\4\11"+
    "\1\112\17\11\7\0\2\11\2\67\2\11\1\33\1\0"+
    "\2\11\1\0\24\11\24\0\1\113\57\0\1\114\26\0"+
    "\1\115\51\0\1\116\46\0\1\117\53\0\1\120\23\0"+
    "\1\121\44\0\6\11\1\33\1\0\2\11\1\0\4\11"+
    "\1\122\17\11\7\0\6\11\1\33\1\0\2\11\1\0"+
    "\14\11\1\123\7\11\23\0\1\124\50\0\1\125\43\0"+
    "\1\126\57\0\1\117\34\0\1\127\63\0\1\130\24\0"+
    "\1\127\32\0\6\11\1\33\1\0\2\11\1\0\1\11"+
    "\1\131\22\11\26\0\1\132\63\0\1\43\10\0\6\11"+
    "\1\33\1\0\2\11\1\0\10\11\1\133\13\11\41\0"+
    "\1\134\13\0\6\11\1\33\1\0\2\11\1\0\10\11"+
    "\1\135\13\11\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2470];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\2\11\16\1\1\11\1\1\1\11"+
    "\3\1\1\11\1\1\7\0\16\1\4\11\2\1\7\0"+
    "\14\1\7\0\2\1\1\11\1\0\2\11\1\0\3\1"+
    "\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[93];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2830) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new Error("Illegal character <"+
                                                    yytext()+">");
          }
        case 36: break;
        case 2: 
          { return symbol(EOL);
          }
        case 37: break;
        case 3: 
          { /* ignore */
          }
        case 38: break;
        case 4: 
          { return symbol(IDENT, yytext());
          }
        case 39: break;
        case 5: 
          { return symbol(INTEGER_LITERAL, Integer.valueOf(yytext()));
          }
        case 40: break;
        case 6: 
          { return symbol(J_TYPE, Integer.valueOf(0x2));
          }
        case 41: break;
        case 7: 
          { string.setLength(0); yybegin(STRING);
          }
        case 42: break;
        case 8: 
          { string.append( yytext() );
          }
        case 43: break;
        case 9: 
          { yybegin(YYINITIAL);
                                   return symbol(STRING_LITERAL,
                                   string.toString());
          }
        case 44: break;
        case 10: 
          { string.append('\\');
          }
        case 45: break;
        case 11: 
          { return symbol(LABEL, yytext());
          }
        case 46: break;
        case 12: 
          { return symbol(I_TYPE, Integer.valueOf(0x28));
          }
        case 47: break;
        case 13: 
          { return symbol(R_TYPE, Integer.valueOf(0x8));
          }
        case 48: break;
        case 14: 
          { string.append('\r');
          }
        case 49: break;
        case 15: 
          { string.append('\t');
          }
        case 50: break;
        case 16: 
          { string.append('\n');
          }
        case 51: break;
        case 17: 
          { string.append('\"');
          }
        case 52: break;
        case 18: 
          { return symbol(REGISTER, getRegisterNum(yytext()));
          }
        case 53: break;
        case 19: 
          { return symbol(R_TYPE, Integer.valueOf(0x20));
          }
        case 54: break;
        case 20: 
          { return symbol(R_TYPE, Integer.valueOf(0x24));
          }
        case 55: break;
        case 21: 
          { return symbol(R_TYPE, Integer.valueOf(0x22));
          }
        case 56: break;
        case 22: 
          { return symbol(R_TYPE, Integer.valueOf(0x2a));
          }
        case 57: break;
        case 23: 
          { return symbol(I_TYPE, Integer.valueOf(0x4));
          }
        case 58: break;
        case 24: 
          { return symbol(I_TYPE, Integer.valueOf(0x5));
          }
        case 59: break;
        case 25: 
          { return symbol(I_TYPE, Integer.valueOf(0xf));
          }
        case 60: break;
        case 26: 
          { return symbol(I_TYPE, Integer.valueOf(0x24));
          }
        case 61: break;
        case 27: 
          { return symbol(R_TYPE, Integer.valueOf(0x27));
          }
        case 62: break;
        case 28: 
          { return symbol(J_TYPE, Integer.valueOf(0x3));
          }
        case 63: break;
        case 29: 
          { return symbol(I_TYPE, Integer.valueOf(0xd));
          }
        case 64: break;
        case 30: 
          { return symbol(I_TYPE, Integer.valueOf(0x8));
          }
        case 65: break;
        case 31: 
          { inDataSegment = true;
                                    return symbol(DATA_SECTION);
          }
        case 66: break;
        case 32: 
          { inDataSegment = false;
                                    return symbol(TEXT_SECTION);
          }
        case 67: break;
        case 33: 
          { /* ignore for now */
          }
        case 68: break;
        case 34: 
          { return symbol(TYPE, yytext());
          }
        case 69: break;
        case 35: 
          { return symbol(R_TYPE, Integer.valueOf(0xc));
          }
        case 70: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {
                return symbol(EOF);
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
