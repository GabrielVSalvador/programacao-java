package br.com.cefet.banco.modelos;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero) {
		super(numero);
	}
	
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa*2);
	}
	
}
