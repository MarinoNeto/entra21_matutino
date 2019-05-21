package Exercício3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Informar verbo
		String verbo = JOptionPane.showInputDialog("Informe um verbo terminado em AR");
		String fim = "ar";
		
		//Verifica se termina em AR e muda conjuga verbo
		if(verbo.endsWith(fim)) {
			String Eu = verbo.replace("ar", "o");
			String Tu = verbo.replace("ar", "as");
			String Ele = verbo.replace("ar", "a");
			String Nos = verbo.replace("ar", "amos");
			String Vos = verbo.replace("ar", "áis");
			String Eles = verbo.replace("ar", "am");
			
			JOptionPane.showMessageDialog(null, "A conjugação do verbo "+verbo+" é:\n"+Eu+"\n"+Tu+"\n"+Ele+"\n"+Nos+"\n"+Vos+"\n"+Eles);
		}else {
			JOptionPane.showMessageDialog(null, "ERRO, insira apenas verbos terminados em AR");
		}

	}

}
