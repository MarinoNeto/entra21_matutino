package exercicios;

import javax.swing.JOptionPane;

public class nove {

	public static void main(String[] args) {
		// 9. O usu�rio dever� informar tr�s n�meros, ap�s informado os tr�s n�meros dever� ser exibido 
		// o menor dos tr�s. 
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro n�mero"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro n�mero"));
		
		if ((numero1<numero2) && (numero1<numero2)) {
		   JOptionPane.showMessageDialog(null, +numero1);
		   
   	}  if ((numero2<numero1) && (numero2<numero3)) {
		   JOptionPane.showMessageDialog(null, +numero2); 
			   
   	}   if ((numero3<numero1) && (numero3<numero2)) {
		 JOptionPane.showMessageDialog(null, +numero3);
	   
	   }
	}

}
