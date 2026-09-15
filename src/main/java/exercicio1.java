package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga sua idade");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("pode votar!");
        }

        if (idade >= 18) {
            System.out.println("pode dirigir");
        }

        if (idade >= 60) {
            System.out.println("é idoso");
        }

    }

}
