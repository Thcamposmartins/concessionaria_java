package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import Controller.PessoasController;
import Controller.VeiculoController;
import Model.Pessoa;
import Services.EscreverArquivo;

import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

public class TMain {
	
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TMain window = new TMain();
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
	public TMain() {		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static PessoasController listPessoa = new PessoasController();
	static VeiculoController listVeiculo = new VeiculoController();
	EscreverArquivo gravar = new EscreverArquivo();
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(30, 25, 380, 204);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewCar = new JLabel("NEW CAR");
		lblNewCar.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewCar.setForeground(new Color(211, 211, 211));
		lblNewCar.setFont(new Font("Yu Gothic", Font.PLAIN, 24));
		lblNewCar.setBounds(128, 11, 122, 38);
		panel_1.add(lblNewCar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cadastros", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(211, 211, 211)));
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(10, 50, 110, 129);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewVeiculo = new JButton("Veiculos");
		btnNewVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TVeiculo window = new TVeiculo();
				window.getFrame().setVisible(true);
				
			}
		});
		btnNewVeiculo.setForeground(new Color(0, 128, 128));
		btnNewVeiculo.setBounds(10, 82, 89, 23);
		panel_2.add(btnNewVeiculo);
		
		JButton btnNewPessoa = new JButton("Pessoas");
		btnNewPessoa.setForeground(new Color(0, 128, 128));
		btnNewPessoa.setBounds(10, 36, 89, 23);
		panel_2.add(btnNewPessoa);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Vendas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(211, 211, 211)));
		panel_2_1.setBackground(new Color(0, 128, 128));
		panel_2_1.setBounds(138, 50, 112, 73);
		panel_1.add(panel_2_1);
		
		JButton btnNewVenda = new JButton("Venda");
		btnNewVenda.setForeground(new Color(0, 128, 128));
		btnNewVenda.setBounds(10, 28, 89, 23);
		panel_2_1.add(btnNewVenda);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Relatorios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(211, 211, 211)));
		panel_2_2.setBackground(new Color(0, 128, 128));
		panel_2_2.setBounds(262, 50, 110, 129);
		panel_1.add(panel_2_2);
		
		JButton btnNewVeiculoRel = new JButton("Veiculos");
		btnNewVeiculoRel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TRelatorioVeiculo window = new TRelatorioVeiculo();
				window.getFrame().setVisible(true);
			}
		});
		btnNewVeiculoRel.setForeground(new Color(0, 128, 128));
		btnNewVeiculoRel.setBounds(10, 82, 89, 23);
		panel_2_2.add(btnNewVeiculoRel);
		
		JButton btnNewPessoaRel = new JButton("Pessoas");
		btnNewPessoaRel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TRelatorioPessoa window = new TRelatorioPessoa();
				window.getFrame().setVisible(true);
			}
		});
		btnNewPessoaRel.setForeground(new Color(0, 128, 128));
		btnNewPessoaRel.setBounds(10, 36, 89, 23);
		panel_2_2.add(btnNewPessoaRel);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				gravar.EscreverArquivoPessoa(listPessoa.pessoasList);
				gravar.EscreverArquivoVeiculos(listVeiculo.veiculosList);
				}
				catch(IOException ex){
				}
				frame.dispose();
				
			}
		});
		btnSair.setBackground(new Color(0, 128, 128));
		btnSair.setForeground(new Color(211, 211, 211));
		btnSair.setBounds(166, 141, 60, 38);
		panel_1.add(btnSair);
		btnNewPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TPessoa window = new TPessoa();
				window.getFrame().setVisible(true);			 
			}
		});
	}
}
