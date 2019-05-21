package formulario;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class Formulario extends JFrame {

	private JPanel contentPane;

	
	private String Ps4, Xbox, Wii, Celular, Teclado, Mouse, Televisao, PC;
	private int qtdPs4, qtdXbox, qtdWii, qtdCel, qtdTec, qtdMouse, qtdTele, qtdPc, TotPr;
	
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPs4 = new JButton("Ps4");
		btnPs4.setBounds(10, 37, 122, 41);
		contentPane.add(btnPs4);
		
		JButton btnXboxone = new JButton("XboxOne");
		btnXboxone.setBounds(158, 37, 122, 41);
		contentPane.add(btnXboxone);
		
		JButton btnWii = new JButton("NintendoWii");
		btnWii.setBounds(300, 37, 122, 41);
		contentPane.add(btnWii);
		
		JButton btnCelular = new JButton("Celular");
		btnCelular.setBounds(10, 117, 122, 41);
		contentPane.add(btnCelular);
		
		JButton btnPc = new JButton("PC");
		btnPc.setBounds(158, 117, 122, 41);
		contentPane.add(btnPc);
		
		JButton btnTelevisao = new JButton("Televis\u00E3o");
		btnTelevisao.setBounds(300, 117, 122, 41);
		contentPane.add(btnTelevisao);
		
		JButton btnMouse = new JButton("Mouse");
		btnMouse.setBounds(10, 202, 122, 41);
		contentPane.add(btnMouse);
		
		JButton btnTeclado = new JButton("Teclado");
		btnTeclado.setBounds(158, 202, 122, 41);
		contentPane.add(btnTeclado);
		
		JButton btnQtd = new JButton("Quantidade");
		btnQtd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Total = "+TotPr+"\nPs4 = "+qtdPs4+"\nXboxOne = "+qtdXbox+"\nNintendo Wii = "+qtdWii+"\nCelular = "+qtdCel+"\nPc = "+qtdPc+"\nTelevisão = "+qtdTele+"\nMouse = "+qtdMouse+"\nTeclado = "+qtdTec+".");                                           
			
			}
		});
		btnQtd.setBounds(346, 3, 110, 23);
		contentPane.add(btnQtd);
		
		JButton btnMouseMais = new JButton("+");
		btnMouseMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdMouse++;
			TotPr++;		
			}
		});
		btnMouseMais.setBounds(10, 246, 41, 23);
		contentPane.add(btnMouseMais);
		
		JButton btnMouseMenos = new JButton("-");
		btnMouseMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdMouse--;
			TotPr--;
			if(qtdMouse <0) {
				qtdMouse = 0;
			}
			
			}
		});
		btnMouseMenos.setBounds(49, 246, 41, 23);
		contentPane.add(btnMouseMenos);
		
		JButton btnTecladoMais = new JButton("+");
		btnTecladoMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdTec++;
			TotPr++;
			
			}
		});
		btnTecladoMais.setBounds(158, 246, 41, 23);
		contentPane.add(btnTecladoMais);
		
		JButton tnCelMais = new JButton("+");
		tnCelMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			qtdCel++;
			TotPr++;
			}
		});
		tnCelMais.setBounds(10, 156, 41, 23);
		contentPane.add(tnCelMais);
		
		JButton btnPCMais = new JButton("+");
		btnPCMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdPc++;
			TotPr++;
			
			}
		});
		btnPCMais.setBounds(158, 156, 41, 23);
		contentPane.add(btnPCMais);
		
		JButton btnTeleMais = new JButton("+");
		btnTeleMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdTele++;
			TotPr++;
			
			}
		});
		btnTeleMais.setBounds(300, 156, 41, 23);
		contentPane.add(btnTeleMais);
		
		JButton btnPsMais = new JButton("+");
		btnPsMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				qtdPs4++;
				TotPr++;
			
			}
		});
		btnPsMais.setBounds(10, 76, 41, 23);
		contentPane.add(btnPsMais);
		
		JButton btnBoxMais = new JButton("+");
		btnBoxMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			qtdXbox++;
			TotPr++;
			}
		});
		btnBoxMais.setBounds(158, 76, 41, 23);
		contentPane.add(btnBoxMais);
		
		JButton btnWiiMais = new JButton("+");
		btnWiiMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdWii++;
			TotPr++;
			}
		});
		btnWiiMais.setBounds(300, 76, 41, 23);
		contentPane.add(btnWiiMais);
		
		JButton btnTecladoMenos = new JButton("-");
		btnTecladoMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdTec--;
			TotPr--;
			if(qtdTec <0) {
				qtdTec = 0;
			}
			
			}
		});
		btnTecladoMenos.setBounds(198, 246, 41, 23);
		contentPane.add(btnTecladoMenos);
		
		JButton btnCelMenos = new JButton("-");
		btnCelMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdCel--;
			TotPr--;
			if(qtdCel <0) {
				qtdCel = 0;
			}
			}
		});
		btnCelMenos.setBounds(49, 156, 41, 23);
		contentPane.add(btnCelMenos);
		
		JButton btnPCMenos = new JButton("-");
		btnPCMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdPc--;
			TotPr--;
			if(qtdPc <0) {
				qtdPc = 0;
			}
			}
		});
		btnPCMenos.setBounds(198, 156, 41, 23);
		contentPane.add(btnPCMenos);
		
		JButton btnTeleMenos = new JButton("-");
		btnTeleMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdTele--;
			TotPr--;
			if(qtdTele <0) {
				qtdTele = 0;
			}
			}
		});
		btnTeleMenos.setBounds(336, 156, 41, 23);
		contentPane.add(btnTeleMenos);
		
		JButton btnWiiMenos = new JButton("-");
		btnWiiMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdWii--;
			TotPr--;
			if(qtdWii <0) {
				qtdWii = 0;
			}
			}
		});
		btnWiiMenos.setBounds(336, 76, 41, 23);
		contentPane.add(btnWiiMenos);
		
		JButton btnBoxMenos = new JButton("-");
		btnBoxMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdXbox--;
			TotPr--;
			if(qtdXbox <0) {
				qtdXbox = 0;
			}
			}
		});
		btnBoxMenos.setBounds(198, 76, 41, 23);
		contentPane.add(btnBoxMenos);
		
		JButton btnPsMenos = new JButton("-");
		btnPsMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			qtdPs4--;
			TotPr--;
			if(qtdPs4 <0) {
				qtdPs4 = 0;
			}
			}
		});
		btnPsMenos.setBounds(49, 76, 41, 23);
		contentPane.add(btnPsMenos);
		
	}
}
