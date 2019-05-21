package exercicios;

import javax.swing.JOptionPane;

public class nove {

	public static void main(String[] args) {
		// 9. O usuário deverá informar três números, após informado os três números deverá ser exibido 
		// o menor dos três. 
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número"));
		
		if ((numero1<numero2) && (numero1<numero2)) {
		   JOptionPane.showMessageDialog(null, +numero1);
		   
   	}  if ((numero2<numero1) && (numero2<numero3)) {
		   JOptionPane.showMessageDialog(null, +numero2); 
			   
   	}   if ((numero3<numero1) && (numero3<numero2)) {
		 JOptionPane.showMessageDialog(null, +numero3);
	   
	   }
	}

}
