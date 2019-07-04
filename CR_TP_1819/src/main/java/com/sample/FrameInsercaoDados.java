package com.sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;

import org.kie.api.runtime.KieSession;

import javafx.event.ActionEvent;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.JCheckBox;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class FrameInsercaoDados extends JFrame {

	private JPanel contentPane;
	JPanel panelMain;
	JPanel pacientePanel;
	JLabel tituloJanela;

	/**
	 * Launch the application.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameInsercaoDados frame = new FrameInsercaoDados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	 */

	/**
	 * Create the frame.
	 */
	public FrameInsercaoDados(KieSession kSession) {
       	kSession.setGlobal("J1", this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelMain = new JPanel();
		panelMain.setBackground(new Color(248, 148, 6));
		panelMain.setBounds(0, 0, 434, 56);

		contentPane.add(panelMain);
		panelMain.setLayout(null);

		tituloJanela = new JLabel("Dados Pessoais");
		tituloJanela.setBounds(118, 11, 183, 29);
		tituloJanela.setFont(new Font("Tahoma", Font.BOLD, 24));
		tituloJanela.setForeground(new Color(255, 255, 255));
		panelMain.add(tituloJanela);
		// caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);

		pacientePanel = new JPanel();
		pacientePanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pacientePanel.setBounds(0, 56, 434, 292);
		pacientePanel.setBackground(new Color(44, 62, 80));
		pacientePanel.setLayout(null);
		contentPane.add(pacientePanel);

		JLabel lblPrimeiroNome = new JLabel("Nome : ");
		lblPrimeiroNome.setForeground(new Color(255, 255, 255));
		lblPrimeiroNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrimeiroNome.setBounds(39, 11, 68, 20);
		pacientePanel.add(lblPrimeiroNome);

		JTextField textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBounds(139, 11, 249, 20);
		Color x = new Color(108, 122, 137);
		textField.setBackground(x);
		pacientePanel.add(textField);
		textField.setColumns(12);

	
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSexo.setForeground(Color.WHITE);
		lblSexo.setBounds(42, 49, 46, 14);
		pacientePanel.add(lblSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnMasculino.setForeground(Color.WHITE);
		rdbtnMasculino.setBackground(null);
		rdbtnMasculino.setBounds(139, 49, 109, 23);
		pacientePanel.add(rdbtnMasculino);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setForeground(Color.WHITE);
		rdbtnFeminino.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnFeminino.setBackground(null);
		rdbtnFeminino.setBounds(254, 49, 109, 23);
		pacientePanel.add(rdbtnFeminino);
		
		JLabel label = new JLabel("Estado Civil :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(22, 84, 95, 14);
		pacientePanel.add(label);
		
		JRadioButton rdnBtnSolteiro = new JRadioButton("Solteiro(a)");
		rdnBtnSolteiro.setForeground(Color.WHITE);
		rdnBtnSolteiro.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdnBtnSolteiro.setBackground((Color) null);
		rdnBtnSolteiro.setBounds(139, 84, 109, 23);
		pacientePanel.add(rdnBtnSolteiro);
		
		JRadioButton rdnBtnCasado = new JRadioButton("Casado(a)");
		rdnBtnCasado.setForeground(Color.WHITE);
		rdnBtnCasado.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdnBtnCasado.setBackground((Color) null);
		rdnBtnCasado.setBounds(254, 84, 109, 23);
		pacientePanel.add(rdnBtnCasado);
		
		JLabel label_1 = new JLabel("Possui filhos ?");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(20, 121, 97, 14);
		pacientePanel.add(label_1);
		
		JRadioButton rdnBtnNFilhos = new JRadioButton("Não");
		rdnBtnNFilhos.setForeground(Color.WHITE);
		rdnBtnNFilhos.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdnBtnNFilhos.setBackground((Color) null);
		rdnBtnNFilhos.setBounds(254, 121, 109, 23);
		pacientePanel.add(rdnBtnNFilhos);
		
		JRadioButton rdnBtnSFilhos = new JRadioButton("Sim");
		rdnBtnSFilhos.setForeground(Color.WHITE);
		rdnBtnSFilhos.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdnBtnSFilhos.setBackground((Color) null);
		rdnBtnSFilhos.setBounds(139, 121, 109, 23);
		pacientePanel.add(rdnBtnSFilhos);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(197, 167, 89, 23);
		pacientePanel.add(btnIniciar);
		
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if ((!rdbtnMasculino.isSelected() && !rdbtnFeminino.isSelected()) || (!rdnBtnSolteiro.isSelected() && !rdnBtnCasado.isSelected())
						|| (!rdnBtnNFilhos.isSelected() && !rdnBtnSFilhos.isSelected()) ||textField.getText() == null ) {
					JOptionPane.showMessageDialog(null, "Introdução inválida de dados", "Erro de validação",
							JOptionPane.ERROR_MESSAGE);
				}
				else {
					String nome = textField.getText();
					Sexo sexo = (rdbtnMasculino.isSelected()) ? Sexo.Masculino : Sexo.Feminino;
					EstadoCivil estadoCivil = (rdnBtnSolteiro.isSelected()) ? EstadoCivil.Solteiro_a : EstadoCivil.Casado_a;
					boolean possuiFilhos = (rdnBtnNFilhos.isSelected()) ? false : true;
					Cliente cliente = new Cliente(01,nome,sexo, estadoCivil, possuiFilhos);
					kSession.insert(cliente);
					kSession.fireAllRules();
				}
			}
		});
		
		
		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if(rdbtnMasculino.isSelected()) {
					rdbtnFeminino.setSelected(false);
				}
			}
		});
		
		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if(rdbtnFeminino.isSelected()) {
					rdbtnMasculino.setSelected(false);
				}
			}
		});
		
		rdnBtnSolteiro.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if(rdnBtnSolteiro.isSelected()) {
					rdnBtnCasado.setSelected(false);
				}
			}
		});	
		
		rdnBtnCasado.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if(rdnBtnCasado.isSelected()) {
					rdnBtnSolteiro.setSelected(false);
				}
			}
		});
		
		rdnBtnNFilhos.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if(rdnBtnNFilhos.isSelected()) {
					rdnBtnSFilhos.setSelected(false);
				}
			}
		});	
		
		rdnBtnSFilhos.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent arg0) {
				if(rdnBtnSFilhos.isSelected()) {
					rdnBtnNFilhos.setSelected(false);
				}
			}
		});
		
		

	}
}
