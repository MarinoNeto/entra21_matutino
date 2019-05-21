package principal;

import cargos.Analista;
import cargos.Desenvolvedor;
import cargos.Estagiario;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar objetos
		Estagiario e = new Estagiario();
		Analista a = new Analista(5000, 2);
		Desenvolvedor d = new Desenvolvedor(3000, 3);
		
		//Chamando os metodos de indentificaçao
		e.indentificacao();
		a.indentificacao();
		d.indentificacao();
		
		//Chamando os metodos de vale transporte
		e.vt();
		a.vt();
		d.vt();
		
		
		//Chamando os metodos de IR
		e.ir();
		a.ir();
		d.ir();
		
	}

}
