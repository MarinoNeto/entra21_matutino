package acao;
import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import dados.Dados;

public class Acao {

	
	
		//Cadastro
		public void cadastrar(Jogo c) {
			Dados.arrayJogo.add(c);
		}	
		
		
		//Sele�ao
		public DefaultTableModel selecionar() {
			
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.addColumn("Nome");
			modelo.addColumn("G�nero");
			modelo.addColumn("Plataforma");
			modelo.addColumn("Classifica��o");
			modelo.addColumn("Valor");

			for(int indice=0; indice<Dados.arrayJogo.size(); indice++) {
				modelo.addRow(new Object[] {
						Dados.arrayJogo.get(indice).getNomeJogo(),
						Dados.arrayJogo.get(indice).getGenero(),
						Dados.arrayJogo.get(indice).getPlataforma(),
						Dados.arrayJogo.get(indice).getClassifica��o(),
						Dados.arrayJogo.get(indice).getValor(),
				});
		}
		
			return modelo;
		}
		
		
		//Altera�ao
		public void alterar (int indice, Jogo c) {
			Dados.arrayJogo.set(indice, c);
		}
		
		//Exclusao
		public void excluir(int indice) {
			Dados.arrayJogo.remove(indice);
		}
		
		
		
		
		
	
}
