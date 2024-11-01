package br.edu.fatecpg.Model;

public class Professor {
	String nome;
	String disciplina;
	Aluno aluno;
	public Professor(String nome, String disciplina) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
	}
	public void Inserirnotas(Aluno aluno, int nt) {
		for(int i = 1; i <= 5; i++) {
			aluno.nota[i] = nt;
		}
		
	}
}