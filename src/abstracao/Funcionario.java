package abstracao;

//Classes abstratas não podem ser intanciadas
//É um conceito para serem utilizadas somente pelas classes filhas
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//Esse método é abstrato,pq todos os filhos de funcionario(gerente,editor,design)
	//todos irão ter a sua própria bonificação,então esse método por questão de todos
	//terem em comum a bonificação, ele não terá implementação e terá a anotação abstract
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
