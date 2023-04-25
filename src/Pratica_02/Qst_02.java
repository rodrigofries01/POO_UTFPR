package Pratica_02;

/*
* Faça um programa em Java que recebe da entrada padrão um valor ponto flutuante
*  e imprime na saída padrão o mesmo valor, porém convertido para inteiro (operação de casting).
* */

import java.util.Scanner;

public class Qst_02 {
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);

    float pontoFlutuante = entrada.nextFloat();
    int inteiro = (int) pontoFlutuante;

    System.out.println(inteiro);
  }
}
