package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("que horas são?");
        int horas = sc.nextInt();

        if (horas <= 11)
        {
            System.out.println("Bom Dia ;)");
        }
        else if (horas >= 12 && horas <= 17)
        {
            System.out.println("Boa tarde ;)");
        }
        else if (horas >= 18 && horas <= 23)
        {
            System.out.println("Boa Noite ;)");
        }
        else
        {
            System.out.println("Hora Invalida _|_");
        }

    }
}


