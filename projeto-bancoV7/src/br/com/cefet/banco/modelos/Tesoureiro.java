package br.com.cefet.banco.modelos;

public class Tesoureiro extends Funcionario{
	//contrutores
	public Tesoureiro(String nome) {
		super(nome);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() * 0.2;
	}
}
