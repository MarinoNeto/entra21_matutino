package exercicios;

import javax.swing.JOptionPane;

public class cinco {

	public static void main(String[] args) {
		/* 5. Levando em consideração o calendário de 2018, mês fevereiro. 
		Crie um algoritmo onde o usuário deve digitar um dia qualquer, caso esse dia seja 
		um sábado ou um domingo deverá retornar: Final de semana, caso contrário deverá retornar: Dia de semana.  
		Tente realizar validações como por exemplo: Se o usuário digitar um número menor que 1 ou um 
		número maior que 28 retornar: Data inválida.  */
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dia do mês de Fevereiro/2018"));
		
		if ((dia > 28) || (dia < 1)) {
			JOptionPane.showMessageDialog(null,"Data inválida");
			
		} if ((dia == 2) || (dia == 3) || (dia == 9) || (dia == 10) || (dia == 16) || (dia == 17) || (dia == 23) || (dia == 24)) {
			JOptionPane.showMessageDialog(null, "Final de semana");
		} else {JOptionPane.showMessageDialog(null, "Dia de semana");
		
		}

		
	

	
	}

}
