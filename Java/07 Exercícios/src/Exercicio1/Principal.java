package Exercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		int[] StNum = new int[10];
		int[] NdNum = new int[10];
		int indice = 0, somar, subtrair, multiplicar, divis�o, resultado = 0;
			
			//Obter dados
			while (indice < 10) {
			StNum[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+"� numero do 1� vetor"));
			NdNum[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(indice+1)+"� numero do 2� vetor"));
			indice++;
			}
			
			//Sele��o da conta
			String Calc= JOptionPane.showInputDialog("Escolha o tipo de opera��o, adi��o, subtra��o, multiplica��o ou divis�o");	
						for(int i=0; i<StNum.length; i++) {
							if(Calc.equals("adi��o")) {
				resultado= StNum[i] + NdNum[i];
				}else if(Calc.equals("subtra��o")) {
				resultado = StNum[i] - NdNum[i];
				}else if (Calc.equals("multiplica��o")) {
				resultado = StNum[i] * NdNum[i];			
				}else if (Calc.equals("divis�o")) {
				resultado = StNum[i] / NdNum[i];
						}
					
				//Resultados
			
				JOptionPane.showMessageDialog(null, "Vetor1: "+StNum[i]+ " Vetor2: "+NdNum[i]+" Tipo de calculo: "+Calc+" Resultado: "+resultado);
			
			
			
			
			
		
//Conclu�do
	

}
}}
