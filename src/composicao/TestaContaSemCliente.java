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
		 * 2- NA CLASSE MAIN, INSTÂNCIA A PARTIR DA CONTA : contaDaMarcela.titular = new Cliente();
		 * 3- NA CLASSE CONTA, JÁ INSTANCIAR UM NOVO CLIENTE : Cliente titular = new Cliente();
		 * No ultimo caso(3), sempre que eu instânciar uma nova conta, vai ser instânciado um novo cliente tbm.
		 * 
		 */
	}
}
 