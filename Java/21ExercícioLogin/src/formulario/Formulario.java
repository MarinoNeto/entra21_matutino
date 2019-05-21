package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Usuários;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import formulario.Administrator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuAdm;
	private JTextField textSenAdm;
	private JTextField textField;
	private JTextField textField_1;

	public Formulario() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdministrador = new JButton("Administrador");
		btnAdministrador.setBounds(31, 46, 142, 31);
		contentPane.add(btnAdministrador);
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Administrator A = new Administrator("Admin");
				A.setVisible(true);
			}
		});
		btnAdministrador.setFont(new Font("Tahoma", Font.BOLD, 11));
		
				
		JButton btnComum = new JButton("Comum");
		btnComum.setBounds(187, 46, 141, 30);
		contentPane.add(btnComum);
		btnComum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			Administrator A = new Administrator("Comum");
			A.setVisible(true);
			
			}
		});
		btnComum.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblEntrada = new JLabel("Escolha uma entrada");
		lblEntrada.setBounds(88, 11, 190, 22);
		contentPane.add(lblEntrada);
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrada.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setBounds(53, 97, 122, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(10, 100, 48, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 128, 48, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 128, 122, 20);
		contentPane.add(textField_1);

	}
}

	



