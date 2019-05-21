package Exemplo05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formul�rio
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu primeiro formul�rio");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Botao
		JButton btn01 = new JButton("Op��o 01");
		btn01.setBounds(10, 10, 150, 30);
		
		JButton btn02 = new JButton("Op��o 02");
		btn02.setBounds(190, 10, 150, 30);
		
		//Pain�is
		JPanel painel01 = new JPanel();
		painel01.setBounds(10, 50, 330, 150);
		painel01.setBackground(Color.YELLOW);
		painel01.setVisible(true);
		
		JPanel painel02 = new JPanel();
		painel02.setBounds(10, 50, 330, 150);
		painel02.setBackground(Color.BLUE);
		painel02.setVisible(false);
		
		// Adicionar elementos ao Painel02
		JButton botao = new JButton("Clique aqui");
		botao.setSize(150,30);
		painel02.add(botao);
		

		//A��es nos bot�es
		btn01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			painel01.setVisible(true);
			painel02.setVisible(false);
			
			}
		});
		
		//A��es nos bot�es
		btn02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			painel01.setVisible(false);
			painel02.setVisible(true);
			
			}
		});
		
		
		
		
		//Adicionar ao formul�rio
		formulario.add(btn01);
		formulario.add(btn02);
		formulario.add(painel01);
		formulario.add(painel02);
		
		//Exibir formul�rio e os componentes
		formulario.setVisible(true);
	}

}
