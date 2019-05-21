package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Curso;
import acao.Acao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtArea;
	private JTable table;
	private static int CodigoCurso;
	
	private void limparCampos() {
		
		//Limpar os campos
		txtNome.setText("");
		txtArea.setText("");
		
		//Focus
		txtNome.requestFocus();
		
	}
	
	
	public formulario() {
		setForeground(Color.BLACK);
		
		//Objeto da classe Acao
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 496);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 83, 26);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNome);
		
		JLabel lblrea = new JLabel("\u00C1rea");
		lblrea.setBounds(10, 63, 74, 26);
		lblrea.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblrea);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
				//Criar um objeto Curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());
				
				//Efetuar o cadastro
				a.cadastrar(c);
				
				//Atualizar tabela
				table.setModel(a.selecionar());
				
				//Limpar campos
				limparCampos();
				
				
			}
		});
		btnCadastrar.setBounds(0, 155, 99, 26);
		contentPane.add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			//Instanciar um objeto da classe Curso
				Curso c = new Curso();
				c.setNomeCurso(txtNome.getText());
				c.setAreaCurso(txtArea.getText());
				
				//Realizar a alteraçao
				a.alterar(CodigoCurso, c);
				
				//Atualizar listagem de cursos
				table.setModel(a.selecionar());
				
				//Limpar campos
				limparCampos();
				
				
				//Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
				
				
			}
		});
		btnAlterar.setBounds(109, 155, 101, 26);
		contentPane.add(btnAlterar);
		
	
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//Remover curso
				a.excluir(CodigoCurso);
			
			//Atualizar listagem de cursos
				table.setModel(a.selecionar());
				
			
			}
		});
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(220, 155, 99, 26);
		contentPane.add(btnExcluir);
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//Limpar campos
				limparCampos();
				
				//Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCancelar.setEnabled(false);
				
			}
		});
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(329, 155, 95, 26);
		contentPane.add(btnCancelar);
		
		txtNome = new JTextField();
		txtNome.setBounds(85, 15, 295, 28);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setBounds(85, 63, 295, 28);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 226, 414, 220);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
			
				//Obter o índice da tabela
				int indice = table.getSelectedRow();
				
				//Adicionar o valor do indice no atributo
				CodigoCurso = indice;
				
				//Selecionando dados do curso
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtArea.setText(table.getValueAt(indice, 1).toString());

				//Botoes
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
				
				
			
			}
		});
		table.setModel(a.selecionar());
		scrollPane.setViewportView(table);
	}
}
