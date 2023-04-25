package Pratica_02;

/*
* Crie um programa em Java que recebe quatro valores de ponto flutuante (doubles) da entrada padrão,
*  calcula a média aritmética, e imprime na saída padrão o valor da média, com uma casa decimal.

Observações:
 - Entrada padrão: usar classe Scanner.
 - Saída padrão: System.out.
* */

import java.util.Scanner;

public class Qst_01 {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);

    float v1 = entrada.nextFloat();
    float v2 = entrada.nextFloat();
    float v3 = entrada.nextFloat();
    float v4 = entrada.nextFloat();

    float result = (v1 + v2 + v3 + v4) / 4;

    System.out.println(result);
  }
}
