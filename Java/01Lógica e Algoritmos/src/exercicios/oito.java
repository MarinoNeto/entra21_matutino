package exercicios;

import javax.swing.JOptionPane;

public class oito {

	public static void main(String[] args) {
		/* Desenvolva uma calculadora simples, o usu�rio ir� informar dois n�meros e uma opera��o 
		 (soma, subtra��o, divis�o e multiplica��o), ap�s informado esses tr�s dados dever� ser exibido o resultado. */

		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero para o c�lculo"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo n�mero para o c�lculo"));
	    String operacao = JOptionPane.showInputDialog(null, "Informe uma opera��o");
	    
	    if (operacao == "soma") {
	    	JOptionPane.showMessageDialog(null, (numero1+numero2));
	    
	    } else if (operacao == "subtra��o") {
	    	JOptionPane.showMessageDialog(null, (numero1-numero2));
	    
	    } else if (operacao == "divis�o") {
	    	JOptionPane.showMessageDialog(null, (numero1/numero2));
	    	
	    } else if (operacao == "multiplica��o") {
	    	JOptionPane.showMessageDialog(null, (numero1*numero2));
	    }	
	    }
	    
	    	
	    	
	    
		
	}


