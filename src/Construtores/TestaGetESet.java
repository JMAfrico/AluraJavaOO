package Construtores;

import Construtores.Conta;

public class TestaGetESet {

	public static void main(String[] args) {
		
		//Instância de nova conta e novo cliente
		Conta conta = new Conta(1554,11199656);
		Cliente cliente = new Cliente();
		
		Conta conta2 = new Conta(1566,484722);
		Cliente cliente2 = new Cliente();
		
		System.out.println("Contas criadas: "+Conta.getTotalContas());
		

		
	}
}
