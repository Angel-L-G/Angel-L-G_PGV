package org.example;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FTPClient client = new FTPClient();
        String servidorFTP = "localhost";
        String User = "dam";
        String Password = "J4V4";

        System.out.println("Nos conectamos a: " + servidorFTP);

        client.connect(servidorFTP);
        client.login(User,Password);
        FTPFile[] lista = client.listFiles();

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        System.out.println(client.getReplyString());

        int res = client.getReplyCode();
        if(!FTPReply.isPositiveCompletion(res)){
            client.disconnect();
            System.out.println("Conexión rechazada:" + res);
            System.exit(0);
        }

        client.disconnect();
        System.out.println("Conexión finalizada.");
    }
}