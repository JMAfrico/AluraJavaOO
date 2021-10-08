package Interface;

public class Gerente extends Funcionario implements Autenticacao{

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		 this.autenticador = new AutenticacaoUtil();
		
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
		
	}

	public double getBonificacao() {
		System.out.println("Chamando método Gerente");
		return super.getSalario();
	}

	public double getTotalSalario() {
		return getSalario() + getBonificacao();
	}

}
