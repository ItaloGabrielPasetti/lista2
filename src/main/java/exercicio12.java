package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Saldo da Conta");
        int saldo = sc.nextInt();

        System.out.println("Limite diario");
        int limite = sc.nextInt();

        System.out.println("Valor solicitado");
        int valorsolicitado = sc.nextInt();

        if (saldo > valorsolicitado)
        {
            if (valorsolicitado > limite)
            {
                System.out.println("O valor ultrapassa o limite diario!");
            }
            else
            {
                System.out.println("Saldo realizado com sucesso!!");
            }
        }
        else
        {
            System.out.println("Saldo insuficiente");
        }
    }
}
