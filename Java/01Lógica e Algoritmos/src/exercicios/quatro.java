package exercicios;

import javax.swing.JOptionPane;

public class quatro {

	public static void main(String[] args) {
		/* 4. Desenvolva um algoritmo onde o usu�rio informar tr�s dados: Nome de um produto, 
		valor e forma de pagamento. Vamos supor que os dados foram: Celular, 800, � vista. 	 
		Ap�s informados os tr�s dados dever� ser realizada a seguinte verifica��o: 
	    Caso o produto tenha o valor superior � R$500,00 e a forma de pagamento for � vista dever� 
	    ser dado um desconto de 10%, caso contr�rio n�o haver� desconto. 		 
		Ao t�rmino da captura das informa��es e do poss�vel desconto dever� ser exibida uma frase 
		como por exemplo: O produto celular custar� R$ 720.*/
		
		String produto = JOptionPane.showInputDialog("Qual o Produto?");
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor?"));
		String formapagamento = JOptionPane.showInputDialog("Qual a forma de pagamento");
		
		if ((formapagamento.equals("a vista")) && (valor > 500)) {
			JOptionPane.showMessageDialog(null,"Voc� obteve um desconto de 10%: R$ "+(valor*0.90));
				
			
			
		} else { JOptionPane.showMessageDialog(null, "Voc� n�o obteve desconto: R$ "+(valor));
		
		}
		}
		
		
			
				
	}


