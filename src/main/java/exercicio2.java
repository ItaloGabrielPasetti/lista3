package br.com.ItaloGabrielPasetti.lista3;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero?");
        int numero = sc.nextInt();

        int i = 1;

        while (i <= 10)
        {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}
