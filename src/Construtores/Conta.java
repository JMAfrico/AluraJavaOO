package Construtores;

public class Conta {

	private double saldo;
	private int conta;
	private int agencia;
	private Cliente titular;
	private static int totalContas;
	
	public Conta() {
		
	}
	
	public Conta(int agencia, int conta) {
		totalContas++;
		this.agencia = agencia;
		this.conta = conta;
		System.out.println("Conta criada com sucesso. ");
		System.out.println("Ag�ncia: "+agencia);
		System.out.println("Conta: "+conta);
	}

	public double deposita(double valor) {
		this.saldo += valor;
		return valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getConta() {
		return this.conta;
	}
	

	public int getAgencia() {
		return this.agencia;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotalContas() {
		return totalContas;
	}
	
	
}
