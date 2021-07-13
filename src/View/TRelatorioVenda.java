package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Model.Veiculo;
import Model.Venda;

import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TRelatorioVenda {

	private JFrame frame;
	private JTextField txtIdRel;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRelatorioVenda window = new TRelatorioVenda();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TRelatorioVenda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 450, 520);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 434, 481);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRelatorioDeVendas = new JLabel("Relatorio de vendas");
		lblRelatorioDeVendas.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRelatorioDeVendas.setForeground(new Color(0, 128, 128));
		lblRelatorioDeVendas.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblRelatorioDeVendas.setBounds(10, 11, 258, 38);
		panel.add(lblRelatorioDeVendas);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Vendas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(10, 42, 414, 363);
		panel.add(panel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 394, 330);
		panel_3.add(scrollPane);
		
	
		
		
		table = new JTable(new DefaultTableModel(new Object[]{}, 0));
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBackground(new Color(211, 211, 211));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Veiculo", "Categoria", "Cor", "Valor","ID Comprador", "Comprador", "Telefone Comprador"
			}
		));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for(Venda venda : TMain.listVenda.vendasList) {
			model.addRow(new Object[]{					
					venda.getId(),
					venda.getVeiculo(),
					venda.getCategoria(),
					venda.getCor(),
					venda.getPreco(),
					venda.getIdComprador(),
					venda.getNomeComprador(),
					venda.getTelefoneComprador(),	
					});
			
		}; 
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(0, 139, 139));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 416, 166, 56);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("ID Pessoa");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 27, 55, 21);
		panel_1.add(lblNewLabel_1);
		
		txtIdRel = new JTextField();
		txtIdRel.setColumns(10);
		txtIdRel.setBounds(66, 22, 25, 21);
		panel_1.add(txtIdRel);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) table.getModel()).setRowCount(0);	
				for(Venda venda : TMain.listVenda.vendasList) {
					if (Integer.parseInt(txtIdRel.getText())==venda.getIdComprador()) {
					model.addRow(new Object[]{					
							venda.getId(),
							venda.getVeiculo(),
							venda.getCategoria(),
							venda.getCor(),
							venda.getPreco(),
							venda.getIdComprador(),
							venda.getNomeComprador(),
							venda.getTelefoneComprador(),	
							});					
					}}; 				
			}
		});
		btnOk.setHorizontalAlignment(SwingConstants.LEFT);
		btnOk.setForeground(new Color(0, 128, 128));
		btnOk.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnOk.setBackground(new Color(211, 211, 211));
		btnOk.setBounds(101, 18, 50, 30);
		panel_1.add(btnOk);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getFrame().dispose();
			}
		});
		btnVoltar.setForeground(new Color(0, 128, 128));
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnVoltar.setBackground(new Color(211, 211, 211));
		btnVoltar.setBounds(345, 434, 79, 38);
		panel.add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) table.getModel()).setRowCount(0);	
				for(Venda venda : TMain.listVenda.vendasList) {
					model.addRow(new Object[]{					
							venda.getId(),
							venda.getVeiculo(),
							venda.getCategoria(),
							venda.getCor(),
							venda.getPreco(),
							venda.getIdComprador(),
							venda.getNomeComprador(),
							venda.getTelefoneComprador(),	
							});					
					}; 
			}
		});
		btnAtualizar.setForeground(new Color(0, 128, 128));
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnAtualizar.setBackground(new Color(211, 211, 211));
		btnAtualizar.setBounds(258, 434, 77, 38);
		panel.add(btnAtualizar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
