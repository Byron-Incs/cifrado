package org.example;
import java.util.Scanner;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import org.json.JSONTokener;

public class Main {
    public static void main(String[] args) {
        boolean state = true;
        Scanner leer = new Scanner(System.in);

        while (state) {
            String opc = "";

            System.out.println("MENU");
            System.out.println("1_escritura");
            System.out.println("2_lectura");

            opc = leer.next();

            if (opc.equals("1")) {
                System.out.print("Ingresa el texto: ");
                leer.nextLine();
                String input = leer.nextLine();

                StringBuilder result = new StringBuilder();

                for (char character : input.toCharArray()) {
                    int asciiValue = (int) character;
                    String binaryValue = Integer.toBinaryString(asciiValue);
                    result.append(binaryValue).append(" ");
                }

                System.out.println(result);

                JSONObject msj = new JSONObject();
                msj.put("mensaje_en_binario", result.toString());

                // Crear el archivo JSON
                try (FileWriter file = new FileWriter("mensaje.json")) {
                    file.write(msj.toString());
                    System.out.println("Archivo JSON creado exitosamente en la carpeta del proyecto :).");
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al crear el archivo JSON: " + e.getMessage());
                }

                String opcS = "";

                System.out.println("¿Terminar? (si/no)");
                opcS = leer.next();
                if (opcS.equals("si")) {
                    state = false;
                }

            } else if (opc.equals("2")) {
                try {
                    FileReader fileReader = new FileReader("mensaje.json");
                    JSONTokener tokener = new JSONTokener(fileReader);
                    JSONObject jsonObject = new JSONObject(tokener);

                    String mensajeBinario = jsonObject.getString("mensaje_en_binario");
                    System.out.println("Mensaje en binario: " + mensajeBinario);


                    String[] binaryValues = mensajeBinario.split(" ");
                    StringBuilder result = new StringBuilder();

                    for (String binaryValue : binaryValues) {
                        try {
                            int asciiValue = Integer.parseInt(binaryValue, 2);
                            char character = (char) asciiValue;
                            result.append(character);
                        } catch (NumberFormatException e) {
                            System.out.println("Error en el valor binario: " + binaryValue);
                        }
                    }

                    System.out.println("Texto resultante: " + result.toString());

                } catch (IOException e) {
                    System.out.println("Error al leer el archivo JSON: " + e.getMessage());
                }
            }
        }
    }
}

