package exercitando;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		//TODO: Imprima o somatório de N (utilize o método "somatorio").
		System.out.println("Informe um numero:");
        int n;
        int somatorio = 0;
        n = numero.nextInt();
        for(int i = 0; i  < n; i++) {
           somatorio = Somatorio.somatorio(n);
        }
        
        System.out.println("O somatorio descrecente de " + n + " e igual a: " + somatorio);

	}
	
	/**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }

}
