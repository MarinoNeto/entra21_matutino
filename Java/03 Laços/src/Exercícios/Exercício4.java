package Exerc�cios;

import javax.swing.JOptionPane;

public class Exerc�cio4 {

	public static void main(String[] args) {
		/*O filme Alice no pa�s das maravilhas est� fazendo uma enquete para saber o que o p�blico achou do filme, ser� necess�rio desenvolver um programa que tenha 5 op��es (excelente, �timo, bom, regular, ruim), e dever� informar a idade. 
		 
		Ap�s informados os dados (idade e voto) de todos os indiv�duos dever� ser exibido: */ 

		int continuar = 0, excelente = 0, PorcExc = 0, PorcOtim = 0, PorcBom = 0, PorcReg = 0, PorcRuim = 0,  �timo = 0,  bom = 0, regular = 0, ruim = 0, QtdKids = 0, QtdTeens = 0, QtdAdult = 0, Porcentagem = 0, TotVotos = 0;
		
		do {
			int Opini�o = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo, informe o que achou do filme Alice no Pa�s das Maravilhas digitando '1' para Excelente, '2' para �timo, '3' para Bom, '4' para Regular, e '5' para Ruim."));
			if ((Opini�o <1) && (Opini�o >5)) {
				JOptionPane.showMessageDialog(null, "A op��o selecionada n�o existe");
			}else if (Opini�o ==1) {
				excelente++;
				TotVotos++;
				PorcExc = (100/TotVotos)*excelente;  
			}else if (Opini�o ==2) {
				�timo++;
				TotVotos++;
				PorcOtim = (100/TotVotos)*�timo;
			}else if (Opini�o ==3) {
				bom++;
				TotVotos++;
				PorcBom = (100/TotVotos)*bom;
			}else if (Opini�o ==4) {
				regular++;
				TotVotos++;
				PorcReg = (100/TotVotos)*regular;
			}else if (Opini�o ==5) {
				ruim++;
				TotVotos++;
				PorcRuim = (100/TotVotos)*ruim;
			}
			int FaixaEt�ria = Integer.parseInt(JOptionPane.showInputDialog("Insira sua faixa et�ria, digite '1' para crian�a(0 � 9 anos), '2' para adolescente('10 � 17), e '3' para adulto(17 � 100[estimativa])."));
			if ((FaixaEt�ria <0) && (FaixaEt�ria >3)) {
				JOptionPane.showMessageDialog(null, "A idadei inserida n�o � v�lida");
			}else if (FaixaEt�ria ==1) {
				QtdKids++;
			}else if (FaixaEt�ria ==2) {
			QtdTeens++;
			}else if (FaixaEt�ria ==3) {
			QtdAdult++;
			
			}continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais pessoas? Digite '1' para continuar, ou '2' para encerrar"));
			
		}while(continuar != 2);
		
		JOptionPane.showMessageDialog(null, "A porcentagem de votos em cada op��o �: \n"+PorcExc+"% Excelente \n"+PorcOtim+"% �timo \n"+PorcBom+"% Bom \n"+PorcReg+"% Regular \n"+PorcRuim+"% Ruim.");
		JOptionPane.showMessageDialog(null, "E a quantidade de pessoas em cada faixa et�ria �: \n Crian�as(0 � 9 anos): "+QtdKids+"\n Adolescentes(10 � 17 anos): "+QtdTeens+"\n Adultos(Acima de 17 anos): "+QtdAdult+".");
		JOptionPane.showMessageDialog(null, "Agradecemos por participar de nossa pesquisa, tenha um bom dia!");
		
//		Conclu�do.
		
		
		
	}

}
