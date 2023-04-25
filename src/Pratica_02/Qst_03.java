package Pratica_02;

/*
* Faça um programa em Java que recebe três inteiros da entrada padrão e imprime o MAIOR valor.

Observações:
 - Entrada padrão: usar classe Scanner.
 - Saída padrão: System.out.
* */

import java.util.Scanner;

public class Qst_03 {
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);

    int v1 = entrada.nextInt();
    int v2 = entrada.nextInt();
    int v3 = entrada.nextInt();

    if(v1 > v2 && v1 > v3){
      System.out.println(v1);
    } else if (v2 > v1 && v2 > v3) {
      System.out.println(v2);
    }else {
      System.out.println(v3);
    }
  }
}
