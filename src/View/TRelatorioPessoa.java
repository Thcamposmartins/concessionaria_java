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
import Model.Veiculo;

public class TRelatorioPessoa {

	private JFrame frame;
	private JTextField txtPesqPessoa;
	private JButton btnAtualizar;
	private JButton btnApagar;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnVoltar;
	private JButton btnOk;

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
		panel.setBounds(10, 202, 161, 59);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID Pessoa");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 27, 55, 21);
		panel.add(lblNewLabel_1);
		
		txtPesqPessoa = new JTextField();
		txtPesqPessoa.setColumns(10);
		txtPesqPessoa.setBounds(66, 27, 25, 21);
		panel.add(txtPesqPessoa);
		
		btnOk = new JButton("OK");

		btnOk.setBounds(101, 18, 50, 30);
		panel.add(btnOk);
		btnOk.setHorizontalAlignment(SwingConstants.LEFT);
		btnOk.setForeground(new Color(0, 128, 128));
		btnOk.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnOk.setBackground(new Color(211, 211, 211));
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnAtualizar.setForeground(new Color(0, 128, 128));
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnAtualizar.setBackground(new Color(211, 211, 211));
		btnAtualizar.setBounds(181, 212, 77, 38);
		getFrame().getContentPane().add(btnAtualizar);
		
		btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TMain.listPessoa.removePessoa(Integer.parseInt(txtPesqPessoa.getText()));
			}
		});
		btnApagar.setForeground(new Color(0, 128, 128));
		btnApagar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnApagar.setBackground(new Color(211, 211, 211));
		btnApagar.setBounds(264, 212, 77, 38);
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
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnVoltar.setForeground(new Color(0, 128, 128));
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnVoltar.setBackground(new Color(211, 211, 211));
		btnVoltar.setBounds(345, 212, 79, 38);
		frame.getContentPane().add(btnVoltar);
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
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) table.getModel()).setRowCount(0);
				for(Pessoa pessoa : TMain.listPessoa.pessoasList) {
					model.addRow(new Object[]{
							pessoa.getId(),
							pessoa.getNome(),
							pessoa.getIdade(),
							pessoa.getCpf(),
							pessoa.getTelefone(),
							pessoa.getEmail()});
					
				}; 
			}});
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel) table.getModel()).setRowCount(0);				
				for(Pessoa pessoa : TMain.listPessoa.pessoasList) {
					if (Integer.parseInt(txtPesqPessoa.getText())==pessoa.getId()) {
						model.addRow(new Object[]{
								pessoa.getId(),
								pessoa.getNome(),
								pessoa.getIdade(),
								pessoa.getCpf(),
								pessoa.getTelefone(),
								pessoa.getEmail()});
			}}
			}
		});
	}
	

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
