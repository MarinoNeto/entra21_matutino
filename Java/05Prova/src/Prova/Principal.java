package Prova;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int correta1 = 0, correta2 = 0, correta3 = 0, correta4 = 0, correta5 = 0, acertos = 0, erros = 0;
		int resp1 = 0, resp2 = 0, resp3 = 0, resp4 = 0, resp5 = 0, continuar = 0, acertosMaior = 0, acertosMenor = 0,  qtdHom = 0, qtdMul = 0, TotCand = 0, qtdMenor = 0, qtdAdult = 0, qtdTerId = 0, qtdVel = 0;
		String refazer1 = "", refazer2 = "", refazer3 = "", refazer4 = "", refazer5 = "", nome = "", CandMenor = "", CandMaior = "";
		JOptionPane.showMessageDialog(null, "Bem vindo, voc� dever� inserir 5 quest�es que dever�o ser respondidas com 1 para 'Sim' ou 2 para 'N�o'(informando a alternativa correta).");
		String perg1 = JOptionPane.showInputDialog("Insira a primeira pergunta");
		correta1 = Integer.parseInt(JOptionPane.showInputDialog("Qual � a resposta correta da quest�o 1?"));
		String perg2 = JOptionPane.showInputDialog("Insira a segunda pergunta");
		correta2 = Integer.parseInt(JOptionPane.showInputDialog("Qual � a resposta correta da quest�o 2?"));
		String perg3 = JOptionPane.showInputDialog("Insira a terceira pergunta");
		correta3 = Integer.parseInt(JOptionPane.showInputDialog("Qual � a resposta correta da quest�o 3?"));
		String perg4 = JOptionPane.showInputDialog("Insira a quarta pergunta");
		correta4 = Integer.parseInt(JOptionPane.showInputDialog("Qual � a resposta correta da quest�o 4?"));
		String perg5 = JOptionPane.showInputDialog("Insira a quinta pergunta");
		correta5 = Integer.parseInt(JOptionPane.showInputDialog("Qual � a resposta correta da quest�o 5?"));
		
		JOptionPane.showMessageDialog(null, "Muito bem.");
		do {
		String Cand = JOptionPane.showInputDialog("H� um candidato para responder as perguntas? Responda 'Sim' ou 'N�o'");
			if (Cand.equals("Sim")) {
				TotCand++;
				nome = JOptionPane.showInputDialog("Qual o nome do candidato?");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do candidato?"));
				if (idade <= 17) {
					qtdMenor++;
				}else if ((idade == 18) && (idade <= 30)) {
					qtdAdult++;
				}else if ((idade == 31) && (idade <= 50)) {
					qtdTerId++;
				}else if (idade > 50) {
					qtdVel++;
				}
				String sexo = JOptionPane.showInputDialog("Qual o sexo do candidato?");
				if (sexo.equals("Masculino")) {
					qtdHom++;
				} else if (sexo.equals("Feminino")) {
					qtdMul++;
				}
					JOptionPane.showMessageDialog(null, "Muito bem "+nome+", agora voc� ir� responder 5 perguntas, digite 1 para 'Sim' ou 2 para 'N�o. Boa sorte.");
			resp1 = Integer.parseInt(JOptionPane.showInputDialog(perg1));
			if ((correta1 == 1) && (resp1 == 1)) {
				acertos++;
				refazer1 = "n�o";
			}else if((correta1 ==1) && (resp1 == 2)) {
				erros++;
				refazer1 = "sim";
			}else if((correta1 == 2) && (resp1 == 1)) {
				erros++;
				refazer1 = "sim";
			}else if((correta1 == 2) && (resp1 == 2)) {
				acertos++;
				refazer1 = "n�o";
			}
			resp2 = Integer.parseInt(JOptionPane.showInputDialog(perg2));		
			if ((correta2 == 1) && (resp2 == 1)) {
				acertos++;
				refazer2 = "n�o";
			}else if((correta2 ==1) && (resp2 == 2)) {
				erros++;
				refazer2 = "sim";
			}else if((correta2 == 2) && (resp2 == 1)) {
				erros++;
				refazer2 = "sim";
			}else if((correta2 == 2) && (resp2 == 2)) {
				acertos++;
				refazer2 = "n�o";
			}
			resp3 = Integer.parseInt(JOptionPane.showInputDialog(perg3));
			if ((correta3 == 1) && (resp3 == 1)) {
				acertos++;
				refazer3 = "n�o";
			}else if((correta3 ==1) && (resp3 == 2)) {
				erros++;
				refazer3 = "sim";
			}else if((correta3 == 2) && (resp3 == 1)) {
				erros++;
				refazer3 = "sim";
			}else if((correta3 == 2) && (resp3 == 2)) {
				acertos++;
				refazer3 = "n�o";
			}
			resp4 = Integer.parseInt(JOptionPane.showInputDialog(perg4));
			if ((correta4 == 1) && (resp4 == 1)) {
				acertos++;
				refazer4 = "n�o";
			}else if((correta4 ==1) && (resp4 == 2)) {
				erros++;
				refazer4 = "sim";
			}else if((correta4 == 2) && (resp4 == 1)) {
				erros++;
				refazer4 = "sim";
			}else if((correta4 == 2) && (resp4 == 2)) {
				acertos++;
				refazer4 = "n�o";
			}
			resp5 = Integer.parseInt(JOptionPane.showInputDialog(perg5));
			if ((correta5 == 1) && (resp5 == 1)) {
				acertos++;
				refazer5 = "n�o";
			}else if((correta5 ==1) && (resp5 == 2)) {
				erros++;
				refazer5 = "sim";
			}else if((correta5 == 2) && (resp5 == 1)) {
				erros++;
				refazer5 = "sim";
			}else if((correta5 == 2) && (resp5 == 2)) {
				acertos++;
				refazer5 = "n�o";
			}
			JOptionPane.showMessageDialog(null, "Voc� respondeu "+acertos+" quest�es certas e "+erros+" quest�es erradas.");
			if (refazer1.equals("sim")) {
				JOptionPane.showMessageDialog(null, "A resposta correta da quest�o '"+perg1+" �: "+correta1+".");
			}
			if (refazer2.equals("sim")) {
				JOptionPane.showMessageDialog(null, "A resposta correta da quest�o '"+perg2+" �: "+correta2+".");
			}
			if (refazer3.equals("sim")) {
				JOptionPane.showMessageDialog(null, "A resposta correta da quest�o '"+perg3+" �: "+correta3+".");
					}
			if (refazer4.equals("sim")) {
				JOptionPane.showMessageDialog(null, "A resposta correta da quest�o '"+perg4+" �: "+correta4+".");
					}
			if (refazer5.equals("sim")) {
				JOptionPane.showMessageDialog(null, "A resposta correta da quest�o '"+perg5+" �: "+correta5+".");
					}
			}
			if (acertos > acertosMaior) {
				acertosMaior = acertos;
				CandMaior = nome;
			}else if (acertos < acertosMenor) {
				acertosMenor = acertos;
				CandMenor = nome;
			}
			JOptionPane.showInputDialog("H� mais candidatos? Digite 1 para 'Sim' ou 2 para 'N�o'.");
		}while(continuar != 2);
		int PorcMasc = (100/TotCand)*qtdHom;	
		int PorcFem = (100/TotCand)*qtdMul;
		
		JOptionPane.showMessageDialog(null, "Quantidade de homens = "+qtdHom+"\nQuantidade de mulheres = "+qtdMul+"\nPercentual de homens = "+PorcMasc+"\nPercentual de mulheres = "+PorcFem+"\nQuantidade de menores de 17 anos = "+qtdMenor+"\nQuantidade de pessoas entre 18 e 30 anos ="+qtdAdult+"\nQuantidade de pessoas entre 31 e 50 anos = "+qtdTerId+"\nQuantidade de pessoas acima de 50 anos de idade = "+qtdVel+".");
		JOptionPane.showMessageDialog(null, "O candidato que mais acertou foi o "+CandMaior+", ele respondeu "+acertos+" quest�es certas e "+erros+" quest�es erradas.");
		JOptionPane.showMessageDialog(null, "O candidato que mais errou foi o "+CandMenor+", ele respondeu "+acertos+" quest�es certas e "+erros+" quest�es erradas.");
		
		
		
			
	}
		
}


