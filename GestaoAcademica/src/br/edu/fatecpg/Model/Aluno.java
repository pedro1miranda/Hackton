package br.edu.fatecpg.Model;

public class Aluno {
	String nome;
	int matricula;
	String historico;
	public int[] nota = new int[5];
	public Disciplina[] disciplina;
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.historico = historico;
		disciplina = new Disciplina[5];
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getHistorico() {
		return historico;
	}
	public void setHistorico(String historico) {
		this.historico = historico;
	}
	public void  verHistorico() {
	for(int i = 0; i <= 5; i++){
		System.out.println("Disciplina: "+ disciplina[i]);
		System.out.println("nota:"+ nota[i]);
	}
	}
	
	
	
}
