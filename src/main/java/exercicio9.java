package br.com.ItaloGabrielPasetti.lista3;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tabuada;

        System.out.println(" numero de 1 a 9");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 9) {
            System.out.println("operação invalida");
        } else {

            for (tabuada = 1; tabuada <= numero; tabuada++)
            {
                for (int i = 1; i <= 10; i++)
                {
                    int muilt = tabuada * i;
                    System.out.println(tabuada + " x " + i + " = " + muilt);
                }System.out.println();

            }
        }
    }
}
