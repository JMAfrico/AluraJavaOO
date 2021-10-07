package polimorfismoConta2;

public class Conta {

	private double saldo;
	private int conta;
	private int agencia;
	private Cliente titular;
	private static int totalContas;

	public Conta(int agencia, int conta) {
		totalContas++;
		this.agencia = agencia;
		this.conta = conta;
//		System.out.println("Conta criada com sucesso. ");
//		System.out.println("Agência: " + agencia);
//		System.out.println("Conta: " + conta);
	}

	public double deposita(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado: "+valor);
		System.out.println("Saldo Atual: "+this.getSaldo());
		return valor;
		
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor de saque: "+valor);
			System.out.println("Saldo Atual: "+this.getSaldo());
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
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

	public static void getTotalContas() {
		System.out.println("Total de contas criadas: " + totalContas);
	}

}
