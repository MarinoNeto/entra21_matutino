package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Administrator extends JFrame {

	private JPanel contentPane;

	public Administrator(String tipo) {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastro = new JButton("Novo usu\u00E1rio");
		btnCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastro.setBounds(73, 20, 282, 25);
		contentPane.add(btnCadastro);
		
		JButton btnAlterar = new JButton("Alterar usu\u00E1rios");
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAlterar.setBounds(73, 56, 282, 25);
		contentPane.add(btnAlterar);
		
		JButton btnAltAdm = new JButton("Alterar dados do administrador");
		btnAltAdm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAltAdm.setBounds(73, 92, 282, 25);
		contentPane.add(btnAltAdm);
		
		JButton btnExcluir = new JButton("Excluir usu\u00E1rios");
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExcluir.setBounds(73, 128, 282, 25);
		contentPane.add(btnExcluir);
		
		JButton btnAltCom = new JButton("Alterar dados pr\u00F3prios(comum)");
		btnAltCom.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAltCom.setEnabled(false);
		btnAltCom.setBounds(73, 164, 282, 25);
		contentPane.add(btnAltCom);
		
		JButton btnVisu = new JButton("Visualizar usu\u00E1rios");
		btnVisu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVisu.setBounds(72, 200, 283, 25);
		contentPane.add(btnVisu);
	
		if(tipo.equals("Comum")) {
			btnExcluir.setEnabled(false);
			btnAltAdm.setEnabled(false);
			btnCadastro.setEnabled(false);
			btnAlterar.setEnabled(false);
			
		}
	
	}
}
