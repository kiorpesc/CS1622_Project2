package com.quadworkshop.kiorpesc;

/**
 * Created by charlie on 3/1/15.
 */
public class Instruction {

    private char type;
    private int instruction;
    private boolean isLabeled;
    private String label;
    private boolean hasId;
    private String identifier;
    int line;

    public Instruction(char t, int instr, int lNum) {
        type = t;
        instruction = instr;
        line = lNum;
        isLabeled = false;
        label = "";
    }

    public Instruction(char t, int instr, int lNum, String lab){
        type = t;
        instruction = instr;
        line = lNum;
        isLabeled = true;
        label = lab;
    }

    public void addId(String id){
        hasId = true;
        identifier = id;
    }

    public String toString(){
        StringBuilder output = new StringBuilder(Integer.toHexString(instruction));
        while(output.length() < 8){
            output.insert(0, 0);
        }
        output.insert(0, "0x");
        return output.toString();
    }
}
