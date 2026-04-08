package br.com.cefet.banco.testes;

import br.com.cefet.banco.metodos.Conta;

public class TestaMetodos {

	public static void main(String[] args) {	
		System.out.println("Contas existentes na memória: "+Conta.getTotalDeContas());
		Conta conta1 = new Conta(123, "Nery");
		//conta1.setNumero(123);//Não funciona mais
		conta1.deposita(3000);
		conta1.getTitular().setNome("Gustavo Nery");
		conta1.getTitular().setEmail("nery@cefet-rj.br");
		conta1.getTitular().setCpf("12345678910");//
		conta1.getTitular().setEmail("nery@gmail.com");//
		conta1.getTitular().setEmail("gustavo.nery@cefet-rj.br");//

		Conta conta2 = new Conta(456, "Letícia", "12345678911");
		conta2.getTitular().setEmail("leticia@cefet-rj.br");
		conta2.deposita(4000);
		
		Conta conta3 = new Conta(789);
		conta3.getTitular().setNome("Nicoly");
		conta3.getTitular().setCpf("12345678955");
		conta3.getTitular().setEmail("nicoly@gmail.com");

		conta1.deposita(1000);
		conta2.deposita(1000);
		conta3.deposita(3000);

		System.out.println("conta1:");
		System.out.println("Número: " + conta1.getNumero());
		System.out.println("Saldo: R$" + conta1.getSaldo());
		System.out.println("Dados do titular:");
		System.out.println("Nome: "+conta1.getTitular().getNome());
		System.out.println("Cpf: "+conta1.getTitular().getCpf());
		System.out.println("E-mail: "+conta1.getTitular().getEmail());
		System.out.println("########################################");
		System.out.println("conta2:");
		conta2.mostraDados();
		System.out.println("########################################");
		System.out.println("conta3:");
		conta3.mostraDados();
		
		System.out.println("Contas existentes na memória: "+Conta.getTotalDeContas());
		System.out.println("O somatório do saldo das "+Conta.getTotalDeContas()+" contas é ");
	
	}
}
