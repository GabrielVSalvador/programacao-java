package br.com.cefet.banco.metodos;

public class Cliente {
	//Atributos
	private String nome;
	private String cpf;
	private String email;
	
	//construtor
	public Cliente() {
		
	}
	public Cliente(String nome) {
		this.setNome(nome);
	}
	public Cliente(String nome, String cpf) {
		this(nome);
		this.setCpf(cpf);
	}
	
	//Métodos
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(nome.length()==11)
			this.nome = nome;
		
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(validaCpf(cpf))
			return;
		this.cpf = cpf;
	}
	private boolean validaCpf(String cpf) {
		return (cpf.length()==11);
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void mostraDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("E-mail: "+this.email);
	}
	
}