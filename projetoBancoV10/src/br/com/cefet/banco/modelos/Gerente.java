package br.com.cefet.banco.modelos;

public class Gerente extends Funcionario implements Autenticavel {
	//atributos
	protected int numeroDeGerenciados;
	protected int senha;
	
	//construtor
	public Gerente(String nome) {
		super(nome);
	}
	
	public Gerente(String nome, int senha) {
		this(nome);
		this.setSenha(senha);
	}

	//metodos
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeGerenciados() {
		return numeroDeGerenciados;
	}
	public void setNumeroDeGerenciados(int numeroDeGerenciados) {
		this.numeroDeGerenciados = numeroDeGerenciados;
	}
	
	public boolean autentica(int senha) {
		return(this.senha == senha);
	}
	
	public boolean autentica(int senha, String login) {
		return(this.senha == senha && login == "cefet");
	}
	
	@Override
	public double getBonificacao() {
		return super.salario * 0.3;
	}
}
