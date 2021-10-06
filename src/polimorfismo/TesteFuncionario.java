package polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		ControleBonificacao controle = new ControleBonificacao();
		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente();
				
		funcionario.setNome("Elen");
		funcionario.setSalario(5050.0);
		System.out.println("Sal�rio do funcionario: "+funcionario.getSalario());
		System.out.println("Somando 10% de bonifica��o: "+funcionario.getBonificacao());
		System.out.println("Total do sal�rio: "+funcionario.getTotalSalario());
		System.out.println("--- ");
		

		gerente.setNome("Jo�o");
		gerente.setSalario(5000.0);
		System.out.println("Sal�rio do gerente: "+gerente.getSalario());
		System.out.println("Somando 100% + 1.000 de bonificacao: "+gerente.getBonificacao());
		System.out.println("Total do sal�rio: "+gerente.getTotalSalario());	
		
		System.out.println("Soma das bonifica��es: "+controle.getSoma());
		
		Design d = new Design();
		controle.registra(d);
		controle.registra(gerente);
		controle.registra(funcionario);
		


		
	}
}
