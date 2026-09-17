package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de veículo (1 para Carro, 2 para Moto): ");
        int tipoV = sc.nextInt();

        double tarifa = 0.0;
        boolean veiculoV = true;

        switch (tipoV)
        {
            case 1 -> tarifa = 8.00;
            case 2 -> tarifa= 5.00;
            default ->
            {
                System.out.println("opção inválida");
                veiculoV= false;
            }
        }


        if (veiculoV) {


            System.out.print("Digite a quantidade de horas: ");
            int horas = sc.nextInt();

            double valorT = horas * tarifa;


            System.out.print("Possui cupom de desconto? (sim/nao): ");
            String Cupom = sc.next();

            if (Cupom.equalsIgnoreCase("sim"))
            {

                if (valorT >= 50.00)
                {
                    valorT = valorT * 0.80;
                    System.out.println("Desconto de 20%");
                }
                else
                {
                    System.out.println("vale apenas de 50,00 pra cima");
                }
            }


            if (horas > 12)
            {
                System.out.println("ta com tempo, hein?");
            }
            if (horas > 24)
            {
                System.out.println("tem casa não?");
            }
            if (horas <= 2)
            {
                System.out.println("permanência curta.");
            }
            else if (horas <= 6)
            {
                System.out.println("permanência média.");
            }
            else
            {
                System.out.println("permanência longa.");
            }


            System.out.printf("Valor final a pagar:  R$ %.2f%n ", valorT);
        }
    }
}

