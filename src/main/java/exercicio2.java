
package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("diga seu numero inteiro");
        int numero = sc.nextInt();

        int numeroFinal = Math.abs(numero);

        if (numero > 0) {
            System.out.println("é positivo");
        }
        if (numero % 2 == 0) ;
        {
            System.out.println("é par");
        }

        if (numero % 5 == 0) {
            System.out.println("é multiplo por 5");
        }

        if (numeroFinal >= 10 && numeroFinal  <= 99) {
            System.out.println("tem dois digitos");
        }

    }
}