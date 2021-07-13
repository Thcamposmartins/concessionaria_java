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
import java.util.logging.Logger;
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
	private JPanel venda;
	private JLabel txtNomeRel;
	private JLabel txtEmailRel;
	private JTextField txtNomeR;
	private JTextField txtEmailR;
	private JLabel txtTelRel;
	private JLabel txtCpfRel;
	private JTextField txtCPFR;
	private JLabel lblNewLabel;
	private JTextField txtIdRel;
	private JTextField txtTelefoneRel;
	private JButton btnEditar;
	private JTextField txtIdadeR;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTable table_1;
	private JScrollPane scrollPane_1;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTable table_2;
	private JTable table_3;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_3;

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
		getFrame().setBounds(100, 100, 450, 520);
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
		panel.setBounds(247, 271, 166, 56);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID Pessoa");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 27, 55, 21);
		panel.add(lblNewLabel_1);
		
		txtPesqPessoa = new JTextField();
		txtPesqPessoa.setColumns(10);
		txtPesqPessoa.setBounds(66, 22, 25, 21);
		panel.add(txtPesqPessoa);
		
		btnOk = new JButton("OK");

		btnOk.setBounds(101, 18, 50, 30);
		panel.add(btnOk);
		btnOk.setHorizontalAlignment(SwingConstants.LEFT);
		btnOk.setForeground(new Color(0, 128, 128));
		btnOk.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnOk.setBackground(new Color(211, 211, 211));
		
		btnAtualizar = new JButton("Atualizar");
		
		btnAtualizar.setForeground(new Color(0, 128, 128));
		btnAtualizar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnAtualizar.setBackground(new Color(211, 211, 211));
		btnAtualizar.setBounds(181, 439, 77, 38);
		getFrame().getContentPane().add(btnAtualizar);
		
		btnApagar = new JButton("Apagar");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				TMain.listPessoa.removePessoa(Integer.parseInt(txtPesqPessoa.getText()));
				}
				catch(Exception ex) {
					Logger.getLogger("Error"+ ex);
				}
			}
		});
		btnApagar.setForeground(new Color(0, 128, 128));
		btnApagar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnApagar.setBackground(new Color(211, 211, 211));
		btnApagar.setBounds(264, 439, 77, 38);
		getFrame().getContentPane().add(btnApagar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnVoltar.setForeground(new Color(0, 128, 128));
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnVoltar.setBackground(new Color(211, 211, 211));
		btnVoltar.setBounds(345, 439, 79, 38);
		frame.getContentPane().add(btnVoltar);
		
		venda = new JPanel();
		venda.setLayout(null);
		venda.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		venda.setBackground(new Color(211, 211, 211));
		venda.setBounds(10, 322, 416, 113);
		frame.getContentPane().add(venda);
		
		txtNomeRel = new JLabel("Nome:");
		txtNomeRel.setHorizontalTextPosition(SwingConstants.RIGHT);
		txtNomeRel.setHorizontalAlignment(SwingConstants.LEFT);
		txtNomeRel.setForeground(new Color(0, 139, 139));
		txtNomeRel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtNomeRel.setBounds(10, 24, 46, 14);
		venda.add(txtNomeRel);
		
		txtEmailRel = new JLabel("E-mail:");
		txtEmailRel.setHorizontalTextPosition(SwingConstants.RIGHT);
		txtEmailRel.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmailRel.setForeground(new Color(0, 139, 139));
		txtEmailRel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtEmailRel.setAlignmentX(0.5f);
		txtEmailRel.setBounds(10, 82, 46, 14);
		venda.add(txtEmailRel);
		
		txtNomeR = new JTextField();
		txtNomeR.setColumns(10);
		txtNomeR.setBounds(56, 21, 184, 20);
		venda.add(txtNomeR);
		
		txtEmailR = new JTextField();
		txtEmailR.setColumns(10);
		txtEmailR.setBounds(54, 79, 125, 20);
		venda.add(txtEmailR);
		
		txtTelRel = new JLabel("Telefone:");
		txtTelRel.setHorizontalTextPosition(SwingConstants.RIGHT);
		txtTelRel.setHorizontalAlignment(SwingConstants.LEFT);
		txtTelRel.setForeground(new Color(0, 139, 139));
		txtTelRel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtTelRel.setBounds(239, 83, 75, 14);
		venda.add(txtTelRel);
		
		txtCpfRel = new JLabel("CPF:");
		txtCpfRel.setHorizontalTextPosition(SwingConstants.RIGHT);
		txtCpfRel.setHorizontalAlignment(SwingConstants.LEFT);
		txtCpfRel.setForeground(new Color(0, 139, 139));
		txtCpfRel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtCpfRel.setBounds(246, 55, 68, 14);
		venda.add(txtCpfRel);
		
		txtCPFR = new JTextField();
		txtCPFR.setColumns(10);
		txtCPFR.setBounds(311, 52, 95, 20);
		venda.add(txtCPFR);
		
		lblNewLabel = new JLabel("ID:");
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setBounds(320, 24, 46, 14);
		venda.add(lblNewLabel);
		
		txtIdRel = new JTextField();
		txtIdRel.setEnabled(false);
		txtIdRel.setColumns(10);
		txtIdRel.setBounds(349, 21, 46, 20);
		venda.add(txtIdRel);
		
		txtTelefoneRel = new JTextField();
		txtTelefoneRel.setColumns(10);
		txtTelefoneRel.setBounds(311, 80, 95, 20);
		venda.add(txtTelefoneRel);
		
		txtIdadeR = new JTextField();
		txtIdadeR.setColumns(10);
		txtIdadeR.setBounds(55, 49, 28, 20);
		venda.add(txtIdadeR);
		
		JLabel txtIdadeRel = new JLabel("Idade: ");
		txtIdadeRel.setHorizontalTextPosition(SwingConstants.RIGHT);
		txtIdadeRel.setHorizontalAlignment(SwingConstants.LEFT);
		txtIdadeRel.setForeground(new Color(0, 139, 139));
		txtIdadeRel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		txtIdadeRel.setBounds(10, 49, 46, 14);
		venda.add(txtIdadeRel);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Pessoa pessoa : TMain.listPessoa.pessoasList) {
					if (Integer.parseInt(txtPesqPessoa.getText())==pessoa.getId()) {
								pessoa.setNome(txtNomeR.getText());
								pessoa.setIdade(Integer.parseInt(txtIdadeR.getText()));
								pessoa.setCpf(txtCPFR.getText());
								pessoa.setTelefone(txtTelefoneRel.getText());
								pessoa.setEmail(txtEmailR.getText());
			}}
				txtNomeR.setText("");
				txtIdadeR.setText("");
				txtCPFR.setText("");
				txtTelefoneRel.setText("");
				txtEmailR.setText("");
				}
		});
		btnEditar.setForeground(new Color(0, 128, 128));
		btnEditar.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnEditar.setBackground(new Color(211, 211, 211));
		btnEditar.setBounds(98, 439, 77, 38);
		frame.getContentPane().add(btnEditar);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Cadastrados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(10, 37, 414, 107);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 22, 394, 74);
		panel_3.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Inativos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_4.setBackground(new Color(211, 211, 211));
		panel_4.setBounds(10, 155, 414, 105);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 21, 394, 75);
		panel_4.add(scrollPane_3);
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);
		

		table_2.setBackground(new Color(211, 211, 211));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Idade", "CPF", "Telefone", "E-mail"
			}
		));
		table_3.setBackground(new Color(211, 211, 211));
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Idade", "CPF", "Telefone", "E-mail"
			}
		));
		
		DefaultTableModel model = (DefaultTableModel) table_2.getModel();
		DefaultTableModel model1 = (DefaultTableModel) table_3.getModel();
		

		
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
				((DefaultTableModel) table_3.getModel()).setRowCount(0);	
				for(Pessoa pessoa : TMain.listPessoa.pessoasEcluidas) {
					model1.addRow(new Object[]{
							pessoa.getId(),
							pessoa.getNome(),
							pessoa.getIdade(),
							pessoa.getCpf(),
							pessoa.getTelefone(),
							pessoa.getEmail()});
					
				}; 
				((DefaultTableModel) table_2.getModel()).setRowCount(0);
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
				((DefaultTableModel) table_2.getModel()).setRowCount(0);				
				for(Pessoa pessoa : TMain.listPessoa.pessoasList) {
					if (Integer.parseInt(txtPesqPessoa.getText())==pessoa.getId()) {
						txtIdRel.setText(txtPesqPessoa.getText());
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
