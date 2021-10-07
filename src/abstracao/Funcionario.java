package abstracao;

//Classes abstratas n�o podem ser intanciadas
//� um conceito para serem utilizadas somente pelas classes filhas
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//Esse m�todo � abstrato,pq todos os filhos de funcionario(gerente,editor,design)
	//todos ir�o ter a sua pr�pria bonifica��o,ent�o esse m�todo por quest�o de todos
	//terem em comum a bonifica��o, ele n�o ter� implementa��o e ter� a anota��o abstract
	//	public abstract double getBonificacao() {
	//		return salario * 0.1;
	//	}
	public abstract double getBonificacao();
	
	public double getTotalSalario() {
		return this.salario + getBonificacao();
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
