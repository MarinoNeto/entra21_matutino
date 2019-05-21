package acao;

import javax.swing.table.DefaultTableModel;

import Beans.Curso;
import dados.Dados;

public class Acao {

	//CRUD - Create, Read, Update and Delete / Criar, ler, atualizar e excluir
	
	
	//Cadastro
	public void cadastrar(Curso c) {
		Dados.arrayCursos.add(c);
	}		
	
	//Seleçao
	public DefaultTableModel selecionar() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Curso");
		modelo.addColumn("Área");
		
		for(int indice=0; indice<Dados.arrayCursos.size(); indice++) {
			modelo.addRow(new Object[] {
					Dados.arrayCursos.get(indice).getNomeCurso(),
					Dados.arrayCursos.get(indice).getAreaCurso(),
			
			});
	}
	
		return modelo;
	}
	
	//Alteraçao
	public void alterar (int indice, Curso c) {
		Dados.arrayCursos.set(indice, c);
	}
	
	
	//Exclusao
	public void excluir(int indice) {
		Dados.arrayCursos.remove(indice);
	}
	
	
	
	
	
	
}
