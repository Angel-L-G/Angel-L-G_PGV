package org.example;

import java.net.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            // Indicamos la URL donde nos conectamos
            URL url = new URL("http://www.lineadecodigo.com");

            // Buffer con los datos recibidos
            BufferedReader in = null;

            try {
                // Volcamos lo recibido al buffer
                in = new BufferedReader(new InputStreamReader(
                        url.openStream()));
            } catch(Throwable t){}

            // Transformamos el contenido del buffer a texto
            String inputLine;
            String inputText="";

            // Mientras haya cosas en el buffer las volcamos a las
            // cadenas de texto
            while ((inputLine = in.readLine()) != null)
            {
                inputText = inputText +""+ inputLine;
            }

            // Mostramos el contenido y cerramos la entrada
            System.out.println("El contenido de la URL es: " + inputText);
            in.close();
        } catch (MalformedURLException me) {
            System.out.println("URL erronea");
        } catch (IOException ioe) {
            System.out.println("Error IO");
        }
    }
}
