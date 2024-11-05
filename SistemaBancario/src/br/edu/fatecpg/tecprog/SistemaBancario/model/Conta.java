package br.edu.fatecpg.tecprog.SistemaBancario.model;

public abstract class Conta {
	protected int numero;
	protected String titular;
	protected double saldo;
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor aprovado para saque, novo saldo: " + this.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado na conta de "+ this.titular +", novo saldo: "+this.saldo);
	}
	
	public void transferirContaCorrente(ContaCorrente destino, double valor) {
		if (this.saldo >= valor) {
			System.out.println("Transferencia aprovada");
			destino.saldo += valor;
			this.saldo -= valor;
		}else {
			System.out.println("Erro na Transferencia");
		}
	}
	
	public void transferirContaPoupanca(ContaPoupanca destino, double valor) {
		if (this.saldo >= valor) {
			System.out.println("Transferencia aprovada");
			destino.saldo += valor;
			this.saldo -= valor;
		}else {
			System.out.println("Erro na Transferencia");
		}
	}
	
}
