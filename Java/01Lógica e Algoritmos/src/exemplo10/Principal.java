package exemplo10;

public class Principal {

	public static void main(String[] args) {

		/*
			Operadores Lógicos
			&& = E
			|| = OU
			!  = NÃO
		 */

		double valor = 500;
		String segmento = "eletronico";
				
		if((valor >= 500) && (segmento.equals("eletronico")))	{
			System.out.println("Desconto de 20%, total a pagar R$"+(valor*0.8));
			
		}else {
			System.out.println("Sem deconto, total a pagar R$"+valor);
			
		}
	}

}
