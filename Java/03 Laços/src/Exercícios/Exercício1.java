package Exercícios;

import javax.swing.JOptionPane;

public class Exercício1 {

	public static void main(String[] args) {
		/*Desenvolver um algoritmo que peça as seguintes informações: Nome, Idade, Sexo, Cargo, após
		cadastrar um determinado número de pessoas o programa deverá retornar os seguintes dados:
			a) Quantidade de pessoas do sexo masculino e feminino;
			b) Quantidade de pessoas dos seguintes cargos: gerente, atendente, açougueiro, secretária,
			almoxarife, padeiro e estagiário.
			c) Quantidade de pessoas maiores de idade (18+) e quantidade de pessoas menores de idade*/
		
		int masc = 0, fem = 0, MaiorId = 0, MenorId = 0, QtdGer = 0, QtdAten = 0, QtdAçoug = 0, QtdSecret = 0, QtdAlmox = 0, QtdPad = 0, QtdEst = 0, Continuar = 0;
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
				JOptionPane.showMessageDialog(null, "Resposta Inválida, apenas 'Masculino' e 'Feminino' são opções disponíveis");
			}else if (sexo.equals("Masculino")) {
				masc++;
			}else {
				fem++;
			}
				
			
		String Cargo = JOptionPane.showInputDialog("Escolha um cargo entre: gerente, atendente, açougueiro, secretária, almoxarife, padeiro e estagiário");
			if (Cargo.equals("Gerente")) {
				QtdGer++;
			}else if (Cargo.equals("Atendente")) {
				QtdAten++;
			}else if (Cargo.equals("Açougueiro")) {
				QtdAçoug++;
			}else if (Cargo.equals("Secretária")) {
				QtdSecret++;
			}else if (Cargo.equals("Almoxarife")) {
				QtdAlmox++;
			}else if (Cargo.equals("Padeiro")) {
				QtdPad++;
			}else if (Cargo.equals("Estagiário")) {
				QtdEst++;
			}Continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais pessoas? Digite '1' para continuar, ou '2' para encerrar"));
			
			}while(Continuar != 2);
		JOptionPane.showMessageDialog(null, "Foram listadas \nSexo Masculino = "+masc+"\nSexoFeminino = "+fem+"\nGerentes = "+QtdGer+"\nAtendentes = "+QtdAten+"\nAçougueiros = "+QtdAçoug+"\nSecretários = "+QtdSecret+"\nAlmoxarifes = "+QtdAlmox+"\nEstágiários = "+QtdEst+"." );
//		Concluído
		}
	}
