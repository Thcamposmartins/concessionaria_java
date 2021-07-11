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

import Model.Venda;
import Model.Veiculo;
import Controller.VeiculoController;


import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TVenda {

	private JFrame frame;
	private JTextField textVeiculo;
	private JTextField textCor;
	private JTextField textPreco;
	private JTextField textID;
	private JTable table;
	private JTextField textCategoria;

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
		textVeiculo.setEnabled(false);
		textCor.setEnabled(false);
		textCategoria.setEnabled(false);
		textPreco.setEnabled(false);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.controlHighlight);
		frame.setBounds(100, 100, 450, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVendas = new JLabel("Vender Ve\u00EDculo");
		lblVendas.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblVendas.setBackground(SystemColor.controlHighlight);
		lblVendas.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVendas.setForeground(new Color(0, 139, 139));
		lblVendas.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblVendas.setBounds(10, 254, 179, 38);
		frame.getContentPane().add(lblVendas);
		
		JPanel venda = new JPanel();
		venda.setLayout(null);
		venda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		venda.setBackground(SystemColor.controlHighlight);
		venda.setBounds(10, 283, 416, 111);
		frame.getContentPane().add(venda);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ve\u00EDculo:");
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 56, 46, 14);
		venda.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cor:");
		lblNewLabel_1_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1_2.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 83, 46, 14);
		venda.add(lblNewLabel_1_2);
		
		textVeiculo = new JTextField();
		textVeiculo.setColumns(10);
		textVeiculo.setBounds(56, 53, 125, 20);
		venda.add(textVeiculo);
		
		textCor = new JTextField();
		textCor.setColumns(10);
		textCor.setBounds(56, 80, 125, 20);
		venda.add(textCor);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Categoria:");
		lblNewLabel_1_1_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(239, 56, 75, 14);
		venda.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Pre\u00E7o:");
		lblNewLabel_1_1_2_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1_2_1.setBounds(239, 29, 68, 14);
		venda.add(lblNewLabel_1_1_2_1);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(309, 26, 95, 20);
		venda.add(textPreco);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(10, 29, 46, 14);
		venda.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		
		textID = new JTextField();
		textID.setBounds(56, 26, 46, 20);
		venda.add(textID);
		textID.setColumns(10);
		
		textCategoria = new JTextField();
		textCategoria.setColumns(10);
		textCategoria.setBounds(309, 53, 95, 20);
		venda.add(textCategoria);
		
		JButton btnNovo = new JButton("Carregar");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textVeiculo.setText("");
				textCor.setText("");
				textCategoria.setText("");
				textPreco.setText("");
			}
		});
		btnNovo.setForeground(new Color(0, 139, 139));
		btnNovo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNovo.setBackground(new Color(169, 169, 169));
		btnNovo.setBounds(179, 404, 76, 43);
		frame.getContentPane().add(btnNovo);
		
		JButton btnSalvar = new JButton("Vender");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Venda venda = new Venda();
				
				venda.setCategoria(textCategoria.getText());
				venda.setCor(textCor.getText());
				venda.setId(Integer.parseInt(textID.getText()));
				venda.setVeiculo(textVeiculo.getText());
				venda.setPreco(Double.parseDouble(textPreco.getText()));
				TMain.listVenda.addVendas(venda);
				
				VeiculoController veiculo = new VeiculoController();
				veiculo.removeVeiculo(Integer.parseInt(textID.getText()));
			}
		});
		btnSalvar.setForeground(new Color(0, 139, 139));
		btnSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSalvar.setBackground(new Color(169, 169, 169));
		btnSalvar.setBounds(264, 404, 76, 43);
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
		btnCancelar.setBounds(350, 404, 76, 43);
		frame.getContentPane().add(btnCancelar);
		
		table = new JTable();
		table.setBounds(10, 45, 416, 195);
		frame.getContentPane().add(table);
		
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
