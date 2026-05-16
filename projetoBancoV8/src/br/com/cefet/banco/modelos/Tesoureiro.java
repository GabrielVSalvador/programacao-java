package br.com.cefet.banco.modelos;

public class Tesoureiro extends Funcionario{
	//contrutores
	public Tesoureiro(String nome) {
		super(nome);
	}
	
	@Override
	public double getBonificacao() {
		return this.salario* 0.2;
	}
}
