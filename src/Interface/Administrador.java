package Interface;

//Administrador � um funcionario e implementa m�todos da interface Autentica��o
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
