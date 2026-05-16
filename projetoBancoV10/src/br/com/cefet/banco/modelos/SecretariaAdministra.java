package br.com.cefet.banco.modelos;

public class SecretariaAdministra extends Secretaria{

	public SecretariaAdministra(String nome) {
		super(nome);
	}

	@Override
	double getBonificacao() {
		return 0;
	}
	

}
