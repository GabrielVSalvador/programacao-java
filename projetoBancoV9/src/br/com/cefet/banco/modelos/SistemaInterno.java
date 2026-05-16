package br.com.cefet.banco.modelos;

public class SistemaInterno {
	private int senhaInterna;
	
	public SistemaInterno(int senhaInterna) {
		setSenhaInterna(senhaInterna);
	}

	public int getSenhaInterna() {
		return senhaInterna;
	}

	public void setSenhaInterna(int senhaInterna) {
		this.senhaInterna = senhaInterna;
	}
	
	public void login(Gerente g) {
		if(this.senhaInterna == g.getSenha())
			System.out.println("Acesso liberado!");
		else
			System.out.println("Acesso negado!");
	}
}
