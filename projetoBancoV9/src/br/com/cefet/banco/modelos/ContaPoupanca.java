package br.com.cefet.banco.modelos;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero) {
		super(numero);
	}
	
	@Override
	public boolean deposita(double valor) {
		return super.deposita(valor-0.1);
	}

	@Override
	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}
	
}
