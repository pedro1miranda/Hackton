package br.edu.fatecpg.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecpg.Model.Aluno;
import br.edu.fatecpg.Model.Disciplina;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno pedro = new Aluno("pedro", 1);
				Disciplina disciplina = new Disciplina();
				disciplina.nome = "portugues";
				if(disciplina.qtd < 5) {
					pedro.disciplina[disciplina.qtd] = disciplina;
					disciplina.qtd++;
				}else {
					JOptionPane.showMessageDialog(btnNewButton, "Não pode adicionar mais disciplinas");
				}

			}
		});
		contentPane.add(btnNewButton);
	}

}
