package exercicios;

import javax.swing.JOptionPane;

public class tres {

	public static void main(String[] args) {
		
		/* 3. Crie um algoritmo onde o usu�rio ir� informar quatro notas, ap�s informada as quatro 
		      notas dever� ser informada sua m�dia e sua situa��o. 
		      M�dia Situa��o 7,0 � 10 Aprovado 5,0 � 6,9 Em Exame 0 � 4,9 Reprovado*/
 
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informa sua segunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informa sua terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informa sua quarta nota"));
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		JOptionPane.showMessageDialog(null,"Sua m�dia � "+media);
		
		
	}

}
