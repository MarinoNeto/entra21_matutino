package Exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formul�rio
				JFrame formulario = new JFrame();
				formulario.setSize(500, 300);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setVisible(true);
				formulario.setTitle("Meu primeiro formul�rio");
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				
				//Bot�o
				JButton botao = new JButton();
				botao.setText("Enviar");
			//botao.setSize(100, 20);
				botao.setBounds(100, 30, 100, 20);
				
				//Evento no bot�o
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "Ol� mundo");
						
					}
				});
				
				//Adicionar o bot�o no formul�rio
				formulario.add(botao);

	}

}
