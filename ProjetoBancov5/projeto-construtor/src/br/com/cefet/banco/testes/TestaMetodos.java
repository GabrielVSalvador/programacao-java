package br.com.cefet.banco.testes;
import br.com.cefet.banco.metodos.Conta;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setNumero(123);
		conta1.getTitular().setNome("Fulano");
		conta1.getTitular().setCpf("12345678910");
		conta1.getTitular().setEmail("fulano@gmail.com");
		conta1.deposita(3000);
		
		Conta conta2 = new Conta();
		conta2.setNumero(456);
		conta2.getTitular().setNome("Beltrano");
		conta1.getTitular().setCpf("12345678911");
		conta1.getTitular().setEmail("beltrano@gmail.com");
		conta2.deposita(4000);
		
		conta1.deposita(1000);
		conta2.deposita(1000);
		
		if( ! conta1.saca(4001))
			System.out.println("Saldo insuficiente. O saldo atual é de R$"+conta1.getSaldo());
		else
			System.out.println("Saque efetuado com sucesso1");
		
		conta2.saca(3000);
		conta1.transferePara(conta2, 2000);
		
		System.out.println("Conta1: ");
		conta1.mostraDados();
		System.out.println("Conta2: ");
		conta2.mostraDados();
	}
}
