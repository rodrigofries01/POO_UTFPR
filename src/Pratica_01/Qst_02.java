package Pratica_01;
import java.util.Scanner;
/*
 * Faça um programa em Java que receba um número inteiro, um número de ponto flutuante e uma palavra (String).
 * Na sequência, imprima os valores lidos na saída padrão, um valor por linha.
 * */

public class Qst_02 {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);

    int numInt = entrada.nextInt();
    float numFloat = entrada.nextFloat();
    String palavra = entrada.next();

    System.out.println(numInt);
    System.out.println(numFloat);
    System.out.println(palavra);
  }
}
