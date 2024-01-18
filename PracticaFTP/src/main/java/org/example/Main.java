package org.example;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FTPClient client = new FTPClient();

        String servidorFTP = "ftp.rediris.es";
        String user = "anonymous";
        String password = "anonymous";

        System.out.println("Nos Conectamos a: " + servidorFTP);

        client.connect(servidorFTP);
        System.out.println(client.getReplyString());
        int res = client.getReplyCode();

        boolean aux = client.login(user, password);
        System.out.println("Bool: " + aux);

        FTPFile[] ftpFiles = client.listFiles();

        for (FTPFile f : ftpFiles) {
            System.out.println(f);
        }

        if(!FTPReply.isPositiveCompletion(res)){
            client.disconnect();
            System.out.println("Conexion rechazada: " + res);
            System.exit(0);
        }

        client.disconnect();
        System.out.println("Conexion Finalizada.");
    }
}