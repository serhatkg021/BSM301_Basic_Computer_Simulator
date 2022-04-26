/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SKG
 */
public class _Grup_27_Methods {

    static public String getAdressFormat(String adress) {
        int adressInt = Integer.parseInt(adress);
        if (adressInt == 0) {
            adressInt++;
        }
        int sayac = 0;
        String addAdress = "";
        while (adressInt > 0) {
            adressInt /= 10; 
            sayac++;
        }
        if (sayac == 2) {
            addAdress = "0";
        }
        if (sayac == 1) {
            addAdress = "00";
        }
        if (sayac == 0) {
            addAdress = "000";
        }
        return addAdress;
    }

    static public String convertDecToHex(String decValue) {
        int intValue = Integer.parseInt(decValue);
        String hexValue = Integer.toHexString(intValue);
        if (intValue >= 0) {
            if (hexValue.length() == 3) {
                hexValue = "0" + hexValue;
            }
            if (hexValue.length() == 2) {
                hexValue = "00" + hexValue;
            }
            if (hexValue.length() == 1) {
                hexValue = "000" + hexValue;
            }
        } else {
            hexValue = hexValue.substring(hexValue.length() - 4);
        }
        return hexValue.toUpperCase();
    }

    static String hexToBinary(String hex) {
        int i = Integer.parseInt(hex, 16);
        String bin = Integer.toBinaryString(i);
        int temp = 16 - bin.length();
        for (int j = 0; j < temp; j++) {
            bin = "0" + bin;
        }
        return bin;
    }

    static String hexToBinaryAdress(String hex) {
        String bin = Integer.toBinaryString(Integer.parseInt(hex));
        int temp = 4 - bin.length();
        for (int j = 0; j < temp; j++) {
            bin = "0" + bin;
        }
        return bin;
    }

    static String hexToBinaryCommand(String hex) {
        String bin = Integer.toBinaryString(Integer.parseInt(hex));
        int temp = 4 - bin.length();
        for (int j = 0; j < temp; j++) {
            bin = "0" + bin;
        }
        return bin;
    }

    static String decToBinary(String dec) {
        int temp = Integer.parseInt(dec);
        String ret = Integer.toBinaryString(temp);
        int temp2 = ret.length();
        for (int i = 0; i < 4 - temp2; i++) {
            ret = "0" + ret;
        }
        return  ret;
    }
}
