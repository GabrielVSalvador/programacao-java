package br.com.cefet.banco.modelos;

public class ContabilizadorDeBonificacoes {
	private double totalEmBonificacao;

	public double getTotalEmBonificacao() {
		return totalEmBonificacao;
	}
	
	public void contabiliza(Funcionario f) {
		this.totalEmBonificacao += f.getBonificacao();
	}
	
}
