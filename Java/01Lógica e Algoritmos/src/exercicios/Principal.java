package exercicios;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {


		/* 1. Desenvolver um algoritmo onde o usu�rio dever� informar: Nome, idade e cidade onde mora. Vamos supor que os dados foram: Amanda, 25, Curitiba. 
		 
		Ap�s informados os tr�s dados dever� ser exibida uma frase concatenada como por exemplo: Ol� Amanda, voc� tem 25 anos de idade e mora em Curitiba.*/ 
		
		String nome1 = JOptionPane.showInputDialog("Qual o seu nome?");
	    int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
	    String cidade1 = JOptionPane.showInputDialog("Em que cidade voc� mora?");
	    
		String mensagem1 = "Seu nome � "+nome1;
		      mensagem1+= "\nVoc� tem "+idade1+" anos";
	     	mensagem1+= "\nVoc� mora em "+cidade1;
		
		
JOptionPane.showMessageDialog(null, mensagem1);
	    
	    
		 
	
		

	
	}

}
