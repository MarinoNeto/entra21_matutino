package Exercícios;

import javax.swing.JOptionPane;

public class Exercício4 {

	public static void main(String[] args) {
		/*O filme Alice no país das maravilhas está fazendo uma enquete para saber o que o público achou do filme, será necessário desenvolver um programa que tenha 5 opções (excelente, ótimo, bom, regular, ruim), e deverá informar a idade. 
		 
		Após informados os dados (idade e voto) de todos os indivíduos deverá ser exibido: */ 

		int continuar = 0, excelente = 0, PorcExc = 0, PorcOtim = 0, PorcBom = 0, PorcReg = 0, PorcRuim = 0,  ótimo = 0,  bom = 0, regular = 0, ruim = 0, QtdKids = 0, QtdTeens = 0, QtdAdult = 0, Porcentagem = 0, TotVotos = 0;
		
		do {
			int Opinião = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo, informe o que achou do filme Alice no País das Maravilhas digitando '1' para Excelente, '2' para Ótimo, '3' para Bom, '4' para Regular, e '5' para Ruim."));
			if ((Opinião <1) && (Opinião >5)) {
				JOptionPane.showMessageDialog(null, "A opção selecionada não existe");
			}else if (Opinião ==1) {
				excelente++;
				TotVotos++;
				PorcExc = (100/TotVotos)*excelente;  
			}else if (Opinião ==2) {
				ótimo++;
				TotVotos++;
				PorcOtim = (100/TotVotos)*ótimo;
			}else if (Opinião ==3) {
				bom++;
				TotVotos++;
				PorcBom = (100/TotVotos)*bom;
			}else if (Opinião ==4) {
				regular++;
				TotVotos++;
				PorcReg = (100/TotVotos)*regular;
			}else if (Opinião ==5) {
				ruim++;
				TotVotos++;
				PorcRuim = (100/TotVotos)*ruim;
			}
			int FaixaEtária = Integer.parseInt(JOptionPane.showInputDialog("Insira sua faixa etária, digite '1' para criança(0 à 9 anos), '2' para adolescente('10 à 17), e '3' para adulto(17 à 100[estimativa])."));
			if ((FaixaEtária <0) && (FaixaEtária >3)) {
				JOptionPane.showMessageDialog(null, "A idadei inserida não é válida");
			}else if (FaixaEtária ==1) {
				QtdKids++;
			}else if (FaixaEtária ==2) {
			QtdTeens++;
			}else if (FaixaEtária ==3) {
			QtdAdult++;
			
			}continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar mais pessoas? Digite '1' para continuar, ou '2' para encerrar"));
			
		}while(continuar != 2);
		
		JOptionPane.showMessageDialog(null, "A porcentagem de votos em cada opção é: \n"+PorcExc+"% Excelente \n"+PorcOtim+"% Ótimo \n"+PorcBom+"% Bom \n"+PorcReg+"% Regular \n"+PorcRuim+"% Ruim.");
		JOptionPane.showMessageDialog(null, "E a quantidade de pessoas em cada faixa etária é: \n Crianças(0 à 9 anos): "+QtdKids+"\n Adolescentes(10 à 17 anos): "+QtdTeens+"\n Adultos(Acima de 17 anos): "+QtdAdult+".");
		JOptionPane.showMessageDialog(null, "Agradecemos por participar de nossa pesquisa, tenha um bom dia!");
		
//		Concluído.
		
		
		
	}

}
