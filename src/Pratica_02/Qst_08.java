package Pratica_02;

/*
* Faça um programa Java que leia uma quantidade desconhecida
*  de números positivos e conte quantos deles estão
* nos seguintes intervalos: [0,25], [26,50], [51,75] e [76,100].

A entrada de dados deve terminar quando for lido um número negativo.
* */

import java.util.Scanner;

public class Qst_08 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int intervalo1 = 0; //[0,25]
    int intervalo2 = 0; //[26,50]
    int intervalo3 = 0; //[51,75]
    int intervalo4 = 0; //[76,100]

    while (true) {
      int numero = entrada.nextInt();
      if (numero < 0) {
        break;
      }
      if (numero >= 0 && numero <= 25) {
        intervalo1++;
      } else if (numero >= 26 && numero <= 50) {
        intervalo2++;
      } else if (numero >= 51 && numero <= 75) {
        intervalo3++;
      } else if (numero >= 76 && numero <= 100) {
        intervalo4++;
      }
    }
    System.out.println("[0,25] = " + intervalo1);
    System.out.println("[26,50] = " + intervalo2);
    System.out.println("[51,75] = " + intervalo3);
    System.out.println("[76,100] = " + intervalo4);
  }
}
