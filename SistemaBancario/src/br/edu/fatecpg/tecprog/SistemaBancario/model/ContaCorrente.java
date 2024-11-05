package br.edu.fatecpg.tecprog.SistemaBancario.model;

public class ContaCorrente extends Conta{
	
	private double chequeEspecial;

	public ContaCorrente(int numero, String titular, double saldo, double chequeEspecial) {
		super(numero, titular, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getChequeEspecial() {
		return this.chequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		if(this.saldo >= valor && this.chequeEspecial >= valor) {
			this.saldo -= valor;
			System.out.println("\nValor aprovado para saque, novo saldo: " + this.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
