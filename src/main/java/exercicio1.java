package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("N?");
        int n = sc.nextInt();

        int i = 1;

        if (n <= 1)
        {
            System.out.println("Valor invalido");
        }
        else
        {
            while (i <= n)
            {
                System.out.println(i);
                i++;
            }
        }
    }
}

