package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Usuario: ");
        String usuario = sc.next();

        if (usuario.equals("admin")) {

            System.out.println("digite a senha");
            String senha = sc.next();

            if (senha.equals("java123")) {
                System.out.println("Acesso Liberado");
            } else {
                System.out.println("Acesso negado");
            }
        } else {
            System.out.println("Usuario não encontrado");
        }
    }
}

