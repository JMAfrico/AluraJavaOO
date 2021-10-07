package abstracaoConta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta) {
		super(agencia, conta);
		System.out.println("Conta Poupança criada com sucesso. ");
		System.out.print("Agência: " + agencia);
		System.out.println(" Conta: " + conta);
		System.out.println();
	}

	@Override
	public double deposita(double valor) {
		super.saldo += valor;
		System.out.println("Valor depositado: " + valor);
		System.out.println("Saldo Conta Poupança: " + super.getSaldo());
		return valor;
	}

}
