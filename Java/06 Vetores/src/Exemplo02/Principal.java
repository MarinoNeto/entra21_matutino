package Exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor de nomes
		String[] nomes = new String[3];
		
		//Vari�vel �ndice
		int �ndice = 0;
		
		//La�o While - Perguntar nome
		while(�ndice <3 ) {
			nomes[�ndice] = JOptionPane.showInputDialog((�ndice+1)+"� nome");
			�ndice++;
		}
		
		//La�o While - Exibir nomes
		�ndice = 0;
		while(�ndice < 3) {
			System.out.println((�ndice+1)+"� nome �: "+nomes[�ndice]);
			�ndice++;
		}

	}

}
