package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class TRelatorioPessoa {

	private JFrame frame;
	private JTextField textLookID;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnAtualizar;
	private JButton btnApagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRelatorioPessoa window = new TRelatorioPessoa();
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
	public TRelatorioPessoa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRe = new JLabel("Relatorio de cadastros ");
		lblRe.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRe.setForeground(new Color(47, 79, 79));
		lblRe.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblRe.setBounds(10, 11, 258, 38);
		frame.getContentPane().add(lblRe);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new TitledBorder(null, "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 212, 129, 38);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID Pessoa");
		lblNewLabel_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 17, 66, 14);
		panel.add(lblNewLabel_1);
		
		textLookID = new JTextField();
		textLookID.setColumns(10);
		textLookID.setBounds(71, 17, 46, 14);
		panel.add(textLookID);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 153);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "Funcionario", "Idade", "CPF", "E-mail", "Nome", "ID", "Telefone"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(65);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(3).setPreferredWidth(111);
		table.getColumnModel().getColumn(4).setPreferredWidth(109);
		table.getColumnModel().getColumn(5).setPreferredWidth(117);
		table.getColumnModel().getColumn(6).setPreferredWidth(37);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		scrollPane.setViewportView(table);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizar.setForeground(new Color(47, 79, 79));
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAtualizar.setBackground(new Color(47, 79, 79));
		btnAtualizar.setBounds(239, 208, 82, 43);
		frame.getContentPane().add(btnAtualizar);
		
		btnApagar = new JButton("Apagar");
		btnApagar.setForeground(new Color(47, 79, 79));
		btnApagar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnApagar.setBackground(new Color(47, 79, 79));
		btnApagar.setBounds(342, 208, 82, 43);
		frame.getContentPane().add(btnApagar);
	}

}
