package br.com.cefet.banco.modelos;

public class Tesoureiro extends Funcionario implements Autenticavel{
	protected int senha;
	//contrutores
	public Tesoureiro(String nome) {
		super(nome);
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	
	@Override
	public double getBonificacao() {
		return this.salario* 0.2;
	}

	@Override
	public boolean autentica(int senha) {
		return(this.senha == senha);
	}
}
