package exercicios;

import javax.swing.JOptionPane;

public class cinco {

	public static void main(String[] args) {
		/* 5. Levando em considera��o o calend�rio de 2018, m�s fevereiro. 
		Crie um algoritmo onde o usu�rio deve digitar um dia qualquer, caso esse dia seja 
		um s�bado ou um domingo dever� retornar: Final de semana, caso contr�rio dever� retornar: Dia de semana.  
		Tente realizar valida��es como por exemplo: Se o usu�rio digitar um n�mero menor que 1 ou um 
		n�mero maior que 28 retornar: Data inv�lida.  */
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dia do m�s de Fevereiro/2018"));
		
		if ((dia > 28) || (dia < 1)) {
			JOptionPane.showMessageDialog(null,"Data inv�lida");
			
		} if ((dia == 2) || (dia == 3) || (dia == 9) || (dia == 10) || (dia == 16) || (dia == 17) || (dia == 23) || (dia == 24)) {
			JOptionPane.showMessageDialog(null, "Final de semana");
		} else {JOptionPane.showMessageDialog(null, "Dia de semana");
		
		}

		
	

	
	}

}
