package Projeto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Principal {

	//Variáveis
		static String EscolhaDoCliente = "", DispHamb = "", DispCox = "", DispUva = "", DispLara = "";
		static int qtdComprado = 0, ContinuarSugerindo = 0, índice = 0, qtdCox = 0, qtdUva = 0, qtdLara = 0, TotHamb = 5, TotCox = 5, TotUva = 5, TotLara = 5, qtdCompHamb = 0, qtdCompCox = 0, qtdCompUva = 0, qtdCompLara = 0;
		static double PrHamb = 13.00, PrCox = 9.00, PrUva = 5.00, PrLara = 5.00, TotPag = 0, troco = 0, pagamento = 0, PagF = 0;
		
		public static void main(String[] args) {
			/* Criar algoritmo para lanchonete
			1.Venda de mercadoria
			2.Cardápio
			3.Compra de mercadoria para estoque
			4.Sistema almoxarifado(estoque).
			5.Sistema de sugestão de produto para expôr no cardápio
			6.Contato(tudo fictício, apenas para tornar apresentável)
			Obs: Cada produto inicia com 5 de estoque para simular uma "situação".
			*/
			
			//Criação do Sistema
			JFrame Sistema = new JFrame();
			Sistema.setSize(500, 300);
			Sistema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Sistema.setTitle("Lanchonete ProWay");
			Sistema.setLocationRelativeTo(null);
			Sistema.setLayout(null);
			Sistema.setResizable(false);
			
			//Paineis Bloco Principal
			JPanel Painel01 = new JPanel();
			Painel01.setLayout(null);
			Painel01.setSize(487, 245);
			Painel01.setBackground(new Color(255, 255, 255));
			
			JPanel Painel02 = new JPanel();
			Painel02.setLayout(null);
			Painel02.setSize(500, 500);
			Painel02.setBackground(new Color(25, 25, 128));
			
			//Textura Painel Bloco Principal
			
			JLabel Textura1 = new JLabel();
			URL Imagem;
			try {
				Imagem = new URL("https://www.centerfabril.com.br/media/catalog/product/cache/3/image/9df78eab33525d08d6e5fb8d27136e95/9/0/90107_guna_bordo_peq_.jpg");
				ImageIcon icone = new ImageIcon(Imagem);
				Textura1.setIcon(icone);
				Textura1.setBounds(1, 1, 500, 500);
			} catch (Exception e) {	}
			Painel01.add(Textura1);
			
			JLabel Textura2 = new JLabel();
			URL Imagem1;
			try {
				Imagem1 = new URL("file:///C:/Users/User/Downloads/Text2.png");
				ImageIcon icone1 = new ImageIcon(Imagem1);
				Textura2.setIcon(icone1);
				Textura2.setBounds(1, 1, 700, 700);
			} catch (Exception e) {	}
			Painel02.add(Textura2);
			
			//Botões
				JButton btn1 = new JButton("Comprar");
				btn1.setBounds(62, 20, 350, 20);
				Painel01.add(btn1);
				
					
				JButton btn2 = new JButton("Visualizar cardápio");
				btn2.setBounds(62, 70, 350, 20);
				Painel01.add(btn2);
				
				JButton btn5 = new JButton("Sugerir produto(s) para cardápio");
				btn5.setBounds(62, 120, 350, 20);
				Painel01.add(btn5);
				
				JButton btn6 = new JButton("Contato/Suporte");
				btn6.setBounds(62, 170, 350, 20);
				Painel01.add(btn6);
				
				//Área Restrita
				JButton btn7 = new JButton("AR");
				btn7.setBounds(430, 15, 50, 20);
				Painel01.add(btn7);
				
				//Ação no botão 1
				
					btn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						if(TotHamb == 0) {
							DispHamb = "Esgotado";
						}else if(TotHamb >= 1) {
							DispHamb = "Disponível";
						}
						if(TotCox == 0) {
							DispCox = "Esgotado";
						}else if(TotCox >= 1) {
							DispCox = "Disponível";
						}	
						if(TotUva == 0) {
							DispUva = "Esgotado";
						}else if(TotUva >= 1) {
							DispUva = "Disponível";
						}
						if(TotLara == 0) {
							DispLara = "Esgotado";
						}else if(TotLara >= 1) {
							DispLara = "Disponível";
						}	String Cardapio = "\nHamburguer \nQuantidade: "+DispHamb+"\nPreço: R$13,00 \n\nCoxinha \nQuantidade: "+DispCox+"\nPreço: R$9,00\n\nSuco de uva \nQuantidade: "+DispUva+"\nPreço: R$5,00\n\nSuco de laranja: \nQuantidade:  "+DispLara+"\nPreço: R$5,00";
						
						
					JOptionPane.showMessageDialog(null, "Bem vindo a Lanchonete ProWay",null, JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(null, "Caso não tenha visto nosso cardápio, temos os seguintes produtos: "+Cardapio,null, JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(null, "Agora que você já sabe o que temos disponível no momento, escolha seu pedido",null, JOptionPane.PLAIN_MESSAGE);
					
					//Escolha da compra
					JFrame EscolhaCardapio = new JFrame();
					EscolhaCardapio.setSize(510, 300);
					EscolhaCardapio.setTitle("Compra");
					EscolhaCardapio.setLocationRelativeTo(null);
					EscolhaCardapio.setLayout(null);
					EscolhaCardapio.setResizable(false);
					
					//Paineis Bloco Principal
					JPanel Painel03 = new JPanel();
					Painel03.setLayout(null);
					Painel03.setSize(497, 245);
					Painel03.setBackground(new Color(255, 255, 255));
					
					JPanel Painel04 = new JPanel();
					Painel04.setLayout(null);
					Painel04.setSize(500, 500);
					Painel04.setBackground(new Color(25, 25, 128));
					
					//Textura Painel Bloco Principal
					
					JLabel Textura3 = new JLabel();
					URL Imagem2;
					try {
						Imagem2 = new URL("https://www.centerfabril.com.br/media/catalog/product/cache/3/image/9df78eab33525d08d6e5fb8d27136e95/9/0/90107_guna_bordo_peq_.jpg");
						ImageIcon icone2 = new ImageIcon(Imagem2);
						Textura3.setIcon(icone2);
						Textura3.setBounds(1, 1, 500, 500);
					} catch (Exception e1) {	}
					Painel03.add(Textura3);
					
					JLabel Textura4 = new JLabel();
					URL Imagem3;
					try {
						Imagem3 = new URL("file:///C:/Users/User/Downloads/Text2.png");
						ImageIcon icone3 = new ImageIcon(Imagem3);
						Textura4.setIcon(icone3);
						Textura4.setBounds(1, 1, 700, 700);
					} catch (Exception e1) {	}
					Painel04.add(Textura4);
					
					//CheckBox
					JCheckBox rbt1 = new JCheckBox("Hamburguer");
					rbt1.setBounds(10,  10, 100, 20);
					rbt1.setActionCommand("Efetuando compra de Hamburguer");
					rbt1.setOpaque(false);
					rbt1.setForeground(new Color(255, 255, 255));
					
					JCheckBox rbt2 = new JCheckBox("Coxinha");
					rbt2.setBounds(10,  40, 100, 20);
					rbt2.setActionCommand("Efetuando compra de Coxinha");
					rbt2.setOpaque(false);
					rbt2.setForeground(new Color(255, 255, 255));
					
					JCheckBox rbt3 = new JCheckBox("Suco de uva");
					rbt3.setBounds(10,  70, 100, 20);
					rbt3.setActionCommand("Efetuando compra de Suco de uva");
					rbt3.setOpaque(false);
					rbt3.setForeground(new Color(255, 255, 255));
					
					JCheckBox rbt4 = new JCheckBox("Suco de laranja");
					rbt4.setBounds(10,  100, 200, 20);
					rbt4.setActionCommand("Efetuando compra de Suco de laranja");
					rbt4.setOpaque(false);
					rbt4.setForeground(new Color(255, 255, 255));
					
					//Botão
					JButton btn = new JButton("Escolha um produto, caso necessário, a opção cardápio ainda está disponível");
					btn.setBounds(10, 130, 474, 20);
					
					//Agrupar botões de rádio
					ButtonGroup bg = new ButtonGroup();
					bg.add(rbt1);
					bg.add(rbt2);
					bg.add(rbt3);
					bg.add(rbt4);
					
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
		
							
						try {
						//getSelection: Obtém o Radio Button selecionado
						//getActionCommand: retorna um valor do Radio Button
							qtdComprado = 0;
							JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());
						}catch(Exception er) {
							JOptionPane.showMessageDialog(null, "Favor, selecionar uma opção",null, JOptionPane.WARNING_MESSAGE);
						}
							
							if(rbt1.isSelected()) {					 
								qtdComprado = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja comprar"));
								while (qtdComprado>TotHamb) {
									JOptionPane.showMessageDialog(null, "Quantidade não disponível, apenas "+TotHamb+" em estoque, tente novamente",null, JOptionPane.WARNING_MESSAGE);
									qtdComprado = 0;
								}
							TotHamb = TotHamb - qtdComprado;
							if (TotHamb <0) {
								TotHamb = 0;
							}
								TotPag = PrHamb * qtdComprado;
							}else if(rbt2.isSelected()) {					 
								qtdComprado = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja comprar"));
								while (qtdComprado>TotCox) {
									JOptionPane.showMessageDialog(null, "Quantidade não disponível, apenas "+TotCox+" em estoque, tente novamente",null, JOptionPane.WARNING_MESSAGE);
									qtdComprado = 0;
								}
								TotCox = TotCox - qtdComprado;
								if (TotCox <0) {
									TotCox = 0;
								}
								TotPag = PrCox * qtdComprado;
							}else if(rbt3.isSelected()) {					 
								qtdComprado = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja comprar"));
								while (qtdComprado>TotUva) {
									JOptionPane.showMessageDialog(null, "Quantidade não disponível, apenas "+TotUva+" em estoque, tente novamente",null, JOptionPane.WARNING_MESSAGE);
									qtdComprado = 0;
								}
								TotUva = TotUva - qtdComprado;
								if (TotUva <0) {
									TotUva = 0;
								}
								TotPag = PrUva * qtdComprado;
							}else if(rbt4.isSelected()) {					 
								qtdComprado = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja comprar"));
								while (qtdComprado>TotLara) {
									JOptionPane.showMessageDialog(null, "Quantidade não disponível, apenas "+TotLara+" em estoque, tente novamente",null, JOptionPane.WARNING_MESSAGE);
									qtdComprado = 0;
								}
								TotLara = TotLara - qtdComprado;
								if (TotLara <0) {
									TotLara = 0;
								}
								TotPag = PrLara * qtdComprado;
							}
							pagamento = Double.parseDouble(JOptionPane.showInputDialog("O total da compra foi: "+TotPag+" Insira um valor para pagamento"));
							if ((pagamento >= TotPag) && (qtdComprado != 0)) {
							PagF = pagamento;
						troco = pagamento - TotPag;
						
						JOptionPane.showMessageDialog(null, "O seu troco é de: R$"+troco+" Obrigado pela compra tenha um bom dia",null, JOptionPane.PLAIN_MESSAGE);
						
						}while (pagamento <TotPag) {
							JOptionPane.showMessageDialog(null, "Pagamento Insuficiente, sua compra foi cancelada",null, JOptionPane.WARNING_MESSAGE);
							System.exit(0);
						}
						
					
						}
						});
				
					
					
					//Add opções do cardápio 
					EscolhaCardapio.add(rbt1);
					EscolhaCardapio.add(rbt2);
					EscolhaCardapio.add(rbt3);
					EscolhaCardapio.add(rbt4);
					EscolhaCardapio.add(btn);
					EscolhaCardapio.add(Painel03);
					EscolhaCardapio.add(Painel04);
					
					//Exibir opções para compra e devidos componentes
					EscolhaCardapio.setVisible(true);
						
					

					}});
				
				//Ação no botão 2
				
				btn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
						if(TotHamb == 0) {
							DispHamb = "Esgotado";
						}else if(TotHamb >= 1) {
							DispHamb = "Disponível";
						}
						if(TotCox == 0) {
							DispCox = "Esgotado";
						}else if(TotCox >= 1) {
							DispCox = "Disponível";
						}	
						if(TotUva == 0) {
							DispUva = "Esgotado";
						}else if(TotUva >= 1) {
							DispUva = "Disponível";
						}
						if(TotLara == 0) {
							DispLara = "Esgotado";
						}else if(TotLara >= 1) {
							DispLara = "Disponível";
						}	String Cardapio = "\nHamburguer \nQuantidade: "+DispHamb+"\nPreço: R$13,00 \n\nCoxinha \nQuantidade: "+DispCox+"\nPreço: R$9,00\n\nSuco de uva \nQuantidade: "+DispUva+"\nPreço: R$5,00\n\nSuco de laranja: \nQuantidade:  "+DispLara+"\nPreço: R$5,00";
							JOptionPane.showMessageDialog(null, "O cardápio é: "+Cardapio);	
					}
					});
				
				
				//Ação no botão 5
				
				//Váriavel do vetor de sugestões
				String[] Sugestion = new String[100];
				
				btn5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
								
						JOptionPane.showMessageDialog(null, "Nosso estabelecimento está aberto para receber sugestões, para agradarmos nossos clientes ao máximo. \n  Por favor, insira sua sugestão");
						
						do {
						Sugestion[índice] = JOptionPane.showInputDialog("Sugestão:");
						índice++;
						
						ContinuarSugerindo = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' para outra sugestão ou '2' para encerrar sugestões"));
						}while (ContinuarSugerindo != 2);
						JOptionPane.showMessageDialog(null, "Obrigado por contribuir com nosso estabelecimento, tenha um bom dia!");
					}
					});	
				
				//Ação no botão 6
				
				btn6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
				
				JFrame Suporte = new JFrame();
				Suporte.setSize(815, 350);
				Suporte.setTitle("Contato/Suporte");
				Suporte.setLocationRelativeTo(null);
				Suporte.setLayout(null);
				Suporte.setResizable(false);
				
				//Paineis Bloco Principal
				JPanel Painel05= new JPanel();
				Painel05.setLayout(null);
				Painel05.setSize(837, 295);
				Painel05.setBackground(new Color(255, 255, 255));
				
				JPanel Painel06 = new JPanel();
				Painel06.setLayout(null);
				Painel06.setSize(1000, 1000);
				Painel06.setBackground(new Color(25, 25, 128));
				
				//Textura Painel Bloco Principal
				
				JLabel Textura5 = new JLabel();
				URL Imagem4;
				try {
					Imagem4 = new URL("https://www.centerfabril.com.br/media/catalog/product/cache/3/image/9df78eab33525d08d6e5fb8d27136e95/9/0/90107_guna_bordo_peq_.jpg");
					ImageIcon icone4 = new ImageIcon(Imagem4);
					Textura5.setIcon(icone4);
					Textura5.setBounds(1, 1, 900, 300);
				} catch (Exception e1) {	}
				Painel05.add(Textura5);
				
				JLabel Textura6 = new JLabel();
				URL Imagem5;
				try {
					Imagem5 = new URL("file:///C:/Users/User/Downloads/Text2.png");
					ImageIcon icone5 = new ImageIcon(Imagem5);
					Textura6.setIcon(icone5);
					Textura6.setBounds(1, 1, 1000, 1000);
				} catch (Exception e1) {	}
				Painel06.add(Textura6);
				
				//Botões
				JButton Sup0 = new JButton("Lanchonete ProWay");
				Sup0.setBounds(50, 10, 700, 20);
				
				JButton Sup1 = new JButton("Tele entrega: (47)3329-2929");
				Sup1.setBounds(50, 40, 700, 20);
					
				JButton Sup2 = new JButton("Contato Whatsapp: 98926-2929");
				Sup2.setBounds(50, 70, 700, 20);
				
				JButton Sup3 = new JButton("Endereço: Rua 7 de Setembro, 1213 - Centro, Blumenau - SC, 89010-911");
				Sup3.setBounds(50, 100, 700, 20);
					
				JButton Sup4 = new JButton("Horário de funcionamento: Segunda à Sexta: 10:00 - 22:00, Sábados e Domingos: 10:00 - 00:00, Feriados: 13:00 - 20:00");
				Sup4.setBounds(50, 130, 700, 20);
				
				JButton Sup5 = new JButton("Facebook: LanchoneteProWay ");
				Sup5.setBounds(50, 160, 700, 20);
				
				JButton Sup6 = new JButton("Instagram: lanchonete_proway ");
				Sup6.setBounds(50, 190, 700, 20);
				
				JButton Sup7 = new JButton("Twitter: @ProWay_Lanchonete, 'LanchoneteProWay'");
				Sup7.setBounds(50, 220, 700, 20);
				
				JButton Sup8 = new JButton("Suporte Técnico: www.LanchoneteProWaySuporteAoCliente.com.br");
				Sup8.setBounds(50, 250, 700, 20);
				
				
				//Add elementos ao Suporte
				
				Suporte.add(Sup0);
				Suporte.add(Sup1);
				Suporte.add(Sup2);
				Suporte.add(Sup3);
				Suporte.add(Sup4);
				Suporte.add(Sup5);
				Suporte.add(Sup6);
				Suporte.add(Sup7);
				Suporte.add(Sup8);
				Suporte.add(Painel05);
				Suporte.add(Painel06);

				
				//Exibir Suporte e devidos componentes
				Suporte.setVisible(true);
				
				
				
			
					}
				});	
				
				//Ação no botão 7
				
				btn7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						//Senha = ProWay
						String Senha = JOptionPane.showInputDialog("Insira a senha");
						if (Senha.equals("ProWay")) {
				
				JFrame Restrito = new JFrame();
				Restrito.setSize(415, 250);
				Restrito.setTitle("Funcionários");
				Restrito.setLocationRelativeTo(null);
				Restrito.setLayout(null);
				Restrito.setResizable(false);
				
				//Paineis Bloco Principal
				JPanel Painel07= new JPanel();
				Painel07.setLayout(null);
				Painel07.setSize(400, 195);
				Painel07.setBackground(new Color(255, 255, 255));
				
				JPanel Painel08 = new JPanel();
				Painel08.setLayout(null);
				Painel08.setSize(415, 250);
				Painel08.setBackground(new Color(25, 25, 128));
				
				//Textura Painel Bloco Principal
				
				JLabel Textura7 = new JLabel();
				URL Imagem6;
				try {
					Imagem6 = new URL("https://www.centerfabril.com.br/media/catalog/product/cache/3/image/9df78eab33525d08d6e5fb8d27136e95/9/0/90107_guna_bordo_peq_.jpg");
					ImageIcon icone6 = new ImageIcon(Imagem6);
					Textura7.setIcon(icone6);
					Textura7.setBounds(1, 1, 465, 250);
				} catch (Exception e1) {	}
				Painel07.add(Textura7);
				
				JLabel Textura8 = new JLabel();
				URL Imagem7;
				try {
					Imagem7 = new URL("file:///C:/Users/User/Downloads/Text2.png");
					ImageIcon icone7 = new ImageIcon(Imagem7);
					Textura8.setIcon(icone7);
					Textura8.setBounds(1, 1, 1000, 1000);
				} catch (Exception e1) {	}
				Painel08.add(Textura8);
				
				//Botôes
				JButton btn3 = new JButton("Adicionar produtos ao estoque");
				btn3.setBounds(50, 20, 300, 20);
				Painel01.add(btn3);	
				
				JButton btn4 = new JButton("Visualizar estoque");
				btn4.setBounds(50, 70, 300, 20);
				Painel07.add(btn4);
			
				//Ação no botão 3
				
				//Adicionar em estoque
				btn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
					String Opção = JOptionPane.showInputDialog("Insira o produto que deseja adicionar ao estoque");
						if(Opção.equals("Hamburguer")) {
							int QtdAddHamb= Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja adicionar"));
						int	qtdHamb = QtdAddHamb;
						TotHamb = TotHamb + qtdHamb;
						}else if(Opção.equals("Coxinha")) {
							int QtdAddCox= Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja adicionar"));
						int	qtdCox = QtdAddCox;
						TotCox = TotCox + qtdCox;
						}else if(Opção.equals("Suco de uva")) {
							int QtdAddUva= Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja adicionar"));
						int	qtdUva = QtdAddUva;
						TotUva = TotUva + qtdUva;
						}else if(Opção.equals("Suco de laranja")) {
							int QtdAddLara= Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade que deseja adicionar"));
						int	qtdLara = QtdAddLara;
						TotLara = TotLara + qtdLara;
						} JOptionPane.showMessageDialog(null, "Produto(s) adicionado(s) com sucesso");
						
					}
					});
				
				//Ação no botão 4
				
				//Visualizar estoque
				btn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
							
							JOptionPane.showMessageDialog(null, "Os produtos disponíveis dentro do estoque são: \nHamburguer \nQuantidade: "+TotHamb+"\n\nCoxinha \nQuantidade: "+TotCox+"\n\nSuco de uva \nQuantidade: "+TotUva+"\n\nSuco de laranja \nQuantidade: "+TotLara);	                            
						
						
						
					}
				}
					);	
				
				//Add elementos ao Suporte

				Restrito.add(btn3);
				Restrito.add(btn4);
				Restrito.add(Painel07);
				Restrito.add(Painel08);
				
				//Exibir Suporte e devidos componentes
				Restrito.setVisible(true);
				
					}else {
						JOptionPane.showMessageDialog(null, "Senha Inválida, acesso apenas para funcionários", null, JOptionPane.ERROR_MESSAGE);
					}
					
					}
					});	
			
			//Add elementos ao Sistema
				Sistema.add(btn1);
				Sistema.add(btn2);
				Sistema.add(btn5);
				Sistema.add(btn6);
				Sistema.add(btn7);
				Sistema.add(Painel01);
				Sistema.add(Painel02);
				
			//Exibir Sistema e devidos componentes
				Sistema.setVisible(true);
			
			
			
		}

	}
