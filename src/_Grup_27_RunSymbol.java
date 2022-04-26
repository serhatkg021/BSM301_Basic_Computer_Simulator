/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SKG
 */
public class _Grup_27_RunSymbol {

    static public void runSymbol(String strIR) {
        String[] IR = new String[3];
        IR[0] = strIR.substring(0, 1);
        IR[1] = strIR.substring(1, 5);
        IR[2] = strIR.substring(5, 9);
        _Grup_27_Anasayfa.taMicroTable.append("DECODE \n");
        _Grup_27_Anasayfa.taMicroTable.append(" T2  D0,….D7 <- Decode IR(1 ~ 4), AR <- IR(5 ~ 8) \n");

        if (IR[1].contains("0000")) {
            if (IR[0].contains("0")) {
                _Grup_27_Anasayfa.taMicroTable.append("EXECUTE \n");
                String hexOPCode = Integer.toHexString(Integer.parseInt(IR[2], 2));
                switch (hexOPCode) {
                    case "0":

                        break;
                    case "1":
                        _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                        _Grup_27_Command.AC = "0000";
                        _Grup_27_Anasayfa.lblAC.setText(_Grup_27_Command.AC);
                        _Grup_27_Anasayfa.taMicroTable.append(" T3  AC <- 0 \n");
                        break;
                    case "2":
                        _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                        int temp2 = Integer.parseInt(_Grup_27_Command.AC, 16);
                        if (temp2 == 0) {
                            _Grup_27_Command.nextPC();
                        }
                        break;
                    case "3":
                        _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                        String ac3 = _Grup_27_Methods.hexToBinary(_Grup_27_Command.AC);
                        if (ac3.charAt(0) == '1') {
                            _Grup_27_Command.nextPC();
                        }
                        break;
                    case "4":
                        _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                        String ac = _Grup_27_Methods.hexToBinary(_Grup_27_Command.AC);
                        String tumleyen = "";
                        for (int i = 0; i < ac.length(); i++) {
                            if (ac.charAt(i) == '0') {
                                tumleyen = tumleyen + "1";
                            } else {
                                tumleyen = tumleyen + "0";
                            }
                        }
                        int temp4 = Integer.parseInt(tumleyen, 16);
                        _Grup_27_Command.AC = _Grup_27_Methods.convertDecToHex(String.valueOf(temp4));
                        _Grup_27_Anasayfa.lblAC.setText(_Grup_27_Command.AC);
                        _Grup_27_Anasayfa.taMicroTable.append(" T3 AC <- AC'");
                        break;
                    case "5":
                        _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                        int temp5 = Integer.parseInt(_Grup_27_Command.AC, 2) + 1;
                        System.out.println(temp5);
                        _Grup_27_Command.AC = _Grup_27_Methods.decToBinary(String.valueOf(temp5));
                        _Grup_27_Anasayfa.lblAC.setText(_Grup_27_Command.AC);
                        _Grup_27_Anasayfa.taMicroTable.append(" T3 AC <- AC + 1'");
                        break;
                    case "7":

                        break;
                    case "8":

                        break;
                    case "9":
                        _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                        _Grup_27_Anasayfa.taMicroTable.append(" T3  S <- 0 \n");
                        _Grup_27_Anasayfa.btnCalistir.setEnabled(false);
                        _Grup_27_Anasayfa.taOutput.setText(String.valueOf(Integer.parseInt(_Grup_27_Command.AC, 16)));
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                _Grup_27_Anasayfa.taMicroTable.append("EXECUTE \n");

            }
        } else {
            _Grup_27_Anasayfa.taMicroTable.append("EXECUTE \n");
            String hexOPCode = Integer.toHexString(Integer.parseInt(IR[1], 2));
            switch (hexOPCode.toUpperCase()) {
                case "1":
                    _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));

                    _Grup_27_Command.AR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Command.DR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Anasayfa.taMicroTable.append(" T4  DR <- M[AR] \n");
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":
                    _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));

                    _Grup_27_Command.AR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Command.DR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Anasayfa.taMicroTable.append(" T4  DR <- M[AR] \n");

                    String hto = _Grup_27_Methods.hexToBinary(_Grup_27_Command.DR);
                    int decDR;
                    if (hto.charAt(0) == '1') {
                        String tumleyen = "";
                        for (int i = 0; i < hto.length(); i++) {
                            if (hto.charAt(i) == '0') {
                                tumleyen = tumleyen + "1";
                            } else {
                                tumleyen = tumleyen + "0";
                            }
                        }
                        decDR = Integer.parseInt(tumleyen, 2) + 1;
                        decDR = -decDR;
                    } else {
                        decDR = Integer.parseInt(hto, 2);
                    }

                    int sumDecACDR = Integer.parseInt(_Grup_27_Command.AC, 16) + decDR;
                    _Grup_27_Command.AC = _Grup_27_Methods.convertDecToHex(String.valueOf(sumDecACDR));
                    _Grup_27_Anasayfa.taMicroTable.append(" T5  AC <- AC + DR, SC <- 0 \n");

                    _Grup_27_Anasayfa.lblDR.setText(_Grup_27_Command.DR);
                    _Grup_27_Anasayfa.lblAR.setText(_Grup_27_Command.AR);
                    _Grup_27_Anasayfa.lblAC.setText(_Grup_27_Command.AC);
                    break;
                case "5":
                    _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));

                    _Grup_27_Command.AR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Command.DR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Anasayfa.taMicroTable.append(" T4  DR <- M[AR]\n");
                    _Grup_27_Command.AC = _Grup_27_Command.DR;
                    _Grup_27_Anasayfa.taMicroTable.append(" T5  AC <- DR, SC <- 0 \n");

                    _Grup_27_Anasayfa.lblDR.setText(_Grup_27_Command.DR);
                    _Grup_27_Anasayfa.lblAR.setText(_Grup_27_Command.AR);
                    _Grup_27_Anasayfa.lblAC.setText(_Grup_27_Command.AC);
                    break;
                case "6":
                    _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                    _Grup_27_Command.AR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Anasayfa.tblMemory.setValueAt(_Grup_27_Command.AC, Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Anasayfa.taMicroTable.append(" T4  M[AR] <- AC, SC <- 0 \n");

                    _Grup_27_Anasayfa.lblAR.setText(_Grup_27_Command.AR);
                    break;
                case "8":
                    _Grup_27_Anasayfa.tblMemory.setRowSelectionInterval(Integer.parseInt(_Grup_27_Command.PC, 2), Integer.parseInt(_Grup_27_Command.PC, 2));
                    _Grup_27_Command.AR = (String) _Grup_27_Anasayfa.tblMemory.getValueAt(Integer.parseInt(_Grup_27_Command.AR, 2), 3);
                    _Grup_27_Command.PC = _Grup_27_Command.AR;
                    _Grup_27_Anasayfa.lblAR.setText(_Grup_27_Command.AR);
                    _Grup_27_Anasayfa.lblPC.setText(_Grup_27_Command.PC);
                    _Grup_27_Anasayfa.taMicroTable.append(" T4  PC <- AR, SC <- 0 \n");

                    break;
                case "9":

                    break;
                case "F":

                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
