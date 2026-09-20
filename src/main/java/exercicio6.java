package br.com.ItaloGabrielPasetti.lista3;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int fag = 1;

        System.out.println("Numero?");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalido...");
        } else {
            for (int i = 1; i <= n; i++)
                fag = fag * i;
        }
        System.out.println("O Fagtorial será " + fag);
    }
}
