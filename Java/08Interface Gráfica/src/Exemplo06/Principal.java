package Exemplo06;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formul�rio
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu primeiro formul�rio");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Chceckbox
		JCheckBox ckb01 = new JCheckBox("Op��o 01");
		ckb01.setBounds(10, 10, 100, 20);
		
		JCheckBox ckb02 = new JCheckBox("Op��o 02");
		ckb02.setBounds(10, 40, 100, 20);
		
		JCheckBox ckb03 = new JCheckBox("Op��o 03");
		ckb03.setBounds(10, 70, 100, 20);
		
		//Add elementos
		
		formulario.add(ckb01);
		formulario.add(ckb02);
		formulario.add(ckb03);
		
		//Exibir formul�rio e os componentes
		formulario.setVisible(true);
	}

}
