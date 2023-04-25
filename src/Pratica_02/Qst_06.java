package Pratica_02;

/*
  Faça um programa em Java que lê números inteiros da entrada padrão até ler um número inteiro negativo.
  O programa deve imprimir a quantidade e a soma dos números lidos, mas não deve incluir na soma o número inteiro negativo.
  Observe a formatação usada nos exemplos de teste abaixo.
 */

import java.util.Scanner;

public class Qst_06 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int soma = 0;
    int quantidade = 0;

    while (true) {
      quantidade++;
      int num = entrada.nextInt();
      if (num < 0) {
        break;
      }
      soma += num;
    }
    System.out.println("Quantidade = " + quantidade);
    System.out.println("Soma = " + soma);
  }
}
