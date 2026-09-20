package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n1;
        int n2;
        int soma = 0;
        int i;

        System.out.println("primeiro numero");
        n1 = sc.nextInt();

        System.out.println("segundo numero");
        n2 = sc.nextInt();


        if (n1 > n2)
        {
            System.out.println("invalido");
        }
        else
        {
            for (i = n1; i <= n2; i++)
            {
                if (i % 2 == 0)
                {
                    soma = soma + i;
                }
            }
            System.out.println("soma é " + soma);
        }
    }
}


