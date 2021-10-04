package bytebank;

public class Conta {

	Double saldo = 0.0;
	Integer conta;
	Integer agencia;
	String titular;
	
	public double deposita(double valor) {
		this.saldo += valor;
		return valor;
	}
	
}
