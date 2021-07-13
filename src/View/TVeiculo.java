package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import Model.Veiculo;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TVeiculo {

	private JFrame frame;
	private JTextField txtIDVeic;
	private JTextField txtNomeVei;
	private JTextField txtCorVeic;
	private JTextField txtCatVei;
	private JTextField txtValorVeic;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TVeiculo window = new TVeiculo();
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
	public TVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		JLabel lblVeiculos = new JLabel("Veiculos");
		lblVeiculos.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVeiculos.setForeground(new Color(0, 139, 139));
		lblVeiculos.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblVeiculos.setBounds(10, 11, 233, 38);
		panel.add(lblVeiculos);
		
		JPanel funcionario = new JPanel();
		funcionario.setLayout(null);
		funcionario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 139, 139)));
		funcionario.setBackground(new Color(211, 211, 211));
		funcionario.setBounds(10, 43, 414, 152);
		panel.add(funcionario);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(322, 14, 12, 14);
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
		txtIDVeic.setBounds(347, 11, 27, 20);
		funcionario.add(txtIDVeic);
		
		txtNomeVei = new JTextField();
		txtNomeVei.setColumns(10);
		txtNomeVei.setBounds(46, 42, 347, 20);
		funcionario.add(txtNomeVei);
		
		txtCorVeic = new JTextField();
		txtCorVeic.setColumns(10);
		txtCorVeic.setBounds(280, 69, 113, 20);
		funcionario.add(txtCorVeic);
		
		txtCatVei = new JTextField();
		txtCatVei.setColumns(10);
		txtCatVei.setBounds(280, 94, 113, 20);
		funcionario.add(txtCatVei);
		
		txtValorVeic = new JTextField();
		txtValorVeic.setColumns(10);
		txtValorVeic.setBounds(280, 122, 113, 20);
		funcionario.add(txtValorVeic);
		
		JButton btnNovoVeic = new JButton("Novo");
		btnNovoVeic.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtIDVeic.setText("");
				txtNomeVei.setText("");
				txtCorVeic.setText("");
				txtCatVei.setText("");
				txtValorVeic.setText("");
			}
		});
		btnNovoVeic.setForeground(new Color(0, 139, 139));
		btnNovoVeic.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNovoVeic.setBackground(new Color(169, 169, 169));
		btnNovoVeic.setBounds(178, 206, 76, 43);
		panel.add(btnNovoVeic);
		
		JButton btnSalvaVeic = new JButton("Salvar");
		btnSalvaVeic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Veiculo veiculo = new Veiculo();
				
				veiculo.setCategoria(txtCatVei.getText());
				veiculo.setCor(txtCorVeic.getText());
				veiculo.setID(Integer.parseInt(txtIDVeic.getText()));
				veiculo.setNome(txtNomeVei.getText());
				veiculo.setPreco(Double.parseDouble(txtValorVeic.getText()));
				TMain.listVeiculo.addVeiculo(veiculo);
			}
		});
		btnSalvaVeic.setForeground(new Color(0, 139, 139));
		btnSalvaVeic.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSalvaVeic.setBackground(new Color(169, 169, 169));
		btnSalvaVeic.setBounds(264, 206, 76, 43);
		panel.add(btnSalvaVeic);
		
		JButton btnCancelarPess = new JButton("Cancelar");
		btnCancelarPess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();					
			}
		});
		btnCancelarPess.setForeground(new Color(0, 139, 139));
		btnCancelarPess.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCancelarPess.setBackground(new Color(169, 169, 169));
		btnCancelarPess.setBounds(348, 206, 76, 43);
		panel.add(btnCancelarPess);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
