package Exerc�cio2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Vari�veis
		int LimiteMinimo = 0;
		int LimiteMaximo = 100;
		int NewTry;
	
	//Gerar n�mero aleat�rio
		double NumRandom = Math.random();
		
		//Atribuir um n�mero de 0 a 100
		int numero = (int) Math.round(LimiteMinimo+NumRandom*LimiteMaximo);
		System.out.println(numero);
		//Tentar palpite
		int palpite = Integer.parseInt(JOptionPane.showInputDialog("Um n�mero aleat�rio de 0 a 100 foi gerado, tente acert�-lo inserindo um n�mero abaixo"));
		int diferen�a = numero - palpite;
		int qtdPalp = 0;
		if(palpite = ) {
			JOptionPane.showMessageDialog(null, "est� perto...");
		}else if((diferen�a>10) && (diferen�a <=20)) {
			JOptionPane.showMessageDialog(null, "est� longe...");
		}else if(diferen�a >20 ) {
			JOptionPane.showMessageDialog(null, "Ihhh! Muito longe");
		}
		do {
		diferen�a = 0;
		qtdPalp++;	
		NewTry =Integer.parseInt(JOptionPane.showInputDialog("Tente novamente"));
		diferen�a = numero - palpite;
			if(diferen�a <=10 ) {
			JOptionPane.showMessageDialog(null, "est� perto...");
		}else if((diferen�a>10) && (diferen�a <=20)) {
			JOptionPane.showMessageDialog(null, "est� longe...");
		}else if(diferen�a >20 ) {
			JOptionPane.showMessageDialog(null, "Ihhh! Muito longe");
		}
	}while(palpite != numero);
		
	//N�o concluido	
	}

}
