package exercicios;

import javax.swing.JOptionPane;

public class dez {

	public static void main(String[] args) {
		/*10. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado, em reais. 
		 
		Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real. 
		 
		EXEMPLO Moeda Quantidade R$ 0,01 1 R$ 0,05 1 R$ 0,10 1 R$ 0,25 1 R$ 0,50 1 R$ 1,00 1 
		 
		Após informada a quantidade de cada moeda deverá exibir o total, utilizando o exemplo repassado o total é de: R$1,91. 
*/
		
		double moedasde1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 1 centavos"));
		double moedasde5 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 5 centavos"));
		double moedasde10 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 10 centavos"));          
		double moedasde25 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 25 centavos"));
		double moedasde50 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 50 centavos"));
		double moedasde100 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 1 real"));

		JOptionPane.showMessageDialog(null, "R$ "+(((moedasde1*1)+(moedasde5*5)+(moedasde10*10)+(moedasde25*25)+(moedasde50*50)+(moedasde100*100))/100));
	
	}

}
