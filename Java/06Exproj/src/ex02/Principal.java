package ex02;

import java.awt.Color;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {
		
		//Formulário
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200, 800);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		//Categoria
		JPanel painelCategoria = new JPanel();
		painelCategoria.setLayout(null);
		painelCategoria.setSize(250, 800);
		painelCategoria.setBackground(new Color(105, 198, 128));
		
		//Links categorias
		JButton btnCat01 = new JButton("Limpeza");
		btnCat01.setBounds(10, 10, 200, 30);
		btnCat01.setBorderPainted(false); 
		btnCat01.setContentAreaFilled(false); 
		btnCat01.setFocusPainted(false); 
		btnCat01.setOpaque(false);

		JButton btnCat02 = new JButton("Bebidas");
		btnCat02.setBounds(10, 40, 200, 30);
		btnCat02.setBorderPainted(false); 
		btnCat02.setContentAreaFilled(false); 
		btnCat02.setFocusPainted(false); 
		btnCat02.setOpaque(false);
		
		JButton btnCat03 = new JButton("Carnes");
		btnCat03.setBounds(10, 70, 200, 30);
		btnCat03.setBorderPainted(false); 
		btnCat03.setContentAreaFilled(false); 
		btnCat03.setFocusPainted(false); 
		btnCat03.setOpaque(false);
		
		JButton btnCat04 = new JButton("Hortifruti");
		btnCat04.setBounds(10, 100, 200, 30);
		btnCat04.setBorderPainted(false); 
		btnCat04.setContentAreaFilled(false); 
		btnCat04.setFocusPainted(false); 
		btnCat04.setOpaque(false);
		
		//Importar as categorias
		painelCategoria.add(btnCat01);
		painelCategoria.add(btnCat02);
		painelCategoria.add(btnCat03);
		painelCategoria.add(btnCat04);
		
		
		//Produtos
		JPanel painelProdutos = new JPanel();
		painelProdutos.setLayout(null);
		painelProdutos.setSize(250, 800);
		painelProdutos.setBounds(250, 0, 950, 800);
		painelProdutos.setBackground(new Color(232, 232, 232));
		
		//1º produto
		JLabel imgProduto1 = new JLabel();
		URL caminhoImagem;
		try {
			caminhoImagem = new URL("https://www.paodeacucar.com/img/uploads/1/325/586325x200x200.png?type=product");
			ImageIcon icone = new ImageIcon(caminhoImagem);
			imgProduto1.setIcon(icone);
			imgProduto1.setBounds(10, 10, 200, 200);
		} catch (Exception e) {	}
		
		
		painelProdutos.add(imgProduto1);
		
		
		//Importar elementos
		f.add(painelCategoria);
		f.add(painelProdutos);
		
		//Exibir formulário
		f.setVisible(true);
		
	}
	
}
