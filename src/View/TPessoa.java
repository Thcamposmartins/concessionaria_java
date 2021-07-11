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
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

import Controller.PessoasController;
import Model.Pessoa;
import View.TMain;
import View.TRelatorioPessoa;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
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
					window.getFrame().setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public TPessoa(){		
		initialize();	
		
		//setLocationRelativeTo(null);
	}

	
	private void initialize(){
		setFrame(new JFrame());
		getFrame().getContentPane().setForeground(new Color(47, 79, 79));
		getFrame().getContentPane().setBackground(new Color(211, 211, 211));
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pessoas");
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblNewLabel.setBounds(20, 11, 233, 38);
		getFrame().getContentPane().add(lblNewLabel);
		
		JPanel funcionario = new JPanel();
		funcionario.setBackground(new Color(211, 211, 211));
		funcionario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		funcionario.setBounds(10, 44, 414, 152);
		getFrame().getContentPane().add(funcionario);
		funcionario.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setBounds(322, 14, 46, 14);
		funcionario.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 36, 46, 14);
		funcionario.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Idade");
		lblNewLabel_1_2.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 64, 46, 14);
		funcionario.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-mail");
		lblNewLabel_1_3.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 120, 46, 14);
		funcionario.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("CPF");		
		lblNewLabel_1_4.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(242, 64, 46, 14);
		funcionario.add(lblNewLabel_1_4);		
				
		JLabel lblNewLabel_1_5 = new JLabel("Telefone");
		lblNewLabel_1_5.setForeground(new Color(0, 139, 139));
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
		lblNewLabel_1_2_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(10, 89, 70, 14);
		funcionario.add(lblNewLabel_1_2_1);
		
		JRadioButton btCliente = new JRadioButton("");
		btCliente.setBackground(new Color(211, 211, 211));
		btCliente.setBounds(158, 87, 21, 23);
		funcionario.add(btCliente);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Cliente");
		lblNewLabel_1_2_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBounds(116, 92, 70, 14);
		funcionario.add(lblNewLabel_1_2_1_1);
		
		JRadioButton btFuncionario = new JRadioButton("");
		btFuncionario.setBackground(new Color(211, 211, 211));
		btFuncionario.setBounds(74, 85, 21, 23);
		funcionario.add(btFuncionario);
		
		JButton btnSalvarPess = new JButton("Salvar");
		btnSalvarPess.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSalvarPess.setForeground(new Color(0, 139, 139));
		btnSalvarPess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa pessoa = new Pessoa();
				
				pessoa.setCpf(txtCPF.getText());
				pessoa.setEmail(txtEmail.getText());
				pessoa.setId(Integer.parseInt(txtID.getText()));
				pessoa.setIdade(Integer.parseInt(txtIdade.getText()));
				pessoa.setNome(txtNome.getText());
				pessoa.setTelefone(txtTelefone.getText());
				TMain.listPessoa.addPessoas(pessoa);				
			}
		});
		btnSalvarPess.setBackground(new Color(169, 169, 169));
		btnSalvarPess.setBounds(262, 207, 76, 43);
		getFrame().getContentPane().add(btnSalvarPess);
		
		JButton btnCancelarPess = new JButton("Cancelar");
		btnCancelarPess.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnCancelarPess.setForeground(new Color(0, 139, 139));
		btnCancelarPess.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelarPess.setBackground(new Color(169, 169, 169));
		btnCancelarPess.setBounds(348, 207, 76, 43);
		frame.getContentPane().add(btnCancelarPess);
		
		JButton btnNovoPess = new JButton("Novo");
		btnNovoPess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtCPF.setText("");
				txtEmail.setText("");
				txtID.setText("");
				txtIdade.setText("");
				txtTelefone.setText("");
				btCliente.setAutoscrolls(false);
				btFuncionario.setAutoscrolls(false);
			}
		});
		btnNovoPess.setForeground(new Color(0, 139, 139));
		btnNovoPess.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNovoPess.setBackground(new Color(169, 169, 169));
		btnNovoPess.setBounds(177, 207, 76, 43);
		frame.getContentPane().add(btnNovoPess);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
