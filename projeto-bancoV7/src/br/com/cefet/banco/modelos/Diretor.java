package br.com.cefet.banco.modelos;

public class Diretor extends Gerente{

	public Diretor(String nome) {
		super(nome);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao()* 0.5;
	}
}
