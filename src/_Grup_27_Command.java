/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SKG
 */
public class _Grup_27_Command {

    static public String AC = "0000";
    static public String PC = "0000";
    static public String AR = "0000";
    static public String DR = "0000";
    static public String IR = "000000000";

    static String[] memoryReferanceSymbols = {"OR", "AND", "XOR", "ADD", "LDA", "STA", "BUN", "BSA", "ISZ"};
    static String[] registerReferanceSymbols = {"CLA", "SZA", "SNA", "CMA", "INC", "ASHR", "ASHL", "SZE", "HLT"};
//    String[] ioReferanceSymbols = {};

    static String[] memoryReferanceHexCode = {"1", "2", "3", "4", "5", "6", "8", "9", "F"};
    static String[] registerReferanceHexCode = {"1", "2", "3", "4", "5", "7", "8", "0", "9"};
//    String[] ioReferanceHexCode = {};

    static public String getHexCodeValue(String symbol) {
        String returnValue = null;
        for (int i = 0; i < memoryReferanceSymbols.length; i++) {
            if (String.valueOf(memoryReferanceSymbols[i]).contains(symbol)) {
                returnValue = memoryReferanceHexCode[i];
                return returnValue;
            }
        }
        for (int i = 0; i < registerReferanceSymbols.length; i++) {
            if (String.valueOf(registerReferanceSymbols[i]).contains(symbol)) {
                returnValue = registerReferanceHexCode[i];
                return returnValue;
            }
        }
        return returnValue;
    }

    static public void nextPC() {
        int temp = Integer.parseInt(PC, 2) + 1;
        PC = Integer.toBinaryString(temp);
        temp = 4 - PC.length();
        for (int j = 0; j < temp; j++) {
            PC = "0" + PC;
        }
        _Grup_27_Anasayfa.lblPC.setText(PC);
    }
}
