package Exerc�cios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exerc�cio8 {

	public static void main(String[] args) {
	
		/* //Scanner
		Scanner armazenarNumero = new Scanner(System.in);
		
		//Obter um n�mero
		System.out.println("Informe um n�mero");
		int numero = armazenarNumero.nextInt();
		
		//Vari�veis
		int indice=numero;
		int total=0;
		
		//La�o
		while(indice > 1) {
			
			//Condicional
			if(indice == numero) {
				total = numero*(indice-1);
				System.out.println(numero+" X "+(indice-1)+" = "+total);
			}else{
				System.out.println(total+" X "+(indice-1)+" = "+(total*(indice-1)));
				total = total*(indice-1);
			}
			
			//Decrementar
			indice--;
			
		} */
		
		
		
		
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero"));
			int indice = numero, total = 0;
			
				while(indice > 1) {
					if(indice == numero) {
						total = numero*(indice - 1);
						JOptionPane.showMessageDialog(null, numero+" X "+(indice-1)+" = "+ total);
					}else {
						JOptionPane.showMessageDialog(null, total+" X "+(indice-1)+" = "+(total*(indice-1)));
					}
					indice--;
				}
				
				//Concluido
			
			
			
			
			
			

	}

}
