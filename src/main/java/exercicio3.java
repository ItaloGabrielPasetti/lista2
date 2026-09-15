package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("temperatura?");
        double temperatura = sc.nextDouble();

        System.out.println("umidade?");
        double umidade = sc.nextDouble();

        System.out.println("------ALERTA------");

        if (temperatura >= 38) {
            System.out.println("CALOR EXTREMO!!");
        }
        if (umidade < 30) {
            System.out.println("UMIDADE BAIXA!!");
        }

        if (temperatura >= 35 && umidade < 20) {
            System.out.println("RISCO DE QUEIMADAS!!");
        }
    }
}