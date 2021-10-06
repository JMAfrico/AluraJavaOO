package heranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("Nico");
		func.setCpf("148.554.669-69");
		func.setSalario(500);
		
		System.out.println(func.getNome());
		System.out.println(func.getBonificacao());
		
		Gerente gerente = new Gerente();
		gerente.setNome("João");
		System.out.println(gerente.getNome());
		
		
		gerente.setSenha(2222);
		boolean autenticou = gerente.autentica(2222);
		System.out.println(autenticou);
		
		gerente.setSalario(5000.0);
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacao());
		
	}
}
