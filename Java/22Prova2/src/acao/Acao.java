package acao;

import javax.swing.table.DefaultTableModel;

import beans.Funcionarios;
import dados.Dados;

public class Acao {

	//Cadastro
	public void cadastrar(Funcionarios z) {
		Dados.arrayFuncionarios.add(z);
	}
	
	//Sele�ao
			public DefaultTableModel selecionar() {
				DefaultTableModel modelo = new DefaultTableModel();
				modelo.addColumn("Colaborador");
				modelo.addColumn("Sal�rio L�quido");
			for(int indice = 0; indice<Dados.arrayFuncionarios.size(); indice++) {
				modelo.addRow(new Object[] {
					Dados.arrayFuncionarios.get(indice).getColab(),
					Dados.arrayFuncionarios.get(indice).getSalLiquido(),
				});
				
			}
			return modelo;
			
			
			}
	
	
	
}
