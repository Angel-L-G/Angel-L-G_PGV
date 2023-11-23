package org.example;

import java.io.IOException;
import java.rmi.UnknownHostException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String angel = "172.26.10.0";
        String juanma = "172.26.9.0";
        String host = "localhost";
        int port = 54321;
        Client cliente = null;
        try {
            cliente = new Client(juanma, port);
            cliente.connect();
        } catch (IOException ex) {
            System.err.println("No se ha podido conectar al Servidor con HOST: "+host+" y PORT: "+port);
            System.err.println(ex.getMessage());
        }
    }
}
