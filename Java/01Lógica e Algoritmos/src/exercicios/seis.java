package exercicios;

import javax.swing.JOptionPane;

public class seis {

	public static void main(String[] args) {
		/* 6. Fa�a um algoritmo onde o usu�rio dever� digitar dois n�meros, 
		caso os dois n�meros sejam iguais dever� ser realizada a soma, 
		caso contr�rio dever� ser realizado a multiplica��o. 
		N�o se esque�a de exibir o resultado ap�s obtido os dois n�meros */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um outro n�mero"));
		
		if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, +(numero1+numero2));
			
		}	else JOptionPane.showMessageDialog(null, +(numero1*numero2)); {
		}	
		
	}

	
		
	}


