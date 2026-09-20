package br.com.ItaloGabrielPasetti.lista3;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int va;
        int quant = 0;
        int soma = 0;
        int ma = 0;
        int me = 0;

        System.out.println("Diga um Valor (0 sai) ");
        va = sc.nextInt();

        while (va != 0) {

            if (quant == 0) {
                ma = va;
                me = va;
            } else {
                if (va > ma) {
                    ma = va;
                }
                if (va < me) {
                    me = va;
                }

            }
            quant++;
            soma = soma + va;

            System.out.println("Diga um Valor (0 sai) ");
            va = sc.nextInt();
        }
        if (quant == 0)
        {
            System.out.println("nenhum valor aí ");
        }
        else
        {
            System.out.println("soma " + soma);
            System.out.println("maior " + ma);
            System.out.println("menor " + me);
        }
    }
}
