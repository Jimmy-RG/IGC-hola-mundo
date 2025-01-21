package com.auth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authenticator authenticator = new Authenticator();

        System.out.print("Ingrese usuario: ");
        String username = scanner.nextLine();
        System.out.print("Ingrese contraseña: ");
        String password = scanner.nextLine();

        if (authenticator.authenticate(username, password)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }
}
