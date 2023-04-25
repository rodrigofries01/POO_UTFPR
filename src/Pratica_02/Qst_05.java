package Pratica_02;

/*
* Faça um programa em Java que receba da entrada padrão um inteiro n>0
* e imprima na saída padrão os números de n...1 (ordem decrescente).
* */

import java.util.Scanner;

public class Qst_05 {
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);

    int num = entrada.nextInt();

    for (int i = num; i >= 1; i--){
      System.out.println(i + " ");
    }
  }
}
