package Pratica_03;

import java.util.Scanner;

public class Qst_02 {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int tam = entrada.nextInt();
    int[] N1 = new int[tam];
    int[] N2 = new int[tam];

    for(int i = 0; i < tam; i++){
      N1[i] = entrada.nextInt();
    }

    for(int i = 0; i < tam; i++){
      N2[i] = entrada.nextInt();
    }

    for(int i = 0; i < tam; i++){
      for(int j = 0; j < tam; j++){
        if(N1[i] == N2[j]){
          System.out.println(N1[i]);
        }
      }
    }
  }
}
