package br.com.cefet.banco.modelos;

public class Caixa extends Funcionario {
	//atributos
	private int numDoGuiche;
	
	//construtores
	public Caixa(String nome) {
		super(nome);
	}
	
	//metodos
	public int getNumDoGuiche() {
		return numDoGuiche;
	}

	public void setNumDoGuiche(int numDoGuiche) {
		this.numDoGuiche = numDoGuiche;
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() * 0.15;
	}
	
}
