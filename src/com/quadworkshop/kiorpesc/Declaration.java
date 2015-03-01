package com.quadworkshop.kiorpesc;

/**
 * Created by charlie on 3/1/15.
 */
public class Declaration {

    private String label;
    private int memOffset;
    private String str;
    private int nullLength;
    private int words;

    public Declaration(String lab, int off, String s){
        label = lab;
        memOffset = off;
        //System.out.println(s);
        str = s;
        nullLength = str.length() + 1;
        words = nullLength / 4;
        if(nullLength % 4 != 0)
            words += 1;
    }

    public int getMemOffset() {
        return memOffset;
    }

    public String getLabel() {
        return label;
    }

    public String getString() {
        return str;
    }

    public String toString() {
        StringBuilder output = new StringBuilder(label);
        output.append(memOffset);
        output.append(": ");
        output.append(str);
        return output.toString();
    }

    private StringBuilder getNextWord(int start){
        StringBuilder word = new StringBuilder();
        int wordInt = 0;
        String sub;
        if(start == words - 1) {
            sub = str.substring(start*4);
        } else {
            sub = str.substring(start*4, start*4+4);
        }
        //System.out.println(sub);

        for(int i = 0; i < sub.length(); i++){
            char cur = sub.charAt(i);
            wordInt = wordInt | (cur << ((3-i)*8));
        }
        word.append(Integer.toHexString(wordInt));
        while(word.length() < 8){
            word.append(0);
        }
        word.insert(0, "0x");
        return word;
    }

    public String getMemoryMap(){
        StringBuilder memoryMap = new StringBuilder();
        StringBuilder tempAddr;
        StringBuilder tempAddrLow;
        StringBuilder tempByte;
        for(int i = 0; i < words; i++){
            tempAddr = new StringBuilder("0x1001");
            tempAddrLow = new StringBuilder(Integer.toHexString((memOffset + i) * 4));
            while (tempAddrLow.length() < 4){
                tempAddrLow.insert(0, 0);
            }
            tempAddr.append(tempAddrLow);
            tempByte = getNextWord(i);
            memoryMap.append(tempAddr);
            memoryMap.append(" ");
            memoryMap.append(tempByte);
            memoryMap.append("\n");
        }
        return memoryMap.toString();
    }

}
