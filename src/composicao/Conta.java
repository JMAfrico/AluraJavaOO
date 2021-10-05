package composicao;

public class Conta {

	double saldo;
	Integer conta;
	Integer agencia;
	Cliente titular;
	private String msg;

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

	public double mostrarSaldo() {
		return this.saldo;
	}

//	public boolean transfere(double valor, Conta destino) {
//		if(this.saldo >= valor) {
//			this.saca(valor);
//			destino.deposita(valor);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}

	private boolean calculoTranferencia(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public String transfere(double valor, Conta destino) {
		if (calculoTranferencia(valor, destino)) {
			this.msg = "Transferência realizada com sucesso. Saldo Atual: " + this.mostrarSaldo();
			return msg;
		} else {
			this.msg = "Saldo insuficiênte. Saldo Atual: " + this.mostrarSaldo();
			return msg;
		}

	}
}
