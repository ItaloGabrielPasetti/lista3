package br.com.ItaloGabrielPasetti.lista02;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;

        do {
            System.out.println("numero");
            i = sc.nextInt();

            if (i < 0 || i > 10){
                System.out.println("Valor invalido!");
            }
        } while (i < 0 || i > 10);

        System.out.println("Nota é valida");
    }
}



