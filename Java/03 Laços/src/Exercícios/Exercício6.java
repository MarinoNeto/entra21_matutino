package Exercícios;

import javax.swing.JOptionPane;

public class Exercício6 {

	public static void main(String[] args) {
		String Nome = null, sexo = null, situação = null;
		double n1, n2, n3, n4, media;
		int masc = 0, fem = 0, PorcMasc = 0, PorcFem = 0, QtdRep = 0, PorcRep = 0, PorcRec = 0, PorcSat = 0, PorcB = 0, PorcO = 0, PorcP = 0, QtdRec = 0, QtdSat= 0, QtdB = 0, QtdO = 0, QtdP = 0, TotAlunos = 0;
		
		do {
			Nome = JOptionPane.showInputDialog("Insira o nome do(a) estudante ou escreva 'SAIR' para encerrar o cadastro de jogadores");
			
			if(!Nome.equals("SAIR")) {
				TotAlunos++;
				sexo = JOptionPane.showInputDialog("Insira o seu gênero sexual(masculino ou feminino");
				if (sexo.equals("masculino")) {
					masc++;
					PorcMasc = (100/TotAlunos)*masc;
				} else if (sexo.equals("feminino")) {
					fem++;
					PorcFem = (100/TotAlunos)*fem;
				}
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2"));
				n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3"));
				n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 4"));
				media = (n1+n2+n3+n4)/4;
				if (media <5) {
				situação = "Reprovado";
				QtdRep++;
				PorcRep = (100/TotAlunos)*QtdRep;
				}else if ((media ==5) || (media <6.9)) {
					situação = "Recuperação";
					QtdRec++;
					PorcRec = (100/TotAlunos)*QtdRec;
				}else if ((media == 7) || (media < 7.9 )) {
					situação = "Satisfatório";
					QtdSat++;
					PorcSat = (100/TotAlunos)*QtdSat;
				}else if ((media == 8) || (media < 8.9 )) {
					situação = "Bom";
					QtdB++;
					PorcB = (100/TotAlunos)*QtdB;
				}else if ((media == 9) || (media < 9.9 )) {
					situação = "Ótimo";
					QtdO++;
					PorcO = (100/TotAlunos)*QtdO;
				}else {
					situação = "Parabéns";
					QtdP++;
					PorcP= (100/TotAlunos)*QtdP;
				}
						
					JOptionPane.showMessageDialog(null, "Suas notas são: \nN1= "+n1+"\nN2 = "+n2+"\nN3 = "+n3+"\nN4 = "+n4+"\nMédia = "+media+"\nSituação = "+situação+".");
				
			}
				
			
		}while (!Nome.equals("SAIR"));
		
		JOptionPane.showMessageDialog(null, "Quantidade de homens : "+masc+"\nQuantidade de mulheres : "+fem+"\nPorcentagem de Homens : "+PorcMasc+"% \nPorcentagem de Mulheres : "+PorcFem+"%\nQuantidade de alunos que tiraram 10: "+QtdP+" , são "+PorcP+"% Parabéns \nQuantidade de alunos que tiraram média entre 9 e 9.9: "+QtdO+" , são "+PorcO+"% Ótimo \nQuantidade de alunos que tiraram media entre 8 e 8.9: "+QtdB+" , são "+PorcB+"% Bom \n Quantidade de alunos que tiraram entre 7 e 7.9:"+QtdSat+", são "+PorcSat+"% Satisfatório \n Quantidade de alunos que tiraram entre 6 e 6.9: "+QtdRec+", e são "+PorcRec+"% Recuperação \n Quantidade de alunos que tiraram abaixo de 5: "+QtdRep+" e são "+PorcRep+"% Reprovado");

//Incompleto
		}
	}

