package com.quadworkshop.kiorpesc;

import java_cup.runtime.Symbol;

import java.util.ArrayList;
import java.util.HashMap;

public class MIPSAssembler {

    public static void resolveLabels(ArrayList<Instruction> asl, HashMap<String, Integer> labelMap, HashMap<String, Integer> memMap) {
        for(Instruction i : asl) {
            if(i.hasId()){
                if(labelMap.keySet().contains(i.getId()))
                    i.replaceWithIdVal(labelMap.get(i.getId()));
                else
                    i.replaceWithDataVal(memMap.get(i.getId()));
            }
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java MIPSAssembler file.asm");
            System.exit(1);
        }
        Symbol parse_tree = null;
        try {
            MIPSParser parser = new MIPSParser(new Lexer(
                    new java.io.FileReader(args[0])));
            parse_tree = parser.parse();

            resolveLabels(parser.abstractSyntaxList, parser.labelLocs, parser.memoryMap);

            for(Instruction i : parser.abstractSyntaxList) {
                System.out.println(i);
            }

            if(parser.declarationList.size() != 0) {
                System.out.println("DATA SEGMENT");
                for (Declaration d : parser.declarationList) {
                    System.out.print(d.getMemoryMap());
                }
            }

        } catch (java.io.IOException e) {
            System.err.println("Unable to open file: " + args[0]);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
