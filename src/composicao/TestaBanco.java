package composicao;

public class TestaBanco {

	public static void main(String[] args) {
		
			//Criando novo cliente
			Cliente cliente = new Cliente();
			cliente.nome = "Paulo Silveira";
			cliente.cpf = "151.151.151-60";
			cliente.profissao = "Programador";
			
			//Criando nova conta
			Conta conta = new Conta();
			conta.deposita(100);
			
			//Associando conta ao cliente
			conta.titular = cliente;
			
			//Mostrando as informações da conta e cliente
			System.out.println("Cliente: "+conta.titular.nome);
			System.out.println("CPF: "+conta.titular.cpf);
			System.out.println("Profissão: "+conta.titular.profissao);
			System.out.println("Saldo da conta: "+conta.mostrarSaldo());
	
	}

}
