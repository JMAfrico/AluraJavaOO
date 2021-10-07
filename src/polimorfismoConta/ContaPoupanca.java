package polimorfismoConta;

public class ContaPoupanca extends Conta{
	
	private static int totalContaPoupanca;

	public ContaPoupanca(int agencia,int conta){
		super(agencia,conta);
		totalContaPoupanca++;
	}
	
	public static int getTotalContaPoupanca() {
		return totalContaPoupanca;
	}
	
	public static void getTotalContas() {
		 System.out.println("Contas poupan�a criadas: "+getTotalContaPoupanca());
	}
	
	
}
