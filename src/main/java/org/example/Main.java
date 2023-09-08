package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        lectura_Y_escritura obj = new lectura_Y_escritura();
        int opc = 0;

        while (opc != 3){

            System.out.println("menu");
            System.out.println("1- leer ");
            System.out.println("2- escribir ");
            System.out.println("3- terminar");

            opc=leer.nextInt();


            if (opc == 1){
                obj.leer();

            } else if (opc == 2) {
                obj.escribir();
            } else if (opc != 3) {
                System.out.println("opcion invalida");

            }

        }


    }
}



