package Pratica_01;

/*
* Faça um programa em Java que lê um número inteiro n e imprima na saída padrão o valor de n elevado a 2 (n*n).

Dicas:
 - Sugestão de nome da classe: ImprimirQuadrado.
 - Usar Scanner para ler da entrada padrão.
 - Usar System.out.println() para imprimir na saída padrão.
* */

import java.util.Scanner;

public class Qst_03 {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);

    int num = entrada.nextInt();
    int valor = num * num;

    System.out.println(valor);
  }
}
