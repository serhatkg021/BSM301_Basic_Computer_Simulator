/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SKG
 */
public class _Grup_27_FindSymbol {

    static public String[] findSymbol(String symbol, String adress) {
        String symbolHex = _Grup_27_Command.getHexCodeValue(symbol);
        String[] returnValue = new String[3];
        switch (symbol) {
            //MEMORY
            case "OR":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "AND":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "XOR":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "ADD":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "LDA":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "STA":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "BUN":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "BSA":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;
            case "ISZ":
                returnValue[0] = "0";
                returnValue[1] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                returnValue[2] = _Grup_27_Methods.decToBinary(adress);
                break;

            //REGİSTER
            case "CLA":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "SZA":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "SNA":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "CMA":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "INC":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "ASHR":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "ASHL":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "SZE":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;
            case "HLT":
                returnValue[0] = "0";
                returnValue[1] = "0000";
                returnValue[2] = _Grup_27_Methods.hexToBinaryCommand(_Grup_27_Command.getHexCodeValue(symbol));
                break;

            //I/O
            case "INP":

                break;

            //STACK
            case "Push":

                break;
            case "Pop":

                break;
            case "SZEmpty":

                break;
            case "SZFull":

                break;
            default:
                throw new AssertionError();
        }

        return returnValue;
    }
}
