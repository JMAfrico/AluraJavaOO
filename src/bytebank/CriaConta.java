package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo=5000.0;
		primeiraConta.agencia = 200;
		primeiraConta.conta = 1554;
		primeiraConta.titular="João Marcos";
		
		System.out.println("Saldo = "+ primeiraConta.saldo);
		System.out.println("Agencia = " +primeiraConta.agencia);
		System.out.println("Conta = " +primeiraConta.conta);
		System.out.println("Títular =" + primeiraConta.titular);
		
		primeiraConta.saldo+=200.0;
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}else {
			System.out.println("Não é a mesma conta");

		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
