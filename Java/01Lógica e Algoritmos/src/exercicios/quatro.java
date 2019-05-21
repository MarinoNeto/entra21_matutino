package exercicios;

import javax.swing.JOptionPane;

public class quatro {

	public static void main(String[] args) {
		/* 4. Desenvolva um algoritmo onde o usuário informar três dados: Nome de um produto, 
		valor e forma de pagamento. Vamos supor que os dados foram: Celular, 800, à vista. 	 
		Após informados os três dados deverá ser realizada a seguinte verificação: 
	    Caso o produto tenha o valor superior à R$500,00 e a forma de pagamento for à vista deverá 
	    ser dado um desconto de 10%, caso contrário não haverá desconto. 		 
		Ao término da captura das informações e do possível desconto deverá ser exibida uma frase 
		como por exemplo: O produto celular custará R$ 720.*/
		
		String produto = JOptionPane.showInputDialog("Qual o Produto?");
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor?"));
		String formapagamento = JOptionPane.showInputDialog("Qual a forma de pagamento");
		
		if ((formapagamento.equals("a vista")) && (valor > 500)) {
			JOptionPane.showMessageDialog(null,"Você obteve um desconto de 10%: R$ "+(valor*0.90));
				
			
			
		} else { JOptionPane.showMessageDialog(null, "Você não obteve desconto: R$ "+(valor));
		
		}
		}
		
		
			
				
	}


