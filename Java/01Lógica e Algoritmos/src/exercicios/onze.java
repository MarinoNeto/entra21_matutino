package exercicios;

import javax.swing.JOptionPane;

public class onze {

	public static void main(String[] args) {
		/*  Crie um algoritmo onde o usu�rio ir� informar quatro notas e a quantidade de faltas, ap�s informada as quatro notas dever�o ser informadas sua m�dia e sua situa��o. 
		M�dia Faltas 1 � 5 = Reprovado Caso as faltas ultrapassem 15 o aluno est� reprovado, independente da m�dia obtida. 5,1 � 6,9 = Em Exame
				 7,0 � 8,9 = Bom 9 � 9,9 = �timo 10 = Parab�ns 
*/
		
		double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua primeira nota"));
		double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua segunda nota"));
	    double nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua terceira nota"));
	    double nota4 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua quarta nota"));
	    int faltas = Integer.parseInt(JOptionPane.showInputDialog("Informa sua quantidade de faltas"));
	    
	    if ((faltas <= 15) && ((((nota1+nota2+nota3+nota4)/4)>=5.1) && (((nota1+nota2+nota3+nota4)/4)<=6.9))) {
	    	JOptionPane.showMessageDialog(null,"Em exame\n"+(nota1+nota2+nota3+nota4)/4);
	    	
	  }else if ((faltas <= 15) && ((((nota1+nota2+nota3+nota4)/4)>=9.) && (((nota1+nota2+nota3+nota4)/4)<=9.9))) {
	 	    JOptionPane.showMessageDialog(null, "Bom \n"+(nota1+nota2+nota3+nota4)/4);
	 	    
	  }else if ((faltas <= 15) && ((((nota1+nota2+nota3+nota4)/4)>=9.) && (((nota1+nota2+nota3+nota4)/4)<=9.9))) {
	    	JOptionPane.showMessageDialog(null, "�timo \n"+(nota1+nota2+nota3+nota4)/4);
	    	
	  }else if ((faltas <= 15) && (((nota1+nota2+nota3+nota4)/4)==10)) {
		    JOptionPane.showMessageDialog(null, "Parab�ns \n"+(nota1+nota2+nota3+nota4)/4);
		    
	  }else{
		    JOptionPane.showMessageDialog(null, "Reprovado \n"+(nota1+nota2+nota3+nota4)/4);
		 
		 	   
		   }
	    }
}
