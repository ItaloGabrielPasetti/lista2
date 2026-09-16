package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("diga-nos a presença do aluno em porcentagem");
        double porcentagem = sc.nextDouble();

        if (porcentagem < 75)
        {
            System.out.println("ALUNO REPROVADO!!");
        }
        else
        {
            System.out.println("Nota da primeira prova:");
            double n1 = sc.nextDouble();

            System.out.println("Nota da segunda prova");
            double n2 = sc.nextDouble();

            double Media;
            Media = n1 + n2 / 2;

            if (Media >= 7)
            {
                System.out.println("APROVADO!!");
            }
            else if (Media >= 5)
            {
                System.out.println("Em Recuperação");
            }
            else
            {
                System.out.println("Reprovado!");
            }

        }
    }
}
