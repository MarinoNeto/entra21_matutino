package exercicios;

import javax.swing.JOptionPane;

public class oito {

	public static void main(String[] args) {
		/* Desenvolva uma calculadora simples, o usuário irá informar dois números e uma operação 
		 (soma, subtração, divisão e multiplicação), após informado esses três dados deverá ser exibido o resultado. */

		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número para o cálculo"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número para o cálculo"));
	    String operacao = JOptionPane.showInputDialog(null, "Informe uma operação");
	    
	    if (operacao == "soma") {
	    	JOptionPane.showMessageDialog(null, (numero1+numero2));
	    
	    } else if (operacao == "subtração") {
	    	JOptionPane.showMessageDialog(null, (numero1-numero2));
	    
	    } else if (operacao == "divisão") {
	    	JOptionPane.showMessageDialog(null, (numero1/numero2));
	    	
	    } else if (operacao == "multiplicação") {
	    	JOptionPane.showMessageDialog(null, (numero1*numero2));
	    }	
	    }
	    
	    	
	    	
	    
		
	}


