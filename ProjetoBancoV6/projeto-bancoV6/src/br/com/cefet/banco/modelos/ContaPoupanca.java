package br.com.cefet.banco.modelos;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero) {
		super(numero);
	}
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa*3);
	}
	
	@Override
	public boolean deposita(double valor) {
		return super.deposita(valor-0.1);
	}
	
}
