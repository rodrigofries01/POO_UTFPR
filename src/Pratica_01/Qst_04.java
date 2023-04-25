package Pratica_01;

import java.util.Scanner;

/*
* Faça um programa em Java que lê dois números inteiros n e m,
*  e depois imprima na saída padrão o resultado da soma e da subtração de n e m.
*  Segue abaixo o formato da saída esperada, considerando n=10 e m=5:

soma = 15
subtracao = 5

Dicas:
 - Sugestão de nome da classe: Numeros.
 - Usar Scanner para ler da entrada padrão.
 - Usar System.out.println() para imprimir na saída padrão.
 - O operador de concatenação do Java é +
    - exemplo: "soma = " + var_valor
* */
public class Qst_04 {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);

    int m = entrada.nextInt();
    int n = entrada.nextInt();

    int soma = m + n;
    int sub = m - n;

    System.out.println("soma = " + soma);
    System.out.println("subtração = " + sub);
  }
}
