package Exerc�cios;

import javax.swing.JOptionPane;

public class Exerc�cio3 {

	public static void main(String[] args) {
		/*Uma lanchonete precisa de um sistema para calcular o troco que ser� dado aos clientes, para isso fa�a com que seja informado um c�digo a quantidade pedida daquele produto (que pertence ao c�digo informado). Crie um la�o onde o cliente ir� informar c�digos e quantidades infinitamente. 
 
Ap�s informados os c�digos e suas respectivas quantidades informe o total consumido e pe�a o valor que o cliente ir� pagar (Se o cliente tentar pagar menos que o total pe�a novamente o pagamento at� ele informar um valor igual ou superior consumido*/

		int Continuar = 0, cod1= 0, cod2= 0, cod3= 0, cod4 = 0, cod5 = 0, cod6 = 0, cod7 = 0, qtdhamsl = 0, qtdsannatsu = 0, pdd = 0, pizza = 0, lasa = 0, pdq = 0, bolo = 0;
		double ValorInsuficiente = 0, troco = 0, pre�o = 0;
		do {
			int CodigoPed = Integer.parseInt(JOptionPane.showInputDialog("Insira o c�digo do produto desejado"));
			if(( CodigoPed <1) && (CodigoPed >7)){
				JOptionPane.showMessageDialog(null, "C�digo Inv�lido, C�digos de produtos dispon�veis apenas entre 1 e 7.");
			}
			if( CodigoPed == 1) {
				cod1++;
				qtdhamsl++;
				pre�o = pre�o + 5.00;
			}else if (CodigoPed == 2) {
				cod2++;
				qtdsannatsu++;
				pre�o = pre�o + 4.50;
			}else if (CodigoPed == 3) {
				cod3++;
				pdd++;
				pre�o = pre�o + 8.00;
			}else if (CodigoPed == 4) {
				cod4++;
				pizza++;
				pre�o = pre�o + 12.00;
			}else if (CodigoPed == 5) {
				cod5++;
				lasa++;
				pre�o = pre�o + 16.50;
			}else if (CodigoPed == 6) {
				cod6++;
				pdq++;
				pre�o = pre�o + 1.00;
			}else if (CodigoPed == 7) {
				cod7++;
				bolo++;
				pre�o = pre�o + 2.50;
			}
		
			Continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais pedidos? Digite '1' para continuar, ou '2' para encerrar"));
		}while(Continuar != 2);
		
		JOptionPane.showMessageDialog(null, "Voc� consumiu: Hamb�rguer + Suco de Laranja: "+qtdhamsl+"\nSandu�che Natural + Suco de Uva: "+qtdsannatsu+"\nPrato do dia: "+pdd+"\nPizza: "+pizza+"\nLasanha: "+lasa+"\nP�o de Queijo: "+pdq+"\nBolo: "+bolo);
		double pagamento;
		do {
		double pagar = Double.parseDouble(JOptionPane.showInputDialog("O pre�o total da compra � de R$"+pre�o+", Insira o valor desejado para efetuar o pagamento"));
		pagamento = pagar;
		troco = pre�o - pagamento; 
	}while (pagamento < pre�o);
		JOptionPane.showMessageDialog(null, "O seu troco � de: R$"+troco+" Obrigado pela compra tenha um bom dia");
//Conclu�do
	}}
