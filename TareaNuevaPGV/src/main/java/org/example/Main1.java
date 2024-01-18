package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime la Url:");
        while(true){
            String url = scanner.nextLine();
            if(url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".es"))){
                try{
                    System.out.println("***RED LOCAL***");

                    InetAddress localNet = InetAddress.getByName(url);
                    System.out.println("IP: " + localNet.getHostAddress());
                    System.out.println("Nombre: " + localNet.getHostName());

                }catch(UnknownHostException e){
                    System.out.println("Error: " + e);
                }
            }
        }
    }
}