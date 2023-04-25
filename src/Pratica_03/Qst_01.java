package Pratica_03;

/*
* Faça um programa em Java que leia um
* número inteiro N > 1
* da entrada padrão, e a seguir leia N
* valores inteiros e armazene em um vetor.

Na sequência calcule a média aritmética desses
* valores e imprima na saída padrão a média
* calculada (com duas casas decimais) e, nas
* linhas seguintes, somente os valores maiores
* que a média calculada.

Imprima os valores maiores que a média
* calculada na ordem em que foram inseridos no
* vetor.

Dica:
 - No Java é possível formatar a saída impressa
 *  com a instrução printf.
 - Exemplo: System.out.printf("%.2f\n", media);
* */

import java.util.Scanner;

public class Qst_01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int N = entrada.nextInt();
    int[] num = new int[N];
    double soma = 0;

    for (int i = 0; i < N; i++) {
      num[i] = entrada.nextInt();
    }

    for (int i = 0; i < N; i++) {
      soma += num[i];
    }

    double media = soma / N;
    System.out.printf("%.2f\n", media);

    for (int i = 0; i < N; i++) {
      if (num[i] > media) {
        System.out.println(num[i]);
      }
    }
  }
}