package org.example;

import java.util.Scanner;


public class Main {
    private static final String LLAVE = "byronbyronbyron1";

    public static void main(String[] args) {
        func cifrado = new func();
        Scanner leer = new Scanner(System.in);

        while (true) {
            String opc = "";

            System.out.println("MENU");
            System.out.println("1_escritura");
            System.out.println("2_lectura");
            System.out.println("3_terminar");

            opc = leer.next();

            if (opc.equals("1")) {
                cifrado.escribir();
            } else if (opc.equals("2")) {
                cifrado.leer();
            } else if (opc.equals("3")) {
                leer.close();
                break;
            } else {
                System.out.println("Opción inválida");
            }
        }
    }



}
