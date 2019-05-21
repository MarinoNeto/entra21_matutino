package Exercícios;

import javax.swing.JOptionPane;

public class Exercício9 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
		int indice1 = 0, indice2= 0, contagem = 0, qtdNeg = 0, qtdPos = 0, qtdPar = 0, qtdImpar = 0;
		indice1 = n1;
		indice2 = n2;
		
		if(indice1 < indice2) {
			
			int indice=indice1;
			
			while(indice <= indice2) {
				
			}
			
		}else {
			int indice=indice2;
			
			while(indice >= indice1) {
				
			}
			
		}
		
		
		while (indice1 != indice2) {
			if(( indice1 >0) && (indice2 >0)) {
				qtdPos++;
			}else if((indice1<0) && (indice2 <0)) {
				qtdNeg++;
			}
			if((indice1 %2 == 0) && (indice2 %2 ==0)) {
				qtdPar++;
			}else if((indice1 %2 != 0) && 
					
					(indice2 %2 != 0 )) {
				qtdImpar++;
			}
			JOptionPane.showMessageDialog(null, (indice1 + 1)+" "+(indice2 - 1));
			indice1++;
			indice2--;
		}
		JOptionPane.showMessageDialog(null, "Numeros Positivos = "+qtdPos+ "\nNumeros Negativos = "+qtdNeg);
		JOptionPane.showMessageDialog(null, "Numeros Pares = "+qtdPar+ "\nNumeros Impares = "+qtdImpar);
	}

}
