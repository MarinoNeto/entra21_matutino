package Exemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Vetor de n�meros
		int[] numeros = new int[10];
		
		//Scanner
		Scanner obterNumero = new Scanner(System.in);
		
		//La�o FOR
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Informe o "+(indice+1)+"� n�mero");
			numeros[indice] = obterNumero.nextInt();
		}
		
		//Finalizar Scanner
		obterNumero.close();
		
		//Listar os valores FOREACH
		for(int n : numeros) {
			System.out.println(n);
		}
		
	}

}

