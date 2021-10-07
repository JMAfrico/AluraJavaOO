package polimorfismoConta2;

public class Teste {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente(5544, 87996);
		contaCorrente.deposita(100.0);
		contaCorrente.deposita(500.0);
		System.out.println();
		
		Conta contaPoupanca = new ContaPoupanca(6597, 88896);
		contaPoupanca.deposita(200.0);
		System.out.println();

		contaCorrente.saca(20.0);
	}
}
