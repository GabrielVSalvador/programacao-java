package br.com.cefet.banco.modelos;

public class Funcionario {
	//atributos
	protected String nome;
	protected String departamento;
	protected double salario;
	protected double salarioMinimo;
	protected boolean ativo = true;
	protected Data dataDeNascimento;
	protected int identificador;
	protected static int geradorDeId;
	
	//construtor
	public Funcionario(String nome) {
		this.salarioMinimo = 1621;
		this.dataDeNascimento = new Data();
		this.identificador = ++Funcionario.geradorDeId;
		this.setNome(nome);
	}

	//metodos
	public Data getDataDeNascimento() {
		return dataDeNascimento;
	}

	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
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
		if(salario>=this.salarioMinimo)
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
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public void aumentaSalario(double porcentagem) {
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