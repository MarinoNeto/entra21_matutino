package Exerc�cios;

import javax.swing.JOptionPane;

public class Exerc�cio2 {

	public static void main(String[] args) {
		/*Desenvolver um algoritmo que pe�a nome, altura, idade, peso dos jogadores de basquete, enquanto o
nome do jogador for diferente da palavra SAIR o programa dever� pedir essas informa��es, ap�s
cadastrados dever� aparecer as seguintes informa��es:
a. Quantidade de jogadores cadastrados;
b. Nome e altura do maior Jogador;
c. Nome e idade do jogador mais velho;
d. Nome e peso do jogador mais pesado;
e. M�dia das alturas jogadores.*/

		String Nome = null, NomeAltJog = null, NomeMVelho = null, NomeMPes = null;
		
		int QtdJog = 0, IdadeMVelho = 0;
		double MaiorAlt = 0, PesoMPes = 0, MediaAlt = 0;
		do {
			Nome = JOptionPane.showInputDialog("Insira o nome do jogador ou escreva 'SAIR' para encerrar o cadastro de jogadores");
			
			if(!Nome.equals("SAIR")) {
			QtdJog++;
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do jogador"));
			if (altura > MaiorAlt) {
				MaiorAlt = altura;
				NomeAltJog = Nome;
				MediaAlt = (MediaAlt + altura)/QtdJog;
			}
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do jogador"));
			if (idade > IdadeMVelho) {
				IdadeMVelho = idade;
				NomeMVelho = Nome;
			}
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso do jogador"));
			if (peso > PesoMPes) {
				PesoMPes = peso;
				NomeMPes = Nome;
			}
			}
		 }while (!Nome.equals("SAIR"));
		
			JOptionPane.showMessageDialog(null, "Quantidade de jogadores cadastrados = "+QtdJog+"\nNome do maior jogador: "+NomeAltJog+"\nAltura do maior jogador: "+MaiorAlt+"\nNome do jogador mais velho: "+NomeMVelho+"\nIdade do jogador mais velho = "+IdadeMVelho+"\nNome do jogador mais pesado: "+NomeMPes+"\nPeso do jogador mais pesado = "+PesoMPes+"\nM�dia de altura dos jogadores = "+MediaAlt+".");
			
			
		
			
		//Conclu�do
		
	}}


