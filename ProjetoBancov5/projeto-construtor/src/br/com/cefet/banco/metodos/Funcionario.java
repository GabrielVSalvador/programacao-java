package br.com.cefet.banco.metodos;

public class Funcionario {
	//atributos
	private String nome;
	private String departamento;
	private double salario;
	private boolean ativo = true;
	private Data dataDeNascimento;
	private int identificador;
	private static int geradorDeId;
	
	//construtor
	public Funcionario() {
		this.dataDeNascimento = new Data();
		this.identificador = ++Funcionario.geradorDeId;
	}
	public Funcionario(String nome) {
		this();
		this.setNome(nome);
	}
	
	//metodos
	
	public Data getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}

	public void setDataDeNascimento(Data data) {
		this.dataDeNascimento = data;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return ativo;
	}
	
	public void demite() {
		this.ativo = false;
	}
	
	public void readmite() {
		this.ativo = true;
	}
	
	
	
	public void aumentarSalario(double porcentagem) {
		this.salario = (this.salario*porcentagem) + this.salario;
	}
	
	public void mostraDados() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salário: "+this.salario);
		System.out.println("Funcionário trabalha na empresa: "+this.ativo);
		System.out.println("Data de nascimento: "+getDataDeNascimento().getDataBR());
	}

}
