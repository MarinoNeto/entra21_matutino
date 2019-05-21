package exercicios;

import javax.swing.JOptionPane;

public class dois {

	public static void main(String[] args) {


		// 2. Desenvolver um algoritmo onde o cliente irá informar um valor pago por determinado produto, em seguida exibir esse valor com desconto de 10%.

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor?"));
		System.out.println("Seu valor com desconto é "+valor*0.90);
		
	}

}
