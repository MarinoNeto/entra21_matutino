package Exercício1;

import javax.swing.JOptionPane;

public class Principal {
//charAt
	
	
	public static void main(String[] args) {
		
		//Informando a frase
		String frase = JOptionPane.showInputDialog("Informe uma palavra ou frase");
		
		
		
		
		//Quantificando letras
		JOptionPane.showMessageDialog(null, frase.length());
		
		//Exibindo a frase entre letras minusculas e maiusculas
		//JOptionPane.showMessageDialog(null, frase.toUpperCase());
		
		
	}

}
