package Exemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Vetor de números
		int[] numeros = new int[10];
		
		//Scanner
		Scanner obterNumero = new Scanner(System.in);
		
		//Laço FOR
		for(int indice = 0; indice < numeros.length; indice++) {
			System.out.println("Informe o "+(indice+1)+"º número");
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

