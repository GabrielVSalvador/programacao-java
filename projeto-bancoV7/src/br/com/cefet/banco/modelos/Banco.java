package br.com.cefet.banco.modelos;

import java.util.Arrays;

public class Banco {
	//atributos
	private Conta[] contas;
	private int totalDeContas;
	
	//construtores
	public Banco(int qtdContas) {
		this.contas = new Conta[qtdContas];
	}
	
	//metodos
	public Conta[] getContas() {
		return contas;
	}
	
	public void adiciona(Conta c) {
		if(this.contas.length == this.totalDeContas)
			this.contas = Arrays.copyOf(this.contas, this.contas.length+1);
		this.contas[this.totalDeContas] = c;
		this.totalDeContas++;
	}
	
	public Conta getConta(int posicao) {
		if(posicao < this.totalDeContas && posicao>=0)
			return this.contas[posicao];
		return null;
	}

	public int getTotalDeContas() {
		return totalDeContas;
	}
	
}
