package Exerc�cios;

import javax.swing.JOptionPane;

public class Exerc�cio6 {

	public static void main(String[] args) {
		String Nome = null, sexo = null, situa��o = null;
		double n1, n2, n3, n4, media;
		int masc = 0, fem = 0, PorcMasc = 0, PorcFem = 0, QtdRep = 0, PorcRep = 0, PorcRec = 0, PorcSat = 0, PorcB = 0, PorcO = 0, PorcP = 0, QtdRec = 0, QtdSat= 0, QtdB = 0, QtdO = 0, QtdP = 0, TotAlunos = 0;
		
		do {
			Nome = JOptionPane.showInputDialog("Insira o nome do(a) estudante ou escreva 'SAIR' para encerrar o cadastro de jogadores");
			
			if(!Nome.equals("SAIR")) {
				TotAlunos++;
				sexo = JOptionPane.showInputDialog("Insira o seu g�nero sexual(masculino ou feminino");
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
				situa��o = "Reprovado";
				QtdRep++;
				PorcRep = (100/TotAlunos)*QtdRep;
				}else if ((media ==5) || (media <6.9)) {
					situa��o = "Recupera��o";
					QtdRec++;
					PorcRec = (100/TotAlunos)*QtdRec;
				}else if ((media == 7) || (media < 7.9 )) {
					situa��o = "Satisfat�rio";
					QtdSat++;
					PorcSat = (100/TotAlunos)*QtdSat;
				}else if ((media == 8) || (media < 8.9 )) {
					situa��o = "Bom";
					QtdB++;
					PorcB = (100/TotAlunos)*QtdB;
				}else if ((media == 9) || (media < 9.9 )) {
					situa��o = "�timo";
					QtdO++;
					PorcO = (100/TotAlunos)*QtdO;
				}else {
					situa��o = "Parab�ns";
					QtdP++;
					PorcP= (100/TotAlunos)*QtdP;
				}
						
					JOptionPane.showMessageDialog(null, "Suas notas s�o: \nN1= "+n1+"\nN2 = "+n2+"\nN3 = "+n3+"\nN4 = "+n4+"\nM�dia = "+media+"\nSitua��o = "+situa��o+".");
				
			}
				
			
		}while (!Nome.equals("SAIR"));
		
		JOptionPane.showMessageDialog(null, "Quantidade de homens : "+masc+"\nQuantidade de mulheres : "+fem+"\nPorcentagem de Homens : "+PorcMasc+"% \nPorcentagem de Mulheres : "+PorcFem+"%\nQuantidade de alunos que tiraram 10: "+QtdP+" , s�o "+PorcP+"% Parab�ns \nQuantidade de alunos que tiraram m�dia entre 9 e 9.9: "+QtdO+" , s�o "+PorcO+"% �timo \nQuantidade de alunos que tiraram media entre 8 e 8.9: "+QtdB+" , s�o "+PorcB+"% Bom \n Quantidade de alunos que tiraram entre 7 e 7.9:"+QtdSat+", s�o "+PorcSat+"% Satisfat�rio \n Quantidade de alunos que tiraram entre 6 e 6.9: "+QtdRec+", e s�o "+PorcRec+"% Recupera��o \n Quantidade de alunos que tiraram abaixo de 5: "+QtdRep+" e s�o "+PorcRep+"% Reprovado");

//Incompleto
		}
	}

