package Exercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		int[] StNum = new int[10];
		int[] NdNum = new int[10];
		int indice = 0, somar, subtrair, multiplicar, divisão, resultado = 0;
			
			//Obter dados
			while (indice < 10) {
			StNum[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+"º numero do 1º vetor"));
			NdNum[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+"º numero do 2º vetor"));
			indice++;
			}
			
			//Seleção da conta
			String Calc= JOptionPane.showInputDialog("Escolha o tipo de operação, adição, subtração, multiplicação ou divisão");	
						for(int i=0; i<StNum.length; i++) {
							if(Calc.equals("adição")) {
				resultado= StNum[i] + NdNum[i];
				}else if(Calc.equals("subtração")) {
				resultado = StNum[i] - NdNum[i];
				}else if (Calc.equals("multiplicação")) {
				resultado = StNum[i] * NdNum[i];			
				}else if (Calc.equals("divisão")) {
				resultado = StNum[i] / NdNum[i];
						}
					
				//Resultados
			
				JOptionPane.showMessageDialog(null, "Vetor1: "+StNum[i]+ " Vetor2: "+NdNum[i]+" Tipo de calculo: "+Calc+" Resultado: "+resultado);
			
			
			
			
			
		
//Concluído
	

}
}}
