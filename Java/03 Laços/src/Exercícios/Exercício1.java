package Exerc�cios;

import javax.swing.JOptionPane;

public class Exerc�cio1 {

	public static void main(String[] args) {
		/*Desenvolver um algoritmo que pe�a as seguintes informa��es: Nome, Idade, Sexo, Cargo, ap�s
		cadastrar um determinado n�mero de pessoas o programa dever� retornar os seguintes dados:
			a) Quantidade de pessoas do sexo masculino e feminino;
			b) Quantidade de pessoas dos seguintes cargos: gerente, atendente, a�ougueiro, secret�ria,
			almoxarife, padeiro e estagi�rio.
			c) Quantidade de pessoas maiores de idade (18+) e quantidade de pessoas menores de idade*/
		
		int masc = 0, fem = 0, MaiorId = 0, MenorId = 0, QtdGer = 0, QtdAten = 0, QtdA�oug = 0, QtdSecret = 0, QtdAlmox = 0, QtdPad = 0, QtdEst = 0, Continuar = 0;
		do {
		String Nome = JOptionPane.showInputDialog("Insira o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
		if (idade >18) { 
			MaiorId++;
		}else {
			MenorId++;
		}
		String sexo = (JOptionPane.showInputDialog("Escreva 'Masculino' para sexo masculino e 'Feminino' para sexo feminino"));
			if ((sexo.equals("Masculino")) && (sexo.equals("Feminino"))) {
				JOptionPane.showMessageDialog(null, "Resposta Inv�lida, apenas 'Masculino' e 'Feminino' s�o op��es dispon�veis");
			}else if (sexo.equals("Masculino")) {
				masc++;
			}else {
				fem++;
			}
				
			
		String Cargo = JOptionPane.showInputDialog("Escolha um cargo entre: gerente, atendente, a�ougueiro, secret�ria, almoxarife, padeiro e estagi�rio");
			if (Cargo.equals("Gerente")) {
				QtdGer++;
			}else if (Cargo.equals("Atendente")) {
				QtdAten++;
			}else if (Cargo.equals("A�ougueiro")) {
				QtdA�oug++;
			}else if (Cargo.equals("Secret�ria")) {
				QtdSecret++;
			}else if (Cargo.equals("Almoxarife")) {
				QtdAlmox++;
			}else if (Cargo.equals("Padeiro")) {
				QtdPad++;
			}else if (Cargo.equals("Estagi�rio")) {
				QtdEst++;
			}Continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais pessoas? Digite '1' para continuar, ou '2' para encerrar"));
			
			}while(Continuar != 2);
		JOptionPane.showMessageDialog(null, "Foram listadas \nSexo Masculino = "+masc+"\nSexoFeminino = "+fem+"\nGerentes = "+QtdGer+"\nAtendentes = "+QtdAten+"\nA�ougueiros = "+QtdA�oug+"\nSecret�rios = "+QtdSecret+"\nAlmoxarifes = "+QtdAlmox+"\nEst�gi�rios = "+QtdEst+"." );
//		Conclu�do
		}
	}
