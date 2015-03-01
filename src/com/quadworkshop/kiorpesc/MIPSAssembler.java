package com.quadworkshop.kiorpesc;

import java_cup.runtime.Symbol;

public class MIPSAssembler {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Calc file.asm");
            System.exit(1);
        }
        Symbol parse_tree = null;
        try {
            MIPSParser parser = new MIPSParser(new Lexer(
                    new java.io.FileReader(args[0])));
            parse_tree = parser.debug_parse();
            System.out.println("Got parser output: ");
            System.out.println(parser.MIPSOutput);
        } catch (java.io.IOException e) {
            System.err.println("Unable to open file: " + args[0]);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
