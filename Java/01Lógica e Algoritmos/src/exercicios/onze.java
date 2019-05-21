package exercicios;

import javax.swing.JOptionPane;

public class onze {

	public static void main(String[] args) {
		/*  Crie um algoritmo onde o usuário irá informar quatro notas e a quantidade de faltas, após informada as quatro notas deverão ser informadas sua média e sua situação. 
		Média Faltas 1 á 5 = Reprovado Caso as faltas ultrapassem 15 o aluno está reprovado, independente da média obtida. 5,1 à 6,9 = Em Exame
				 7,0 à 8,9 = Bom 9 à 9,9 = Ótimo 10 = Parabéns 
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
	    	JOptionPane.showMessageDialog(null, "Ótimo \n"+(nota1+nota2+nota3+nota4)/4);
	    	
	  }else if ((faltas <= 15) && (((nota1+nota2+nota3+nota4)/4)==10)) {
		    JOptionPane.showMessageDialog(null, "Parabéns \n"+(nota1+nota2+nota3+nota4)/4);
		    
	  }else{
		    JOptionPane.showMessageDialog(null, "Reprovado \n"+(nota1+nota2+nota3+nota4)/4);
		 
		 	   
		   }
	    }
}
