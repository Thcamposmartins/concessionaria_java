package View;

import java.awt.EventQueue;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


import Model.Veiculo;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;


public class TRelatorioVeiculo {

	private JFrame frame;
	private JTable table;
	private JTextField texPesVec;
	private JTextField txtVeicRel;
	private JTextField txtCorRel;
	private JTextField txtValRel;
	private JTextField txtIdRel;
	private JTextField txtCatRel;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRelatorioVeiculo window = new TRelatorioVeiculo();
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
	public TRelatorioVeiculo() {
		initialize();
	}
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
		
		JLabel lblRe = new JLabel("Relatorio de cadastros ");
		lblRe.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRe.setForeground(new Color(0, 128, 128));
		lblRe.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblRe.setBounds(10, 11, 258, 38);
		panel.add(lblRe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Estoque", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(10, 39, 414, 116);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 394, 86);
		panel_2.add(scrollPane);
		
		table = new JTable(new DefaultTableModel(new Object[]{}, 0));
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBackground(new Color(211, 211, 211));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Cor", "Valor", "Categoria"
			}
		));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Vendidos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_2_1.setBackground(new Color(211, 211, 211));
		panel_2_1.setBounds(10, 152, 414, 116);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 21, 394, 84);
		panel_2_1.add(scrollPane_1);
		
		table_1 = new JTable(new DefaultTableModel(new Object[]{}, 0));
		scrollPane_1.setViewportView(table_1);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table_1.setBackground(new Color(211, 211, 211));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Cor", "Valor", "Categoria"
			}
		));
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

		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			((DefaultTableModel) table_1.getModel()).setRowCount(0);	
			DefaultTableModel model2 = (DefaultTableModel) table_1.getModel();
			
			for(Veiculo veiculo : TMain.listVeiculo.veiculosOff) {
				model2.addRow(new Object[]{
						veiculo.getID(),
						veiculo.getNome(),
						veiculo.getCor(),
						veiculo.getPreco(),
						veiculo.getCategoria()
						});
				
			}; 
			((DefaultTableModel) table.getModel()).setRowCount(0);
			for(Veiculo veiculo : TMain.listVeiculo.veiculosList) {
				model.addRow(new Object[]{
						veiculo.getID(),
						veiculo.getNome(),
						veiculo.getCor(),
						veiculo.getPreco(),
						veiculo.getCategoria()
						});				
			}; 
	
				
		}});
		btnAtualizar.setForeground(new Color(0, 128, 128));
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnAtualizar.setBackground(new Color(211, 211, 211));
		btnAtualizar.setBounds(186, 427, 77, 43);
		panel.add(btnAtualizar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				TMain.listVeiculo.removeVeiculo(Integer.parseInt(texPesVec.getText()));
				}
				catch(Exception ex) {
					Logger.getLogger("Error"+ ex);
				}
			}
		});
		btnApagar.setForeground(new Color(0, 128, 128));
		btnApagar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnApagar.setBackground(new Color(211, 211, 211));
		btnApagar.setBounds(267, 427, 77, 43);
		panel.add(btnApagar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(0, 139, 139));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 267, 173, 49);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("ID Veiculo");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 24, 66, 14);
		panel_1.add(lblNewLabel_1);
		
		texPesVec = new JTextField();
		texPesVec.setColumns(10);
		texPesVec.setBounds(68, 24, 37, 14);
		panel_1.add(texPesVec);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) table.getModel()).setRowCount(0);	
				txtIdRel.setText(texPesVec.getText());
				
				for(Veiculo veiculo : TMain.listVeiculo.veiculosList) {
					if (Integer.parseInt(texPesVec.getText())==veiculo.getID()) {						
						model.addRow(new Object[]{
								veiculo.getID(),
								veiculo.getNome(),
								veiculo.getCor(),
								veiculo.getPreco(),
								veiculo.getCategoria()
								});				
					}			
				}
			}
		});
		btnOk.setForeground(new Color(0, 128, 128));
		btnOk.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnOk.setBackground(new Color(211, 211, 211));
		btnOk.setBounds(115, 11, 49, 33);
		panel_1.add(btnOk);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnVoltar.setForeground(new Color(0, 128, 128));
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnVoltar.setBackground(new Color(211, 211, 211));
		btnVoltar.setBounds(347, 427, 77, 43);
		panel.add(btnVoltar);
		
		JPanel venda = new JPanel();
		venda.setLayout(null);
		venda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados Veiculo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		venda.setBackground(new Color(211, 211, 211));
		venda.setBounds(10, 320, 416, 96);
		panel.add(venda);
		
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
		lblNewLabel_1_2.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setAlignmentX(0.5f);
		lblNewLabel_1_2.setBounds(10, 68, 46, 14);
		venda.add(lblNewLabel_1_2);
		
		txtVeicRel = new JTextField();
		txtVeicRel.setColumns(10);
		txtVeicRel.setBounds(56, 25, 125, 20);
		venda.add(txtVeicRel);
		
		txtCorRel = new JTextField();
		txtCorRel.setColumns(10);
		txtCorRel.setBounds(56, 65, 125, 20);
		venda.add(txtCorRel);
		
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
		
		txtValRel = new JTextField();
		txtValRel.setColumns(10);
		txtValRel.setBounds(309, 40, 95, 20);
		venda.add(txtValRel);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID:");
		lblNewLabel_1_3.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(309, 14, 46, 14);
		venda.add(lblNewLabel_1_3);
		
		txtIdRel = new JTextField();
		txtIdRel.setEnabled(false);
		txtIdRel.setColumns(10);
		txtIdRel.setBounds(358, 11, 46, 20);
		venda.add(txtIdRel);
		
		txtCatRel = new JTextField();
		txtCatRel.setColumns(10);
		txtCatRel.setBounds(309, 65, 95, 20);
		venda.add(txtCatRel);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Veiculo veiculo : TMain.listVeiculo.veiculosList) {
					if (Integer.parseInt(texPesVec.getText())==veiculo.getID()) {	
						
						veiculo.setNome(txtVeicRel.getText());
						veiculo.setCor(txtCorRel.getText());
						veiculo.setPreco(Double.parseDouble(txtValRel.getText()));
						veiculo.setCategoria(txtCatRel.getText());
					}
				}
				txtIdRel.setText("");
				txtVeicRel.setText("");
				txtCorRel.setText("");
				txtValRel.setText("");
				txtCatRel.setText("");
			}
		});
		btnEditar.setForeground(new Color(0, 128, 128));
		btnEditar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnEditar.setBackground(new Color(211, 211, 211));
		btnEditar.setBounds(106, 427, 77, 43);
		panel.add(btnEditar);		

	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
