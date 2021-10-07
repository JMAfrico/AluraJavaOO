package polimorfismoConta2;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
		System.out.println("Conta Corrente criada com sucesso. ");
		System.out.print("Agência: " + agencia);
		System.out.println(" Conta: " + conta);
		System.out.println();
	}

	@Override
	public boolean saca(double valor) {
		double tarifa = 0.20;
		System.out.println("Valor de saque: "+valor + " + " + tarifa+" tarifa");
		return super.saca(valor + tarifa);
	}
}
