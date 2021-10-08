package Interface;

//Administrador é um funcionario e implementa métodos da interface Autenticação
public class Administrador extends Funcionario implements Autenticacao {

	private AutenticacaoUtil autenticador;
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public Administrador() {
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

}
