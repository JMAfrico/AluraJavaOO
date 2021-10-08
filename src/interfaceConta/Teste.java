package interfaceConta;

public class Teste {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(5544, 87996);
		contaCorrente.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(contaCorrente);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}
}
