package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Diga o ano:");
        int ano = sc.nextInt();


        if (ano % 4 == 0 && ano % 100 != 0)
        {
            System.out.println("o ano é bissexto");
        }
        else if (ano % 400 == 0)
        {

        }
        else
        {
            System.out.println("o ano não é bissexto");
        }
    }
}
