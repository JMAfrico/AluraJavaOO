package interfaceConta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta) {
		super(agencia, conta);
		System.out.println("Conta Poupan�a criada com sucesso. ");
		System.out.print("Ag�ncia: " + agencia);
		System.out.println(" Conta: " + conta);
		System.out.println();
	}

}
