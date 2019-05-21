package Exercícios;

import javax.swing.JOptionPane;

public class Exercício3 {

	public static void main(String[] args) {
		/*Uma lanchonete precisa de um sistema para calcular o troco que será dado aos clientes, para isso faça com que seja informado um código a quantidade pedida daquele produto (que pertence ao código informado). Crie um laço onde o cliente irá informar códigos e quantidades infinitamente. 
 
Após informados os códigos e suas respectivas quantidades informe o total consumido e peça o valor que o cliente irá pagar (Se o cliente tentar pagar menos que o total peça novamente o pagamento até ele informar um valor igual ou superior consumido*/

		int Continuar = 0, cod1= 0, cod2= 0, cod3= 0, cod4 = 0, cod5 = 0, cod6 = 0, cod7 = 0, qtdhamsl = 0, qtdsannatsu = 0, pdd = 0, pizza = 0, lasa = 0, pdq = 0, bolo = 0;
		double ValorInsuficiente = 0, troco = 0, preço = 0;
		do {
			int CodigoPed = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do produto desejado"));
			if(( CodigoPed <1) && (CodigoPed >7)){
				JOptionPane.showMessageDialog(null, "Código Inválido, Códigos de produtos disponíveis apenas entre 1 e 7.");
			}
			if( CodigoPed == 1) {
				cod1++;
				qtdhamsl++;
				preço = preço + 5.00;
			}else if (CodigoPed == 2) {
				cod2++;
				qtdsannatsu++;
				preço = preço + 4.50;
			}else if (CodigoPed == 3) {
				cod3++;
				pdd++;
				preço = preço + 8.00;
			}else if (CodigoPed == 4) {
				cod4++;
				pizza++;
				preço = preço + 12.00;
			}else if (CodigoPed == 5) {
				cod5++;
				lasa++;
				preço = preço + 16.50;
			}else if (CodigoPed == 6) {
				cod6++;
				pdq++;
				preço = preço + 1.00;
			}else if (CodigoPed == 7) {
				cod7++;
				bolo++;
				preço = preço + 2.50;
			}
		
			Continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais pedidos? Digite '1' para continuar, ou '2' para encerrar"));
		}while(Continuar != 2);
		
		JOptionPane.showMessageDialog(null, "Você consumiu: Hambúrguer + Suco de Laranja: "+qtdhamsl+"\nSanduíche Natural + Suco de Uva: "+qtdsannatsu+"\nPrato do dia: "+pdd+"\nPizza: "+pizza+"\nLasanha: "+lasa+"\nPão de Queijo: "+pdq+"\nBolo: "+bolo);
		double pagamento;
		do {
		double pagar = Double.parseDouble(JOptionPane.showInputDialog("O preço total da compra é de R$"+preço+", Insira o valor desejado para efetuar o pagamento"));
		pagamento = pagar;
		troco = preço - pagamento; 
	}while (pagamento < preço);
		JOptionPane.showMessageDialog(null, "O seu troco é de: R$"+troco+" Obrigado pela compra tenha um bom dia");
//Concluído
	}}
