package exercicios;

import javax.swing.JOptionPane;

public class tres {

	public static void main(String[] args) {
		
		/* 3. Crie um algoritmo onde o usuário irá informar quatro notas, após informada as quatro 
		      notas deverá ser informada sua média e sua situação. 
		      Média Situação 7,0 à 10 Aprovado 5,0 à 6,9 Em Exame 0 à 4,9 Reprovado*/
 
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informa sua segunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informa sua terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informa sua quarta nota"));
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		JOptionPane.showMessageDialog(null,"Sua média é "+media);
		
		
	}

}
