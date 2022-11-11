package exercitando;

import java.util.Scanner;

public class FizzBuzz {
	/*
	 * Neste desafio, você terá que criar uma função que
	 * faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz
	 * 
	 * Você receberá um número onde: 
	 * Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
	 * Se o número for apenas múltiplo de 3 -> "Fizz" ; 
	 * Se o número for apenas múltiplo de 5 -> "Buzz"; 
	 * Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 
	*/

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		System.out.println("Digite um numero: ");
        int num = number.nextInt();

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.
        if(num%3 == 0 && num%5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num%3 == 0) {
            System.out.println("Fizz");
        } else if (num%5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

	}

}
