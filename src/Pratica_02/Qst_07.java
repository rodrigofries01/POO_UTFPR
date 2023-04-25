package Pratica_02;

/*
* Faça um programa em Java que recebe um código da entrada padrão (número inteiro) que representa uma das seguintes opções de atendimento em uma agência bancária:

1 - Caixa
2 - Financiamento
3 - Empréstimo
4 - Produtor Rural
5 - Abertura de Contas
6 - Falar com o Gerente

O programa deve imprimir na saída padrão o texto da opção selecionada, usando a formatação "código" - "texto da opção".

Caso o código lido não corresponda a uma das opções acima, imprimir "X - Opção Inexistente", em que X é o código de entrada informado.

Observe os exemplos abaixo:
* */

import java.util.Scanner;

public class Qst_07 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int codigo = entrada.nextInt();
    String textoDaOpcao = switch (codigo) {
      case 1 -> "Caixa";
      case 2 -> "Financiamento";
      case 3 -> "Empréstimo";
      case 4 -> "Produtor Rural";
      case 5 -> "Abertura de Contas";
      case 6 -> "Falar com o Gerente";
      default -> "Opção Inexistente";
    };
    System.out.println(codigo + " - " + textoDaOpcao);
  }
}
