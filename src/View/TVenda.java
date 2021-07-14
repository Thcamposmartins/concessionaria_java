package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.showMessageDialog;

import Model.Venda;
import Model.Pessoa;
import Model.Veiculo;
import Controller.VeiculoController;


import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TVenda {

	private JFrame frame;
	private JTextField txtVendaVeic;
	private JTextField txtVendaCor;
	private JTextField txtVendaValor;
	private JTextField textID;
	private JTextField txtVendaCat;
	private JTable table;
	private JTextField txtNomeP;
	private JTextField txtEmailP;
	private JTextField txtCPFP;
	private JTextField txtIDP;
	private JTextField txtTelP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TVenda window = new TVenda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TVenda() {
		initialize();
		txtVendaVeic.setEnabled(false);
		txtVendaCor.setEnabled(false);
		txtVendaCat.setEnabled(false);
		txtVendaValor.setEnabled(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 42, 416, 116);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 416, 116);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Nome", "Cor", "Valor", "Categoria"
				}
			));
		
		JPanel venda = new JPanel();
		venda.setLayout(null);
		venda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		venda.setBackground(new Color(211, 211, 211));
		venda.setBounds(10, 317, 416, 96);
		frame.getContentPane().add(venda);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 28, 46, 14);
		venda.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("E-mail:");
		lblNewLabel_1_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setAlignmentX(0.5f);
		lblNewLabel_1_2.setBounds(10, 68, 46, 14);
		venda.add(lblNewLabel_1_2);
		
		txtNomeP = new JTextField();
		txtNomeP.setEnabled(false);
		txtNomeP.setColumns(10);
		txtNomeP.setBounds(56, 25, 125, 20);
		venda.add(txtNomeP);
		
		txtEmailP = new JTextField();
		txtEmailP.setEnabled(false);
		txtEmailP.setColumns(10);
		txtEmailP.setBounds(56, 65, 125, 20);
		venda.add(txtEmailP);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telefone:");
		lblNewLabel_1_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(232, 68, 75, 14);
		venda.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("CPF:");
		lblNewLabel_1_1_2_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_2_1.setBounds(231, 43, 68, 14);
		venda.add(lblNewLabel_1_1_2_1);
		
		txtCPFP = new JTextField();
		txtCPFP.setEnabled(false);
		txtCPFP.setColumns(10);
		txtCPFP.setBounds(309, 40, 95, 20);
		venda.add(txtCPFP);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(309, 14, 46, 14);
		venda.add(lblNewLabel_1);
		
		txtIDP = new JTextField();
		txtIDP.setColumns(10);
		txtIDP.setBounds(358, 11, 46, 20);
		venda.add(txtIDP);
		
		txtTelP = new JTextField();
		txtTelP.setEnabled(false);
		txtTelP.setColumns(10);
		txtTelP.setBounds(309, 65, 95, 20);
		venda.add(txtTelP);
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			
			for(Veiculo veiculo : TMain.listVeiculo.veiculosList) {
				model.addRow(new Object[]{
						veiculo.getID(),
						veiculo.getNome(),
						veiculo.getCor(),
						veiculo.getPreco(),
						veiculo.getCategoria()
						});
				
			}; 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(100, 100, 450, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVendas = new JLabel("Vender Veiculo");
		lblVendas.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblVendas.setBackground(SystemColor.controlHighlight);
		lblVendas.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVendas.setForeground(new Color(0, 139, 139));
		lblVendas.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblVendas.setBounds(10, 169, 179, 38);
		frame.getContentPane().add(lblVendas);
		
		JPanel venda = new JPanel();
		venda.setLayout(null);
		venda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados Veiculo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		venda.setBackground(new Color(211, 211, 211));
		venda.setBounds(10, 210, 416, 96);
		frame.getContentPane().add(venda);
		
		JLabel lblNewLabel_1_1 = new JLabel("Veiculo:");
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 28, 46, 14);
		venda.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cor:");
		lblNewLabel_1_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1_2.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 68, 46, 14);
		venda.add(lblNewLabel_1_2);
		
		txtVendaVeic = new JTextField();
		txtVendaVeic.setColumns(10);
		txtVendaVeic.setBounds(56, 25, 125, 20);
		venda.add(txtVendaVeic);
		
		txtVendaCor = new JTextField();
		txtVendaCor.setColumns(10);
		txtVendaCor.setBounds(56, 65, 125, 20);
		venda.add(txtVendaCor);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Categoria:");
		lblNewLabel_1_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(232, 68, 75, 14);
		venda.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Valor");
		lblNewLabel_1_1_2_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_2_1.setBounds(231, 43, 68, 14);
		venda.add(lblNewLabel_1_1_2_1);
		
		txtVendaValor = new JTextField();
		txtVendaValor.setColumns(10);
		txtVendaValor.setBounds(309, 40, 95, 20);
		venda.add(txtVendaValor);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(309, 14, 46, 14);
		venda.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		textID = new JTextField();
		textID.setBounds(358, 11, 46, 20);
		venda.add(textID);
		textID.setColumns(10);
		
		txtVendaCat = new JTextField();
		txtVendaCat.setColumns(10);
		txtVendaCat.setBounds(309, 65, 95, 20);
		venda.add(txtVendaCat);
		
		JButton btnNovo = new JButton("Carregar");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(Veiculo veiculo : TMain.listVeiculo.veiculosList) {
					if (Integer.parseInt(textID.getText())==veiculo.getID()) {						
						txtVendaVeic.setText(veiculo.getNome());
						txtVendaCor.setText(veiculo.getCor());
						txtVendaValor.setText(String.valueOf(veiculo.getPreco()));
						txtVendaCat.setText(veiculo.getCategoria());
					}
				}
				for(Pessoa pessoa : TMain.listPessoa.pessoasList) {
					if (Integer.parseInt(txtIDP.getText())==pessoa.getId()) {
						txtNomeP.setText(pessoa.getNome());
						txtCPFP.setText(pessoa.getCpf());
						txtTelP.setText(pessoa.getTelefone());
						txtEmailP.setText(pessoa.getEmail());
					}
				}
				
			}
		});
		btnNovo.setForeground(new Color(0, 139, 139));
		btnNovo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNovo.setBackground(new Color(169, 169, 169));
		btnNovo.setBounds(177, 424, 76, 43);
		frame.getContentPane().add(btnNovo);
		
		JButton btnSalvar = new JButton("Vender");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Venda venda = new Venda();
				
				venda.setCategoria(txtVendaCat.getText());
				venda.setCor(txtVendaCor.getText());
				venda.setId(Integer.parseInt(textID.getText()));
				venda.setVeiculo(txtVendaVeic.getText());
				venda.setPreco(Double.parseDouble(txtVendaValor.getText()));
				venda.setIdComprador(Integer.parseInt(txtIDP.getText()));
				venda.setNomeComprador(txtNomeP.getText());
				venda.setCpfComprador(txtCPFP.getText());
				venda.setEmailComprador(txtEmailP.getText());
				venda.setTelefoneComprador(txtTelP.getText());				
				try{
					TMain.listVenda.addVendas(venda);
					TMain.listVeiculo.removeVeiculo(Integer.parseInt(textID.getText()));
					}
				catch(Exception ex) {
					Logger.getLogger("Error"+ ex);
				}
				txtVendaCat.setText("");
				txtVendaCor.setText("");
				textID.setText("");
				txtVendaVeic.setText("");
				txtVendaValor.setText("");
				txtIDP.setText("");
				txtNomeP.setText("");
				txtCPFP.setText("");
				txtEmailP.setText("");
				txtTelP.setText("");
				showMessageDialog(null, "Venda cadastrada com sucesso !");
			}
			
		});
		btnSalvar.setForeground(new Color(0, 139, 139));
		btnSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSalvar.setBackground(new Color(169, 169, 169));
		btnSalvar.setBounds(262, 424, 76, 43);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancelar.setForeground(new Color(0, 139, 139));
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelar.setBackground(new Color(169, 169, 169));
		btnCancelar.setBounds(348, 424, 76, 43);
		frame.getContentPane().add(btnCancelar);
		
		JLabel lblEstoque = new JLabel("Estoque");
		lblEstoque.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEstoque.setForeground(new Color(0, 139, 139));
		lblEstoque.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblEstoque.setBackground(SystemColor.controlHighlight);
		lblEstoque.setAlignmentX(0.5f);
		lblEstoque.setBounds(10, 10, 100, 38);
		frame.getContentPane().add(lblEstoque);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
