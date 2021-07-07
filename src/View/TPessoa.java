package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Controller.Pessoas;
import Model.Pessoa;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class TPessoa {

	private JFrame frame;
	private JTextField txtID;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {			
			public void run() {
				try {
					TPessoa window = new TPessoa();
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
	public TPessoa() {		
		initialize();		
		//setLocationRelativeTo(null);
	}
	
	ArrayList<Pessoa> ListPessoa = new ArrayList();
	Pessoas listPessoas = new Pessoas();
	
	public void LoadTablePessoas() {
		DefaultTableModel modelo = new DefaultTableModel(new Object[] {"ID","Nome","Telefone","CPF","Idade","Email"},0);
		
		for(int i=0; i<ListPessoa.size();i++) {
			modelo.addRow(new Object[]{ListPessoa.get(i).getId(),
					ListPessoa.get(i).getNome(),
					ListPessoa.get(i).getTelefone(),
					ListPessoa.get(i).getCpf(),
					ListPessoa.get(i).getIdade(),
					ListPessoa.get(i).getEmail()});
			
		};
	};

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(47, 79, 79));
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pessoas");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblNewLabel.setBounds(20, 11, 233, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel funcionario = new JPanel();
		funcionario.setBackground(new Color(211, 211, 211));
		funcionario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(47, 79, 79)));
		funcionario.setBounds(10, 44, 414, 152);
		frame.getContentPane().add(funcionario);
		funcionario.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1.setBounds(322, 14, 46, 14);
		funcionario.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 36, 46, 14);
		funcionario.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Idade");
		lblNewLabel_1_2.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 64, 46, 14);
		funcionario.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-mail");
		lblNewLabel_1_3.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 120, 46, 14);
		funcionario.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("CPF");
		lblNewLabel_1_4.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(242, 64, 46, 14);
		funcionario.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Telefone");
		lblNewLabel_1_5.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(224, 92, 46, 14);
		funcionario.add(lblNewLabel_1_5);
		
		txtID = new JTextField();
		txtID.setBounds(347, 11, 46, 20);
		funcionario.add(txtID);
		txtID.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(46, 33, 347, 20);
		funcionario.add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(46, 61, 46, 20);
		funcionario.add(txtIdade);
		txtIdade.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(46, 117, 347, 20);
		funcionario.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(280, 62, 113, 17);
		funcionario.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(280, 89, 113, 20);
		funcionario.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Funcionario");
		lblNewLabel_1_2_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(10, 89, 70, 14);
		funcionario.add(lblNewLabel_1_2_1);
		
		JRadioButton btCliente = new JRadioButton("");
		btCliente.setBackground(new Color(220, 220, 220));
		btCliente.setBounds(158, 87, 21, 23);
		funcionario.add(btCliente);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Cliente");
		lblNewLabel_1_2_1_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBounds(116, 92, 70, 14);
		funcionario.add(lblNewLabel_1_2_1_1);
		
		JRadioButton btFuncionario = new JRadioButton("");
		btFuncionario.setBackground(new Color(220, 220, 220));
		btFuncionario.setBounds(74, 85, 21, 23);
		funcionario.add(btFuncionario);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSalvar.setForeground(new Color(47, 79, 79));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa pessoa = new Pessoa();
				
				pessoa.setCpf(txtCPF.getText());
				pessoa.setEmail(txtEmail.getText());
				pessoa.setId(Integer.parseInt(txtID.getText()));
				pessoa.setIdade(Integer.parseInt(txtIdade.getText()));
				pessoa.setNome(txtNome.getText());
				pessoa.setTelefone(txtTelefone.getText());
				listPessoas.addPessoas(pessoa);
				
			}
		});
		btnSalvar.setBackground(new Color(169, 169, 169));
		btnSalvar.setBounds(348, 207, 76, 43);
		frame.getContentPane().add(btnSalvar);
	}
}
