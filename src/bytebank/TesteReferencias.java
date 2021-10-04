package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300.0;

		System.out.println(primeiraConta.saldo);

		Conta segundaConta = primeiraConta;

		System.out.println(segundaConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}

		//imprime o numero de referencia
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
