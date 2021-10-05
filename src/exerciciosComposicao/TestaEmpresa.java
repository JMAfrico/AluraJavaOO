package exerciciosComposicao;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Empresa empresa = new Empresa();
		Endereco enderecoPessoa = new Endereco();
		Endereco enderecoEmpresa = new Endereco();
		
		pessoa.nome = "João";
		pessoa.cpf = "125.125.125-12";
		pessoa.idade = 30;
		
		empresa.cnpjs = "12545.1251-1000";
		empresa.razaoSocial = "Tecnologia da informação";
		
		enderecoPessoa.cidade = "São Paulo";
		enderecoPessoa.bairro = "Itaim Paulista";
		enderecoPessoa.cep = "08142-010";
		enderecoPessoa.logradouro = "Rua José Silva";
		enderecoPessoa.complemento = "Casa";
		enderecoPessoa.numero = "2";
		
		enderecoEmpresa.cidade = "São Paulo";
		enderecoEmpresa.bairro = "Osasco";
		enderecoEmpresa.cep = "14458-550";
		enderecoEmpresa.logradouro = "Rua Conselheiro Teles";
		enderecoEmpresa.complemento = "Prédio 2";
		enderecoEmpresa.numero = "155";
		
		pessoa.endereco = enderecoPessoa;
		empresa.endereco = enderecoEmpresa;
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa.endereco.logradouro);
		
		System.out.println(empresa.razaoSocial);
		System.out.println(empresa.endereco.logradouro);
		
	}

}
