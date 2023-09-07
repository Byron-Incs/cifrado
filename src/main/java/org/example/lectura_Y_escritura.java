package org.example;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.IOException;
import java.util.Scanner;


public class lectura_Y_escritura {

    public void escribir (){

        Scanner leer = new Scanner (System.in);

        System.out.println("introduce tu mensaje");
        String mnsj = leer.nextLine();

        String mnsjN = "";

        for (int i = 0; i<mnsj.length(); i++){

            String c ="";

            if (mnsj.charAt(i) == 'a') {
                c = "O2";
            } else if (mnsj.charAt(i) == 'A') {
                c = "2T";
            } else if (mnsj.charAt(i) == 'b') {
                c = "G1";
            } else if (mnsj.charAt(i) == 'B') {
                c = "2G";
            } else if (mnsj.charAt(i) == 'c') {
                c = "J1";
            } else if (mnsj.charAt(i) == 'C') {
                c = "2S";
            } else if (mnsj.charAt(i) == 'd') {
                c = "I1";
            } else if (mnsj.charAt(i) == 'D') {
                c = "2Y";
            } else if (mnsj.charAt(i) == 'e') {
                c = "C1";
            } else if (mnsj.charAt(i) == 'E') {
                c = "2B";
            } else if (mnsj.charAt(i) == 'f') {
                c = "A1";
            } else if (mnsj.charAt(i) == 'F') {
                c = "2R";
            } else if (mnsj.charAt(i) == 'g') {
                c = "S1";
            } else if (mnsj.charAt(i) == 'G') {
                c = "2I";
            } else if (mnsj.charAt(i) == 'h') {
                c = "Z1";
            } else if (mnsj.charAt(i) == 'H') {
                c = "2Q";
            } else if (mnsj.charAt(i) == 'i') {
                c = "N1";
            } else if (mnsj.charAt(i) == 'I') {
                c = "1q";
            } else if (mnsj.charAt(i) == 'j') {
                c = "F1";
            } else if (mnsj.charAt(i) == 'J') {
                c = "1X";
            } else if (mnsj.charAt(i) == 'k') {
                c = "T1";
            } else if (mnsj.charAt(i) == 'K') {
                c = "1Z";
            } else if (mnsj.charAt(i) == 'l') {
                c = "E0";
            } else if (mnsj.charAt(i) == 'L') {
                c = "1G";
            } else if (mnsj.charAt(i) == 'm') {
                c = "W0";
            } else if (mnsj.charAt(i) == 'M') {
                c = "1O";
            } else if (mnsj.charAt(i) == 'n') {
                c = "M0";
            } else if (mnsj.charAt(i) == 'N') {
                c = "1Y";
            } else if (mnsj.charAt(i) == 'ñ') {
                c = "V0";
            } else if (mnsj.charAt(i) == 'Ñ') {
                c = "1S";
            } else if (mnsj.charAt(i) == 'o') {
                c = "X0";
            } else if (mnsj.charAt(i) == 'O') {
                c = "1J";
            } else if (mnsj.charAt(i) == 'p') {
                c = "H0";
            } else if (mnsj.charAt(i) == 'P') {
                c = "1I";
            } else if (mnsj.charAt(i) == 'q') {
                c = "D0";
            } else if (mnsj.charAt(i) == 'Q') {
                c = "1Q";
            } else if (mnsj.charAt(i) == 'r') {
                c = "P0";
            } else if (mnsj.charAt(i) == 'R') {
                c = "0q";
            } else if (mnsj.charAt(i) == 's') {
                c = "L0";
            } else if (mnsj.charAt(i) == 'S') {
                c = "0W";
            } else if (mnsj.charAt(i) == 't') {
                c = "K2";
            } else if (mnsj.charAt(i) == 'T') {
                c = "0P";
            } else if (mnsj.charAt(i) == 'u') {
                c = "R2";
            } else if (mnsj.charAt(i) == 'U') {
                c = "0G";
            } else if (mnsj.charAt(i) == 'v') {
                c = "Y2";
            } else if (mnsj.charAt(i) == 'V') {
                c = "0S";
            } else if (mnsj.charAt(i) == 'w') {
                c = "U2";
            } else if (mnsj.charAt(i) == 'W') {
                c = "0E";
            } else if (mnsj.charAt(i) == 'x') {
                c = "Q2";
            } else if (mnsj.charAt(i) == 'X') {
                c = "0B";
            } else if (mnsj.charAt(i) == 'y') {
                c = "B2";
            } else if (mnsj.charAt(i) == 'Y') {
                c = "0C";
            } else if (mnsj.charAt(i) == 'z') {
                c = "J2";
            } else if (mnsj.charAt(i) == 'Z') {
                c = "0I";
            } else if (mnsj.charAt(i) == ' ') {
                c = "00";
            } else if (mnsj.charAt(i) == '1') {
                c = "Sz";
            } else if (mnsj.charAt(i) == '2') {
                c = "Ay";
            } else if (mnsj.charAt(i) == '3') {
                c = "Fx";
            } else if (mnsj.charAt(i) == '4') {
                c = "Ew";
            } else if (mnsj.charAt(i) == '5') {
                c = "If";
            } else if (mnsj.charAt(i) == '6') {
                c = "Te";
            } else if (mnsj.charAt(i) == '7') {
                c = "Od";
            } else if (mnsj.charAt(i) == '8') {
                c = "Lc";
            } else if (mnsj.charAt(i) == '9') {
                c = "Ub";
            } else if (mnsj.charAt(i) == '0') {
                c = "Da";
            } else {
                c = "";
            }


            mnsjN = mnsjN + c ;


        }

        JSONObject msj = new JSONObject();
        msj.put("mensaje_cifrado", mnsjN);

        try (FileWriter file = new FileWriter("mensaje.json")) {
            file.write(msj.toString());
            System.out.println("Archivo JSON creado exitosamente en la carpeta del proyecto :).");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo JSON: " + e.getMessage());
        }






    }public void leer(){
        try {
            FileReader file = new FileReader("mensaje.json");
            JSONObject msj = new JSONObject(new JSONTokener(file));
            String mnsj = msj.getString("mensaje_cifrado");
            String mnsjN = "";

            System.out.println("mensaje cifrado: "+mnsj);


            for(int i  = 0; i<((mnsj.length())) ; i = i+2){
                String c = Character.toString(mnsj.charAt(i)) + Character.toString(mnsj.charAt(i+1)) ;

                char letra = 'a';

                if (c.equals("O2")) {
                    letra = 'a';
                } else if (c.equals("2T")) {
                    letra = 'A';
                } else if (c.equals("G1")) {
                    letra = 'b';
                } else if (c.equals("2G")) {
                    letra = 'B';
                } else if (c.equals("J1")) {
                    letra = 'c';
                } else if (c.equals("2S")) {
                    letra = 'C';
                } else if (c.equals("I1")) {
                    letra = 'd';
                } else if (c.equals("2Y")) {
                    letra = 'D';
                } else if (c.equals("C1")) {
                    letra = 'e';
                } else if (c.equals("2B")) {
                    letra = 'E';
                } else if (c.equals("A1")) {
                    letra = 'f';
                } else if (c.equals("2R")) {
                    letra = 'F';
                } else if (c.equals("S1")) {
                    letra = 'g';
                } else if (c.equals("2I")) {
                    letra = 'G';
                } else if (c.equals("Z1")) {
                    letra = 'h';
                } else if (c.equals("2Q")) {
                    letra = 'H';
                } else if (c.equals("N1")) {
                    letra = 'i';
                } else if (c.equals("1q")) {
                    letra = 'I';
                } else if (c.equals("F1")) {
                    letra = 'j';
                } else if (c.equals("1X")) {
                    letra = 'J';
                } else if (c.equals("T1")) {
                    letra = 'k';
                } else if (c.equals("1Z")) {
                    letra = 'K';
                } else if (c.equals("E0")) {
                    letra = 'l';
                } else if (c.equals("1G")) {
                    letra = 'L';
                } else if (c.equals("W0")) {
                    letra = 'm';
                } else if (c.equals("1O")) {
                    letra = 'M';
                } else if (c.equals("M0")) {
                    letra = 'n';
                } else if (c.equals("1Y")) {
                    letra = 'N';
                } else if (c.equals("V0")) {
                    letra = 'ñ';
                } else if (c.equals("1S")) {
                    letra = 'Ñ';
                } else if (c.equals("X0")) {
                    letra = 'o';
                } else if (c.equals("1J")) {
                    letra = 'O';
                } else if (c.equals("H0")) {
                    letra = 'p';
                } else if (c.equals("1I")) {
                    letra = 'P';
                } else if (c.equals("D0")) {
                    letra = 'q';
                } else if (c.equals("1Q")) {
                    letra = 'Q';
                } else if (c.equals("P0")) {
                    letra = 'r';
                } else if (c.equals("0q")) {
                    letra = 'R';
                } else if (c.equals("L0")) {
                    letra = 's';
                } else if (c.equals("0W")) {
                    letra = 'S';
                } else if (c.equals("K2")) {
                    letra = 't';
                } else if (c.equals("0P")) {
                    letra = 'T';
                } else if (c.equals("R2")) {
                    letra = 'u';
                } else if (c.equals("0G")) {
                    letra = 'U';
                } else if (c.equals("Y2")) {
                    letra = 'v';
                } else if (c.equals("0S")) {
                    letra = 'V';
                } else if (c.equals("U2")) {
                    letra = 'w';
                } else if (c.equals("0E")) {
                    letra = 'W';
                } else if (c.equals("Q2")) {
                    letra = 'x';
                } else if (c.equals("0B")) {
                    letra = 'X';
                } else if (c.equals("B2")) {
                    letra = 'y';
                } else if (c.equals("0C")) {
                    letra = 'Y';
                } else if (c.equals("J2")) {
                    letra = 'z';
                } else if (c.equals("0I")) {
                    letra = 'Z';
                } else if (c.equals("00")) {
                    letra = ' ';
                }else if (c.equals("Sz")) {
                    letra = '1';
                } else if (c.equals("Ay")) {
                    letra = '2';
                } else if (c.equals("Fx")) {
                    letra = '3';
                } else if (c.equals("Ew")) {
                    letra = '4';
                } else if (c.equals("If")) {
                    letra = '5';
                } else if (c.equals("Te")) {
                    letra = '6';
                } else if (c.equals("Od")) {
                    letra = '7';
                } else if (c.equals("Lc")) {
                    letra = '8';
                } else if (c.equals("Ub")) {
                    letra = '9';
                } else if (c.equals("Da")) {
                    letra = '0';
                } else {
                    letra = '\0'; // Esto significa que no se encontró una correspondencia.
                }

                mnsjN = mnsjN + Character.toString(letra);


            }

            System.out.println("el mensaje es: " + mnsjN);


        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error al descifrar el mensaje: " + e.getMessage());
        }
    }


}