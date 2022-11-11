package exercitando;

import java.util.Scanner;

public class SomandoMultiplos {

	public static void main(String[] args) {

		int A, N;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um numero:");
        A = input.nextInt();
        System.out.println("Informe um limite:");
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        for(int i =1; i <= N; i++) {
          if(i % A == 0) {
            soma += i;
          }
        }
        
       System.out.println("A soma dos multiplos de " + A + " com limite " + N + " e igual a: "+ soma);

	}

}
