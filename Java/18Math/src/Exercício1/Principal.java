package Exercício1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	int continuar;
		do {
		int operação = Integer.parseInt(JOptionPane.showInputDialog("Digite o número correspondente à operação para efetua-la:\n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão \n 5-Seno \n 6-Cosseno \n 7-Tangente \n 8-Log \n 9-Raiz Quadrada \n 10-Raíz Cúbica"));
		if(operação == 1) {
			int Soma1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
			int Soma2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		int TotSoma = Soma1 + Soma2;
		JOptionPane.showMessageDialog(null, "O resultado da soma é "+TotSoma);
		}else if(operação ==2) {
			int Subtraçao1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
			int Subtraçao2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		int TotSubtraçao = Subtraçao1 - Subtraçao2;
		JOptionPane.showMessageDialog(null, "O resultado da subtração é "+TotSubtraçao);
		}else if(operação ==3) {
			int Multiplicaçao1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
			int Multiplicaçao2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		int TotMultiplicaçao = Multiplicaçao1 * Multiplicaçao2;
		JOptionPane.showMessageDialog(null, "O resultado da subtração é "+TotMultiplicaçao);
		}else if(operação ==4) {
			int Divisão1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
			int Divisão2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		int TotDivisão = Divisão1 / Divisão2;
		JOptionPane.showMessageDialog(null, "O resultado da subtração é "+TotDivisão);
		}else if(operação ==5) {
			int Seno1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto oposto"));
			int Seno2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da hipotenusa"));
		int Seno = Seno1 / Seno2;
		JOptionPane.showMessageDialog(null, "O seno é "+Seno);
		}else if(operação ==6) {
			int Cosseno1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto adjacente"));
			int Cosseno2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da hipotenusa"));
		int Cosseno = Cosseno1 / Cosseno2;
		JOptionPane.showMessageDialog(null, "O cosseno é "+Cosseno);
		}else if(operação ==7) {
			int Tangente1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto oposto"));
			int Tangente2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto adjacente"));
		int Tangente = Tangente1 / Tangente2;
		JOptionPane.showMessageDialog(null, "A tangente é "+Tangente);
		}else if(operação ==8) {
			double Log1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o logaritmando"));
			JOptionPane.showMessageDialog(null, "O logaritmo é: "+Math.log10(Log1));		
		}else if(operação ==9) {
			double 	Quad = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			JOptionPane.showMessageDialog(null, "A raiz quadrada dele é: "+Math.sqrt(Quad));		
		}else if(operação ==10) {
			double 	Cub = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			JOptionPane.showMessageDialog(null, "A raiz cúbica dele é: "+Math.cbrt(Cub));		
		}
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja um novo cálculo? Digite '1' para continuar, ou '2' para encerrar"));
		
	}while(continuar != 2);
		
		JOptionPane.showMessageDialog(null, "Tenha um bom dia");
		
		}
		

}
