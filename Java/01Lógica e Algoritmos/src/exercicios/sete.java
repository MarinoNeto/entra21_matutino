package exercicios;

import javax.swing.JOptionPane;

public class sete {

	public static void main(String[] args) {
		/* 7. Crie um algoritmo onde o usu�rio informa um n�mero e a tabuada desse n�mero � realizada, exemplo: 
		 
		Exemplo 
		N�mero informado: 3 
		3 X 0 = 0  3 X 1 = 3  3 X 2 = 6  3 X 3 = 9  3 X 4 = 12  3 X 5 = 15 
		3 X 6 = 18  3 X 7 = 21  3 X 8 = 24  3 X 9 = 27  3 X 10 = 30 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero e obtenha a tabuada"));
		
		JOptionPane.showMessageDialog(null, +(numero*0)+"\n"+(numero*1)+"\n" +(numero*2)+"\n" +(numero*3)+"\n" +(numero*4)+"\n" +(numero*5)+"\n" +(numero*6)+"\n" +(numero*7)+"\n" +(numero*8)+"\n" +(numero*9)+"\n" +(numero*10));

	}

}
