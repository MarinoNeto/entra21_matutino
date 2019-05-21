package exercicios;

import javax.swing.JOptionPane;

public class seis {

	public static void main(String[] args) {
		/* 6. Faça um algoritmo onde o usuário deverá digitar dois números, 
		caso os dois números sejam iguais deverá ser realizada a soma, 
		caso contrário deverá ser realizado a multiplicação. 
		Não se esqueça de exibir o resultado após obtido os dois números */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um outro número"));
		
		if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, +(numero1+numero2));
			
		}	else JOptionPane.showMessageDialog(null, +(numero1*numero2)); {
		}	
		
	}

	
		
	}


