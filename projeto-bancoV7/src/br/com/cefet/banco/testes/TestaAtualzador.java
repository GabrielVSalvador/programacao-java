package br.com.cefet.banco.testes;

import br.com.cefet.banco.modelos.AtualizadorDeContas;
import br.com.cefet.banco.modelos.Conta;
import br.com.cefet.banco.modelos.ContaCorrente;
import br.com.cefet.banco.modelos.ContaPoupanca;

public class TestaAtualzador {
	public static void main(String[] args) {
		Conta c = new Conta(123);
		Conta cc = new ContaCorrente(456);
		Conta cp = new ContaPoupanca(789);
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.rodaAtualizacao(c);
		adc.rodaAtualizacao(cc);
		adc.rodaAtualizacao(cp);
		
		System.out.println("Saldo Total: "+ adc.getSaldoTotal());
	}
}
