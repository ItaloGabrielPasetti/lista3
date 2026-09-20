package br.com.ItaloGabrielPasetti.lista3;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double nota;
        double soma = 0;
        int apr = 0;
        int rep = 0;
        double media = 0;

        System.out.println("Quantos alunos?");
        int total = sc.nextInt();


        for (int i = 1; i <= total; i++)
        {
            System.out.println("nota do aluno " + i);
            nota = sc.nextDouble();

            soma = soma + nota;

            if (nota > 6)
            {
             apr++;
            }
            else
            {
            rep++;
            }
            media = soma / total;
        }
        System.out.println("media da sala: " + media);
        System.out.println("Alunos aprovados: " + apr);
        System.out.println("Alunos reprovados: " + rep);
    }

}
