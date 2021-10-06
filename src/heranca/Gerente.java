package heranca;
//Gerente é um Funcionário, herda da classe funcionario
public class Gerente extends Funcionario{

	private int senha;
	

	public Gerente() {

	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else{
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}


}
