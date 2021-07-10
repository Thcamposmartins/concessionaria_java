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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import Controller.PessoasController;
import Model.Pessoa;

public class TRelatorioPessoa {

	private JFrame frame;
	private JTextField textLookID;
	private JButton btnAtualizar;
	private JButton btnApagar;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRelatorioPessoa window = new TRelatorioPessoa();
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
	public TRelatorioPessoa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
		
	private void initialize() {

		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(new Color(211, 211, 211));
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblRe = new JLabel("Relatorio de cadastros ");
		lblRe.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRe.setForeground(new Color(0, 128, 128));
		lblRe.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblRe.setBounds(10, 11, 258, 38);
		getFrame().getContentPane().add(lblRe);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 139, 139));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pesquisa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		panel.setBounds(10, 212, 129, 38);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID Pessoa");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 17, 66, 14);
		panel.add(lblNewLabel_1);
		
		textLookID = new JTextField();
		textLookID.setColumns(10);
		textLookID.setBounds(71, 17, 46, 14);
		panel.add(textLookID);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LoadTablePessoas();
			}
		});
		btnAtualizar.setForeground(new Color(0, 128, 128));
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnAtualizar.setBackground(new Color(169, 169, 169));
		btnAtualizar.setBounds(239, 208, 82, 43);
		getFrame().getContentPane().add(btnAtualizar);
		
		btnApagar = new JButton("Apagar");
		btnApagar.setForeground(new Color(0, 128, 128));
		btnApagar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnApagar.setBackground(new Color(169, 169, 169));
		btnApagar.setBounds(342, 208, 82, 43);
		getFrame().getContentPane().add(btnApagar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 414, 165);
		frame.getContentPane().add(scrollPane);
		
		
		table = new JTable(new DefaultTableModel(new Object[]{}, 0));
		scrollPane.setViewportView(table);
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBackground(new Color(211, 211, 211));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Idade", "CPF", "Telefone", "E-mail"
			}
		));
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		for(Pessoa pessoa : TMain.listPessoa.pessoasList) {
			model.addRow(new Object[]{
					pessoa.getId(),
					pessoa.getNome(),
					pessoa.getIdade(),
					pessoa.getCpf(),
					pessoa.getTelefone(),
					pessoa.getEmail()});
			
		}; 
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
