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

import Model.Pessoa;
import Model.Veiculo;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TRelatorioVeiculo {

	private JFrame frame;
	private JTable table;
	private JTextField texPesVec;

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
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 434, 261);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblRe = new JLabel("Relatorio de cadastros ");
		lblRe.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRe.setForeground(new Color(0, 128, 128));
		lblRe.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblRe.setBounds(10, 11, 258, 38);
		panel.add(lblRe);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 414, 160);
		panel.add(scrollPane);

		table = new JTable(new DefaultTableModel(new Object[]{}, 0));
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBackground(new Color(211, 211, 211));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Cor", "Preco", "Categoria"
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
		btnAtualizar.setBounds(187, 213, 77, 43);
		panel.add(btnAtualizar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TMain.listVeiculo.removeVeiculo(Integer.parseInt(texPesVec.getText()));
			}
		});
		btnApagar.setForeground(new Color(0, 128, 128));
		btnApagar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnApagar.setBackground(new Color(211, 211, 211));
		btnApagar.setBounds(268, 213, 77, 43);
		panel.add(btnApagar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(0, 139, 139));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 207, 173, 49);
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
		btnVoltar.setBounds(348, 213, 77, 43);
		panel.add(btnVoltar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
