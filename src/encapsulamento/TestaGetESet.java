package encapsulamento;

public class TestaGetESet {

	public static void main(String[] args) {
		
		//Instância de nova conta e novo cliente
		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		
		//Operações com a conta
		conta.deposita(300);
		conta.saca(150);
		
		System.out.println(conta.getSaldo());
		
		conta.setConta(1558779);
		System.out.println("Conta: "+conta.getConta());
		
		conta.setAgencia(05554);
		System.out.println("Agencia: "+conta.getAgencia());
		
		//Unindo conta com cliente
		conta.setTitular(cliente);
		cliente.setNome("Paulo");
		
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");
		conta.getTitular().setNome("João Marcos");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
