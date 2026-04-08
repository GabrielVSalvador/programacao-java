package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.Caixa;
import br.com.cefet.banco.modelos.Funcionario;
import br.com.cefet.banco.modelos.Gerente;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Lucila");
		f1.setSalario(2000);
		
		Caixa c1 = new Caixa("Stutz");
		c1.setSalario(2500);
		c1.setNumDoGuiche(12);
		
		Gerente g1 = new Gerente("Ismerio");
		g1.setSalario(4000);
		g1.setSenha(123);
		
		if(g1.autentica(123))
			System.out.println("Acesso liberado!");
		else
			System.out.println("Acesso negado.");
		
		if (g1.autentica(123,"cefet"))
			System.out.println("Acesso liberado!");
		else
			System.out.println("Acesso negado.");
		
		f1.mostraDados();
		System.out.println("Bonificação: R$"+f1.getBonificacao());
		
		c1.mostraDados();
		System.out.println("Guiche: "+c1.getNumDoGuiche());
		System.out.println("Bonificao: R$"+c1.getBonificacao());
		
		g1.mostraDados();
		System.out.println("Bonificação: R$"+g1.getBonificacao());
	}
}
