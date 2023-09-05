package org.example;

import org.json.JSONObject;
import org.json.JSONTokener;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class func {
  String LLAVE = "byronbyronbyron1";





    public void escribir() {

        Scanner leer = new Scanner(System.in);

        leer.nextLine();
        System.out.print("Ingresa el texto: ");
        String input = leer.nextLine();

        try {
            SecretKey key = new SecretKeySpec(LLAVE.getBytes(StandardCharsets.UTF_8), "AES");

            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] cifrado = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));

            String cifradoBase64 = Base64.getEncoder().encodeToString(cifrado);

            JSONObject msj = new JSONObject();
            msj.put("mensaje_cifrado", cifradoBase64);

            try (FileWriter file = new FileWriter("mensaje.json")) {
                file.write(msj.toString());
                System.out.println("Archivo JSON creado exitosamente en la carpeta del proyecto :).");
            } catch (IOException e) {
                System.out.println("Ocurrió un error al crear el archivo JSON: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al cifrar el mensaje: " + e.getMessage());
        }
    }







    public void leer() {
        try {
            FileReader file = new FileReader("mensaje.json");
            JSONObject msj = new JSONObject(new JSONTokener(file));
            String cifradoBase64 = msj.getString("mensaje_cifrado");
            byte[] cifrado = Base64.getDecoder().decode(cifradoBase64);

            SecretKey key = new SecretKeySpec(LLAVE.getBytes(StandardCharsets.UTF_8), "AES");

            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] descifrado = cipher.doFinal(cifrado);

            System.out.println("El mensaje descifrado es: " + new String(descifrado, StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error al descifrar el mensaje: " + e.getMessage());
        }
    }

}
