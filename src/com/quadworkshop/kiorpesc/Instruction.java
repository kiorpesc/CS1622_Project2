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
    private final int upper16Mask = 0xFFFF0000;
    private final int lower16Mask = 0x0000FFFF;
    private final int upper6Mask = 0xFC000000;
    private final int lower26Mask = 0x3FFFFFF;
    private final int instrMemStart = 0x00400000;
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

    public boolean hasId(){
        return hasId;
    }

    public String getId() {
        return identifier;
    }

    public String toString(){
        StringBuilder output = new StringBuilder(Integer.toHexString(instruction));
        while(output.length() < 8){
            output.insert(0, 0);
        }
        output.insert(0, "0x");
        return output.toString();
    }

    public void replaceWithIdVal(int resolved) {
        if(type == 'i'){
            instruction = instruction & upper16Mask;
            resolved = resolved - line;
            resolved = resolved & lower16Mask;
            instruction = instruction | resolved;
        } else if (type == 'j') {
            instruction = instruction & upper6Mask;
            resolved = resolved & lower26Mask;
            resolved = resolved | instrMemStart >> 2;
            instruction = instruction | resolved;
        }
    }

    public void replaceWithDataVal(int resolved) {
        instruction = instruction & upper16Mask;
        resolved = resolved << 2;
        resolved = resolved & lower16Mask;
        instruction = instruction | resolved;
    }

    public String getLabel() {
        return label;
    }

    public boolean hasLabel(){
        return isLabeled;
    }
}
