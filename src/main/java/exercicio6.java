package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da compra?");
        double compra = sc.nextDouble();

        if (compra <= 199.00)
        {
            double CompraFinal = sc.nextDouble();
            double CompraFinal = compra + 24.90;

        }
        else
        {
            System.out.println("FRETE GRATIS!!!");
        }

        System.out.println("O valor da sua compra é " + CompraFinal);
    }
}
