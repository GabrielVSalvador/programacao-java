package br.com.cefet.banco.modelos;

public class Conta {
	//atributos
	private int numero;
	private Cliente titular;
	private double saldo;
	private static int totalDeContas;
	
	//construtor
	private Conta() {
		this.saldo = 500;
		this.titular = new Cliente();
		Conta.totalDeContas = Conta.totalDeContas +1;
	}
	public Conta(int numero) {
		this();
		this.setNumero(numero);
	}
	public Conta(int numero, String nomeDoTitular) {
		this(numero);
		this.titular = new Cliente(nomeDoTitular);
	}
	public Conta(int numero, String nomeDoTitular, String cpfDoTitular) {
		this(numero);
		this.titular = new Cliente(nomeDoTitular, cpfDoTitular);
	}
	
	//metodos
	
	
	public int getNumero() {
		return this.numero;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}
	
	private void setNumero(int numero) {
		if(numero>0)
			this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean saca(double valor) {
		if( valor <=0 || valor > this.saldo)
			return false;
		this.saldo -= valor;
		return true;
	}
	
	public boolean deposita(double valor) {
		if( valor <= 0)
			return false;
		this.saldo += valor;
		return true;
	}
	
	public boolean transferePara(Conta contaDestino, double valor) {
		if(this == contaDestino)
			return false;
		if(this.saca(valor)) {
			return contaDestino.deposita(valor);
		}
		return false;
	}
	
	public void atualiza (double taxa) {
		this.saldo-=taxa;
	}
	
	public void mostraDados() {
		System.out.println("Número: "+this.numero);
		System.out.println("Saldo: R$"+this.saldo);
		System.out.println("Dados do titular: ");
		this.titular.mostraDados();
	}
}