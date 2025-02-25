package abstracaoConta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
		System.out.println("Conta Corrente criada com sucesso. ");
		System.out.print("Ag�ncia: " + agencia);
		System.out.println(" Conta: " + conta);
		System.out.println();
	}

	@Override
	public boolean saca(double valor) {
		double tarifa = 0.20;
		System.out.println("Valor de saque: " + valor + " + " + tarifa + " tarifa");
		return super.saca(valor + tarifa);
	}

	@Override
	public double deposita(double valor) {
		super.saldo += valor;
		System.out.println("Valor depositado: " + valor);
		System.out.println("Saldo Conta Corrente: " + super.getSaldo());
		return valor;

	}
}
