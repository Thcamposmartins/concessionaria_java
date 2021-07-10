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

public class TVeiculo {

	private JFrame frame;
	private JTextField txtIDVeic;
	private JTextField txtNomeVei;
	private JTextField txtCorVeic;
	private JTextField txtCatVei;
	private JTextField tatValorVeic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TVeiculo window = new TVeiculo();
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
	public TVeiculo() {
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
		
		JLabel lblVeiculos = new JLabel("Veiculos");
		lblVeiculos.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVeiculos.setForeground(new Color(0, 139, 139));
		lblVeiculos.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblVeiculos.setBounds(10, 24, 233, 38);
		panel.add(lblVeiculos);
		
		JPanel funcionario = new JPanel();
		funcionario.setLayout(null);
		funcionario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		funcionario.setBackground(new Color(211, 211, 211));
		funcionario.setBounds(10, 60, 414, 152);
		panel.add(funcionario);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(322, 14, 46, 14);
		funcionario.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(10, 42, 46, 14);
		funcionario.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cor");
		lblNewLabel_1_2.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(213, 78, 46, 14);
		funcionario.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Categoria");
		lblNewLabel_1_4.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(210, 103, 60, 14);
		funcionario.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Valor");
		lblNewLabel_1_5.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(210, 128, 60, 14);
		funcionario.add(lblNewLabel_1_5);
		
		txtIDVeic = new JTextField();
		txtIDVeic.setColumns(10);
		txtIDVeic.setBounds(347, 11, 46, 20);
		funcionario.add(txtIDVeic);
		
		txtNomeVei = new JTextField();
		txtNomeVei.setColumns(10);
		txtNomeVei.setBounds(46, 39, 347, 20);
		funcionario.add(txtNomeVei);
		
		txtCorVeic = new JTextField();
		txtCorVeic.setColumns(10);
		txtCorVeic.setBounds(280, 75, 113, 14);
		funcionario.add(txtCorVeic);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Novo");
		lblNewLabel_1_2_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(10, 101, 33, 14);
		funcionario.add(lblNewLabel_1_2_1);
		
		JRadioButton btUsado = new JRadioButton("");
		btUsado.setBackground(new Color(211, 211, 211));
		btUsado.setBounds(46, 122, 21, 23);
		funcionario.add(btUsado);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Usado");
		lblNewLabel_1_2_1_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBounds(10, 127, 70, 14);
		funcionario.add(lblNewLabel_1_2_1_1);
		
		JRadioButton bt_novo = new JRadioButton("");
		bt_novo.setBackground(new Color(211, 211, 211));
		bt_novo.setBounds(45, 96, 21, 23);
		funcionario.add(bt_novo);
		
		txtCatVei = new JTextField();
		txtCatVei.setColumns(10);
		txtCatVei.setBounds(280, 100, 113, 14);
		funcionario.add(txtCatVei);
		
		tatValorVeic = new JTextField();
		tatValorVeic.setColumns(10);
		tatValorVeic.setBounds(280, 125, 113, 14);
		funcionario.add(tatValorVeic);
	}
}
