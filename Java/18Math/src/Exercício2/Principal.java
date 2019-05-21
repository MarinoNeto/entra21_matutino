package Exercício2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Variáveis
		int LimiteMinimo = 0;
		int LimiteMaximo = 100;
		int NewTry;
	
	//Gerar número aleatório
		double NumRandom = Math.random();
		
		//Atribuir um número de 0 a 100
		int numero = (int) Math.round(LimiteMinimo+NumRandom*LimiteMaximo);
		System.out.println(numero);
		//Tentar palpite
		int palpite = Integer.parseInt(JOptionPane.showInputDialog("Um número aleatório de 0 a 100 foi gerado, tente acertá-lo inserindo um número abaixo"));
		int diferença = numero - palpite;
		int qtdPalp = 0;
		if(palpite = ) {
			JOptionPane.showMessageDialog(null, "está perto...");
		}else if((diferença>10) && (diferença <=20)) {
			JOptionPane.showMessageDialog(null, "está longe...");
		}else if(diferença >20 ) {
			JOptionPane.showMessageDialog(null, "Ihhh! Muito longe");
		}
		do {
		diferença = 0;
		qtdPalp++;	
		NewTry =Integer.parseInt(JOptionPane.showInputDialog("Tente novamente"));
		diferença = numero - palpite;
			if(diferença <=10 ) {
			JOptionPane.showMessageDialog(null, "está perto...");
		}else if((diferença>10) && (diferença <=20)) {
			JOptionPane.showMessageDialog(null, "está longe...");
		}else if(diferença >20 ) {
			JOptionPane.showMessageDialog(null, "Ihhh! Muito longe");
		}
	}while(palpite != numero);
		
	//Não concluido	
	}

}
