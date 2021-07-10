package View;

import java.awt.EventQueue;

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
	public TRelatorioVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
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
					if (texPesVec.getText()==veiculo.getID()) {
				}
					model.addRow(new Object[]{
							veiculo.getID(),
							veiculo.getNome(),
							veiculo.getCor(),
							veiculo.getPreco(),
							veiculo.getCategoria()
							});

				
			}}
		});
		btnAtualizar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAtualizar.setForeground(new Color(0, 128, 128));
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAtualizar.setBackground(new Color(169, 169, 169));
		btnAtualizar.setBounds(159, 213, 82, 43);
		panel.add(btnAtualizar);
		
		JButton btnApagar = new JButton("Apagar");
		btnApagar.setForeground(new Color(0, 128, 128));
		btnApagar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnApagar.setBackground(new Color(169, 169, 169));
		btnApagar.setBounds(251, 213, 82, 43);
		panel.add(btnApagar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(0, 139, 139));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(20, 213, 129, 38);
		panel.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("ID Veiculo");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 17, 66, 14);
		panel_1.add(lblNewLabel_1);
		
		texPesVec = new JTextField();
		texPesVec.setColumns(10);
		texPesVec.setBounds(71, 17, 46, 14);
		panel_1.add(texPesVec);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TMain window = new TMain();
				window.frame.setVisible(true);
			}
		});
		btnVoltar.setForeground(new Color(0, 128, 128));
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnVoltar.setBackground(new Color(169, 169, 169));
		btnVoltar.setBounds(343, 213, 82, 43);
		panel.add(btnVoltar);
	}
}
