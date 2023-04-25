package Pratica_01;

/*
* aça um programa em Java que receba da entrada padrão duas strings, nome e sobrenome,
* e imprima na saída padrão a concatenação de nome e sobrenome, separados por um espaço em branco " ".

Observações:
 - Entrada padrão: usar classe Scanner.
 - Saída padrão: System.out.
* */

import java.util.Scanner;

public class Qst_05 {
  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);

    String firstName = entrada.next();
    String lastName = entrada.next();

    System.out.println(firstName + " " + lastName);
  }
}
