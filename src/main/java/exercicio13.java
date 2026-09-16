package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro Numero");
        double n1 = sc.nextDouble();

        System.out.println("Segundo nNumero");
        double n2 = sc.nextDouble();

        System.out.println("Opção");
        int opção = sc.nextInt();

        switch (opção) {
            case 1 -> System.out.println("Adição " + (n1 + n2));
            case 2 -> System.out.println("Subtração " + (n1 - n2));
            case 3 -> System.out.println("Multiplicação " + (n1 * n2));
            case 4 ->
            {
                if (n2 == 0)
                {
                    System.out.println("Divisão Imposssivel");
                }
                else
                {
                    System.out.println("Divisão " + (n1 / n2));
                }
            }
            default -> System.out.println("Opção Invalida");
        }
    }
}
