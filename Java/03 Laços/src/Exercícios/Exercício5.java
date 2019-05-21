package Exercícios;

import javax.swing.JOptionPane;

public class Exercício5 {

	public static void main(String[] args) {
		/* Crie um programa para uma papelaria que leia o nome e o valor de um produto. 
 
Assim que for informado o nome do produto e o valor do mesmo crie uma tabela informando a quantidade adquirida do produto (1 até 10) e o valor desse produto com desconto. 
 
A cada produto adquirido será dado 5% de desconto, em outras palavras, se for comprado um produto será dado 5% de desconto, se for comprado dois produtos 10%, três produtos 15%.... */

		int Continuar = 0; 
		
		int QtdPdt; 
		double Porc = 0, ValorF = 0, Valor = 0, ValorIn, desconto = 0;
		String Nome;
				
		Nome = JOptionPane.showInputDialog("Olá, insira o nome do produto.");
		ValorIn = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto."));
		QtdPdt = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto"));
			
			if (QtdPdt ==1) {
				Porc = (5/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==2) {
				Porc = (10/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==3) {
				Valor = ValorIn*3;
				Porc = (15/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==4) {
				Valor = ValorIn*4;
				Porc = (20/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==5) {
				Valor = ValorIn*5;
				Porc = (25/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==6) {
				Valor = ValorIn*6;
				Porc = (30/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==7) {
				Valor = ValorIn*7;
				Porc = (35/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==8) {
				Valor = ValorIn*8;
				Porc = (40/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==9) {
				Valor = ValorIn*9;
				Porc = (45/100)*Valor;
				ValorF = Valor - Porc;
			}else if (QtdPdt ==10) {
				Valor = ValorIn*10;
				Porc = (50/100)*Valor;
				ValorF = Valor - Porc;
				JOptionPane.showMessageDialog(null, "Limite atingido, resultados serão informados");
			}
		JOptionPane.showMessageDialog(null, "Produto: "+Nome+"\n Preço inicial: "+ValorIn+"\nValores com desconto: \n"+QtdPdt+" Produto(s) = "+ValorF);
		
		//Incompleto
		
	
	}
}
