package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.saldo);
		primeiraConta.deposita(20);
		System.out.println(primeiraConta.saldo);

	}

}
