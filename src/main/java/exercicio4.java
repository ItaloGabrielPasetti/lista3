package br.com.ItaloGabrielPasetti.lista3;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        int numero;

        do
        {
            System.out.println("Escolha uma opção: 1 (dobro), 2 (metade), 3 (quadrado), 0 (sair)");
            opcao = sc.nextInt();

            switch (opcao)
            {
                case 1:

                    System.out.println("digite um numero");
                    numero = sc.nextInt();
                    System.out.println("dobro " + numero * 2);
                    break;

                case 2:

                    System.out.println("Digite um numero");
                    numero = sc.nextInt();
                    System.out.println("metade " + numero / 2);
                    break;

                case 3:

                    System.out.println("Digite um numero");
                    numero = sc.nextInt();
                    System.out.println("quadrado " + numero * numero);
                    break;

                case 0:
                    System.out.println("saindo... :(");
                    break;

                default:
                    System.out.println("opção invalida");
            }
        }
        while (opcao != 0) ;
    }
}
