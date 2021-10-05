package composicao;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();	
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		
		System.out.println(contaDaMarcela.titular.nome);
		
		/*EXISTEM 3 MANEIRA DE INICIALIZAR UM OBJETO:
		 * 
		 * 1- NA CLASSE MAIN, UTILIZAR : Cliente cliente = new Cliente();
		 * 2- NA CLASSE MAIN, INST�NCIA A PARTIR DA CONTA : contaDaMarcela.titular = new Cliente();
		 * 3- NA CLASSE CONTA, J� INSTANCIAR UM NOVO CLIENTE : Cliente titular = new Cliente();
		 * No ultimo caso(3), sempre que eu inst�nciar uma nova conta, vai ser inst�nciado um novo cliente tbm.
		 * 
		 */
	}
}
 