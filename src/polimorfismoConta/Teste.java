package polimorfismoConta;

public class Teste {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente(5544, 87996);
		Conta contaPoupanca = new ContaPoupanca(6597, 88896);
		Conta contaPoupanca2 = new ContaPoupanca(6654, 96685);
		
		Conta.getTotalContas();
		ContaCorrente.getTotalContas();
		ContaPoupanca.getTotalContas();
		
	}
}
