package exercitando;

import java.util.Scanner;


public class ComparaNumeros {

	public static void main(String[] args) {

		//TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner leitor = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Informe um numero:");
        a = leitor.nextInt();
        System.out.println("Informe outro numero:");
        b = leitor.nextInt();        
        
        if(a==b) {
            System.out.println("Sao iguais!");
        } else {           
            System.out.println("Nao sao iguais!");
        }
	}

}
