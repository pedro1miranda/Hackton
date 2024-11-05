package br.edu.fatecpg.tecprog.SistemaBancario.model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SistemaBancario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	ContaCorrente conta1 = new ContaCorrente(1, "Adamo", 32000, 50000);
	
	ContaCorrente conta2 = new ContaCorrente(17, "Neymar Pai", 1000, 700);
	
	ContaPoupanca conta3 = new ContaPoupanca(6, "Roberto", 5000.50);
	
	ContaPoupanca conta4 = new ContaPoupanca(3, "Neymar Jr", 1500.50);
	/**
	* Launch the application.
	*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaBancario frame = new SistemaBancario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SistemaBancario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaBancario = new JLabel("SISTEMA BANCARIO");
		lblSistemaBancario.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaBancario.setBounds(0, -13, 965, 90);
		lblSistemaBancario.setFont(new Font("FreeSerif", Font.BOLD, 20));
		contentPane.add(lblSistemaBancario);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 89, 965, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblConta = new JLabel("" + conta1.getNumero());
		lblConta.setBounds(12, 12, 70, 15);
		panel.add(lblConta);
		
		JLabel lblConta_1 = new JLabel(conta1.getTitular());
		lblConta_1.setBounds(12, 39, 87, 15);
		panel.add(lblConta_1);
		
		JLabel lblConta_1_1 = new JLabel("Saldo: "+conta1.getSaldo());
		lblConta_1_1.setBounds(122, 12, 177, 15);
		panel.add(lblConta_1_1);
		
		JLabel lblConta_1_1_1 = new JLabel("Cheque Especial: "+conta1.getChequeEspecial());
		lblConta_1_1_1.setBounds(122, 39, 205, 15);
		panel.add(lblConta_1_1_1);
		
		JLabel lblConta_1_1_2 = new JLabel("Conta Corrente");
		lblConta_1_1_2.setFont(new Font("Dialog", Font.BOLD, 16));
		lblConta_1_1_2.setBounds(762, 11, 138, 15);
		panel.add(lblConta_1_1_2);
		
		JButton btnSacar1 = new JButton("Sacar");
		btnSacar1.setBounds(345, 34, 117, 25);
		panel.add(btnSacar1);
		
		JButton btnDepositar1 = new JButton("Depositar");
		btnDepositar1.setBounds(469, 34, 117, 25);
		panel.add(btnDepositar1);
		
		JButton btnTransferir1 = new JButton("Transferir");
		btnTransferir1.setBounds(596, 34, 117, 25);
		panel.add(btnTransferir1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 183, 965, 75);
		contentPane.add(panel_1);
		
		JLabel lblConta_2 = new JLabel(""+conta2.getNumero());
		lblConta_2.setBounds(12, 12, 70, 15);
		panel_1.add(lblConta_2);
		
		JLabel lblConta_1_2 = new JLabel(conta2.getTitular());
		lblConta_1_2.setBounds(12, 39, 103, 15);
		panel_1.add(lblConta_1_2);
		
		JLabel lblConta_1_1_3 = new JLabel("Saldo: "+conta2.getSaldo());
		lblConta_1_1_3.setBounds(127, 12, 200, 15);
		panel_1.add(lblConta_1_1_3);
		
		JLabel lblConta_1_1_1_1 = new JLabel("Cheque Especial: "+ conta2.getChequeEspecial());
		lblConta_1_1_1_1.setBounds(127, 39, 200, 15);
		panel_1.add(lblConta_1_1_1_1);
		
		JLabel lblConta_1_1_2_1 = new JLabel("Conta Corrente");
		lblConta_1_1_2_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblConta_1_1_2_1.setBounds(762, 11, 138, 15);
		panel_1.add(lblConta_1_1_2_1);
		
		JButton btnSacar17 = new JButton("Sacar");
		btnSacar17.setBounds(345, 34, 117, 25);
		panel_1.add(btnSacar17);
		
		JButton btnDepositar17 = new JButton("Depositar");
		btnDepositar17.setBounds(469, 34, 117, 25);
		panel_1.add(btnDepositar17);
		
		JButton btnTransferir17 = new JButton("Transferir");
		btnTransferir17.setBounds(596, 34, 117, 25);
		panel_1.add(btnTransferir17);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 277, 965, 75);
		contentPane.add(panel_1_1);
		
		JLabel lblConta_2_1 = new JLabel(""+conta3.getNumero());
		lblConta_2_1.setBounds(12, 12, 70, 15);
		panel_1_1.add(lblConta_2_1);
		
		JLabel lblConta_1_2_1 = new JLabel(conta3.getTitular());
		lblConta_1_2_1.setBounds(12, 39, 103, 15);
		panel_1_1.add(lblConta_1_2_1);
		
		JLabel lblConta_1_1_3_1 = new JLabel("Saldo: "+conta3.getSaldo());
		lblConta_1_1_3_1.setBounds(127, 12, 209, 15);
		panel_1_1.add(lblConta_1_1_3_1);
		
		JLabel lblConta_1_1_1_1_1 = new JLabel("Cheque Especial: N/A");
		lblConta_1_1_1_1_1.setBounds(127, 39, 209, 15);
		panel_1_1.add(lblConta_1_1_1_1_1);
		
		JLabel lblConta_1_1_2_1_1 = new JLabel("Conta Poupança");
		lblConta_1_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblConta_1_1_2_1_1.setBounds(762, 11, 175, 15);
		panel_1_1.add(lblConta_1_1_2_1_1);
		
		JButton btnDepositar6 = new JButton("Depositar");
		btnDepositar6.setBounds(469, 34, 117, 25);
		panel_1_1.add(btnDepositar6);
		
		JButton btnTransferir6 = new JButton("Transferir");
		btnTransferir6.setBounds(596, 34, 117, 25);
		panel_1_1.add(btnTransferir6);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(0, 375, 965, 75);
		contentPane.add(panel_1_1_1);
		
		JLabel lblConta_2_1_1 = new JLabel(""+conta4.getNumero());
		lblConta_2_1_1.setBounds(12, 12, 70, 15);
		panel_1_1_1.add(lblConta_2_1_1);
		
		JLabel lblConta_1_2_1_1 = new JLabel(conta4.getTitular());
		lblConta_1_2_1_1.setBounds(12, 39, 87, 15);
		panel_1_1_1.add(lblConta_1_2_1_1);
		
		JLabel lblConta_1_1_3_1_1 = new JLabel("Saldo: "+conta4.getSaldo());
		lblConta_1_1_3_1_1.setBounds(127, 12, 222, 15);
		panel_1_1_1.add(lblConta_1_1_3_1_1);
		
		JLabel lblConta_1_1_1_1_1_1 = new JLabel("Cheque Especial: N/A");
		lblConta_1_1_1_1_1_1.setBounds(127, 39, 222, 15);
		panel_1_1_1.add(lblConta_1_1_1_1_1_1);
		
		JLabel lblConta_1_1_2_1_1_1 = new JLabel("Conta Poupança");
		lblConta_1_1_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblConta_1_1_2_1_1_1.setBounds(762, 11, 161, 15);
		panel_1_1_1.add(lblConta_1_1_2_1_1_1);
		
		JButton btnDepositar3 = new JButton("Depositar");
		btnDepositar3.setBounds(469, 34, 117, 25);
		panel_1_1_1.add(btnDepositar3);
		
		JButton btnTransferir3 = new JButton("Transferir");
		btnTransferir3.setBounds(596, 34, 117, 25);
		panel_1_1_1.add(btnTransferir3);
		
		btnSacar1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conta1.sacar(475);
			}
		});
		
		btnSacar17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conta2.sacar(475);
			}
		});
		
		btnDepositar1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conta1.depositar(600);
			}
		});
		
		btnDepositar17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conta2.depositar(600);
			}
		});
		
		btnDepositar6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conta3.depositar(600);
			}
		});
		
		btnDepositar3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				conta4.depositar(600);
			}
		});
		
		int transferente = 1;
		
		btnTransferir1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(transferente == conta1.getNumero()) {
					System.out.println("Você não pode transferir para você mesmo");
				}else {
					switch(transferente) {
						case 2:
							System.out.println(conta2.getTitular() + " Transferiu para " + conta1.getTitular());
							conta2.transferirContaCorrente(conta1, 300);
						break;
						case 3:
							System.out.println(conta3.getTitular() + " Transferiu para " + conta1.getTitular());
							conta3.transferirContaCorrente(conta1, 300);
						break;
						case 4:
							System.out.println(conta4.getTitular() + " Transferiu para " + conta1.getTitular());
							conta4.transferirContaCorrente(conta1, 300);
						break;
						default:
							System.out.println("Conta não encontrada!");
						break;
					}
				}
			}
		});
		
		btnTransferir17.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(transferente == conta2.getNumero()) {
					System.out.println("Você não pode transferir para você mesmo");
				}else {
					switch(transferente) {
						case 1:
							System.out.println(conta1.getTitular() + " Transferiu para " + conta2.getTitular());
							conta1.transferirContaCorrente(conta2, 300);
						break;
						case 3:
							System.out.println(conta3.getTitular() + " Transferiu para " + conta2.getTitular());
							conta3.transferirContaCorrente(conta2, 300);
						break;
						case 4:
							System.out.println(conta4.getTitular() + " Transferiu para " + conta2.getTitular());
							conta4.transferirContaCorrente(conta2, 300);
						break;
						default:
							System.out.println("Conta não encontrada!");
						break;
					}
				}
			}
		});
		
		btnTransferir6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(transferente == conta3.getNumero()) {
					System.out.println("Você não pode transferir para você mesmo");
				}else {
					switch(transferente) {
						case 1:
							System.out.println(conta1.getTitular() + " Transferiu para " + conta3.getTitular());
							conta1.transferirContaPoupanca(conta3, 300);
						break;
						case 2:
							System.out.println(conta2.getTitular() + " Transferiu para " + conta3.getTitular());
							conta2.transferirContaPoupanca(conta3, 300);
						break;
						case 4:
							System.out.println(conta4.getTitular() + " Transferiu para " + conta3.getTitular());
							conta4.transferirContaPoupanca(conta3, 300);
						break;
						default:
							System.out.println("Conta não encontrada!");
						break;
					}
				}
			}
		});
		
		btnTransferir3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(transferente == conta4.getNumero()) {
					System.out.println("Você não pode transferir para você mesmo");
				}else {
					switch(transferente) {
						case 1:
							System.out.println(conta1.getTitular() + " Transferiu para " + conta4.getTitular());
							conta1.transferirContaPoupanca(conta4, 300);
						break;
						case 2:
							System.out.println(conta2.getTitular() + " Transferiu para " + conta4.getTitular());
							conta2.transferirContaPoupanca(conta4, 300);
						break;
						case 3:
							System.out.println(conta3.getTitular() + " Transferiu para " + conta4.getTitular());
							conta3.transferirContaPoupanca(conta4, 300);
						break;
						default:
							System.out.println("Conta não encontrada!");
						break;
					}
				}
			}
		});
		
	}
}
