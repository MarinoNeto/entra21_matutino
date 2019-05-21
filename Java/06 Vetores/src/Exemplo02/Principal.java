package Exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor de nomes
		String[] nomes = new String[3];
		
		//Variável Índice
		int índice = 0;
		
		//Laço While - Perguntar nome
		while(índice <3 ) {
			nomes[índice] = JOptionPane.showInputDialog((índice+1)+"º nome");
			índice++;
		}
		
		//Laço While - Exibir nomes
		índice = 0;
		while(índice < 3) {
			System.out.println((índice+1)+"º nome é: "+nomes[índice]);
			índice++;
		}

	}

}
