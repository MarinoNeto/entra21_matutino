package Exerc�cio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	int continuar;
		do {
		int opera��o = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero correspondente � opera��o para efetua-la:\n 1-Soma \n 2-Subtra��o \n 3-Multiplica��o \n 4-Divis�o \n 5-Seno \n 6-Cosseno \n 7-Tangente \n 8-Log \n 9-Raiz Quadrada \n 10-Ra�z C�bica"));
		if(opera��o == 1) {
			int Soma1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			int Soma2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		int TotSoma = Soma1 + Soma2;
		JOptionPane.showMessageDialog(null, "O resultado da soma � "+TotSoma);
		}else if(opera��o ==2) {
			int Subtra�ao1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			int Subtra�ao2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		int TotSubtra�ao = Subtra�ao1 - Subtra�ao2;
		JOptionPane.showMessageDialog(null, "O resultado da subtra��o � "+TotSubtra�ao);
		}else if(opera��o ==3) {
			int Multiplica�ao1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			int Multiplica�ao2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		int TotMultiplica�ao = Multiplica�ao1 * Multiplica�ao2;
		JOptionPane.showMessageDialog(null, "O resultado da subtra��o � "+TotMultiplica�ao);
		}else if(opera��o ==4) {
			int Divis�o1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
			int Divis�o2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		int TotDivis�o = Divis�o1 / Divis�o2;
		JOptionPane.showMessageDialog(null, "O resultado da subtra��o � "+TotDivis�o);
		}else if(opera��o ==5) {
			int Seno1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto oposto"));
			int Seno2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da hipotenusa"));
		int Seno = Seno1 / Seno2;
		JOptionPane.showMessageDialog(null, "O seno � "+Seno);
		}else if(opera��o ==6) {
			int Cosseno1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto adjacente"));
			int Cosseno2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida da hipotenusa"));
		int Cosseno = Cosseno1 / Cosseno2;
		JOptionPane.showMessageDialog(null, "O cosseno � "+Cosseno);
		}else if(opera��o ==7) {
			int Tangente1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto oposto"));
			int Tangente2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do cateto adjacente"));
		int Tangente = Tangente1 / Tangente2;
		JOptionPane.showMessageDialog(null, "A tangente � "+Tangente);
		}else if(opera��o ==8) {
			double Log1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o logaritmando"));
			JOptionPane.showMessageDialog(null, "O logaritmo �: "+Math.log10(Log1));		
		}else if(opera��o ==9) {
			double 	Quad = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
			JOptionPane.showMessageDialog(null, "A raiz quadrada dele �: "+Math.sqrt(Quad));		
		}else if(opera��o ==10) {
			double 	Cub = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero"));
			JOptionPane.showMessageDialog(null, "A raiz c�bica dele �: "+Math.cbrt(Cub));		
		}
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja um novo c�lculo? Digite '1' para continuar, ou '2' para encerrar"));
		
	}while(continuar != 2);
		
		JOptionPane.showMessageDialog(null, "Tenha um bom dia");
		
		}
		

}
