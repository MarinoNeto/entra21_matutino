package Exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Rodolfo");
				p.setIdade(37);

				System.out.println(p.getNome()+"\n"+p.getIdade());
	}

}
