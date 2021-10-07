package polimorfismoConta;

public class ContaCorrente extends Conta{
	
	private static int totalContaCorrente;

	public ContaCorrente(int agencia, int conta) {		
		super(agencia,conta);
		totalContaCorrente++;
	}
	
	public static void getTotalContas() {
		 System.out.println("Contas corrente criadas: "+getTotalContaCorrente());
	}
	
	public static int getTotalContaCorrente() {
		return totalContaCorrente;
	}
}
