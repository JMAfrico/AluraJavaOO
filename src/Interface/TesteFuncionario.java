package Interface;


public class TesteFuncionario {

	public static void main(String[] args) {
		
		ControleBonificacao controle = new ControleBonificacao();
		Funcionario funcionario = new EditorVideo();
		Gerente gerente = new Gerente();
		Design design = new Design();
				
		funcionario.setNome("Elen");
		funcionario.setSalario(5050.0);
		
		gerente.setNome("João");
		gerente.setSalario(5000.0);
	
		design.setNome("Arthur");
		design.setSalario(2500.0);
		
		
		controle.registra(design);
		controle.registra(gerente);
		controle.registra(funcionario);
		
		System.out.println(controle.getSoma());

		
	}
}
