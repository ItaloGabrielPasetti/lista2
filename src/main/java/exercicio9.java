package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Salario");
        double salario = sc.nextDouble();

        System.out.println("anos de casa");
        int anosCasa = sc.nextInt();

        double bonus;
        bonus = 0;

        if (anosCasa <= 1)
        {
            System.out.println("Não tem bonus");
        }
        else
        {
            if (anosCasa <= 3)
            {
                bonus = 1.5;
            }
            else if (anosCasa <= 10)
            {
                bonus = 1.10;
            }
            else
            {
                bonus = 1.15;
            }
        }
        double valorComBonus = salario * bonus;
        double valorTotal = salario + valorComBonus;

        System.out.println("Voce ganhou um bonus de: " + bonus);
        System.out.println("Seu salario final fica: " + valorTotal);
    }

}

