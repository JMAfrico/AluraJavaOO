package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();

		// DEPOSITA
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.mostrarSaldo());
		primeiraConta.deposita(20);
		System.out.println(primeiraConta.mostrarSaldo());

		// SACA
		primeiraConta.saca(20);
		System.out.println(primeiraConta.mostrarSaldo());
		primeiraConta.saca(40);
		System.out.println(primeiraConta.mostrarSaldo());

		// TRANSFERE COM BOOLEAN E MENSAGEM
		primeiraConta.transfere(45, segundaConta);
		System.out.println(primeiraConta.msg);
		System.out.println(segundaConta.mostrarSaldo());

		primeiraConta.transfere(5, segundaConta);
		System.out.println(primeiraConta.mostrarSaldo());
		System.out.println(segundaConta.mostrarSaldo());

	}

}
