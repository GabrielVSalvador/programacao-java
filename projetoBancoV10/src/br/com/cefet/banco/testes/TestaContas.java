package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.ContaCorrente;
import br.com.cefet.banco.modelos.ContaPoupanca;

public class TestaContas {

	public static void main(String[] args) {	
		System.out.println("Contas existentes na memória: "+ContaCorrente.getTotalDeContas());
		ContaCorrente conta1 = new ContaCorrente(123);
		//conta1.setNumero(123);//Não funciona mais
		conta1.deposita(3000);
		conta1.getTitular().setNome("Gustavo Nery");
		conta1.getTitular().setEmail("nery@cefet-rj.br");
		conta1.getTitular().setCpf("12345678910");//
		conta1.getTitular().setEmail("nery@gmail.com");//
		conta1.getTitular().setEmail("gustavo.nery@cefet-rj.br");//

		ContaCorrente conta2 = new ContaCorrente(456);
		conta2.getTitular().setEmail("leticia@cefet-rj.br");
		conta2.deposita(4000);
		
		ContaCorrente conta3 = new ContaCorrente(789);
		conta3.getTitular().setNome("Nicoly");
		conta3.getTitular().setCpf("12345678955");
		conta3.getTitular().setEmail("nicoly@gmail.com");

		conta1.deposita(1000);
		conta2.deposita(1000);
		conta3.deposita(3000);

		System.out.println("conta1:");
		conta1.mostraDados();
		System.out.println("########################################");
		System.out.println("conta2:");
		conta2.mostraDados();
		System.out.println("########################################");
		System.out.println("conta3:");
		conta3.mostraDados();
		
		System.out.println("Contas existentes na memória: "+ContaCorrente.getTotalDeContas());
		System.out.println("O somatório do saldo das "+ContaCorrente.getTotalDeContas()+" contas é ");
		
		ContaCorrente c = new ContaCorrente(1);
		c.deposita(1000);
		ContaCorrente cc = new ContaCorrente(2);
		cc.deposita(1000);
		ContaPoupanca cp = new ContaPoupanca(3);
		cp.deposita(1000);
		
		System.out.println("Saldo das contas antes de atualizar: ");
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
		System.out.println("Saldo das contas depois de atualizar: ");
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}
}
