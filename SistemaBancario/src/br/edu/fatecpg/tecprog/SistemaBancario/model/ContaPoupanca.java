package br.edu.fatecpg.tecprog.SistemaBancario.model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, String titular, double saldo) {
		super(numero, titular, saldo);
	}
	
	@Override
	public void sacar(double valor) {
		System.out.println("Não é possível realizar saque em conta poupança!");
	}
}
