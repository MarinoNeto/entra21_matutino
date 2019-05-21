package acao;
import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import dados.Dados;

public class Acao {

	
	
		//Cadastro
		public void cadastrar(Jogo c) {
			Dados.arrayJogo.add(c);
		}	
		
		
		//Seleçao
		public DefaultTableModel selecionar() {
			
			DefaultTableModel modelo = new DefaultTableModel();
			modelo.addColumn("Nome");
			modelo.addColumn("Gênero");
			modelo.addColumn("Plataforma");
			modelo.addColumn("Classificação");
			modelo.addColumn("Valor");

			for(int indice=0; indice<Dados.arrayJogo.size(); indice++) {
				modelo.addRow(new Object[] {
						Dados.arrayJogo.get(indice).getNomeJogo(),
						Dados.arrayJogo.get(indice).getGenero(),
						Dados.arrayJogo.get(indice).getPlataforma(),
						Dados.arrayJogo.get(indice).getClassificação(),
						Dados.arrayJogo.get(indice).getValor(),
				});
		}
		
			return modelo;
		}
		
		
		//Alteraçao
		public void alterar (int indice, Jogo c) {
			Dados.arrayJogo.set(indice, c);
		}
		
		//Exclusao
		public void excluir(int indice) {
			Dados.arrayJogo.remove(indice);
		}
		
		
		
		
		
	
}
