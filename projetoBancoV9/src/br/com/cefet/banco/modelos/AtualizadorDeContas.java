package br.com.cefet.banco.modelos;

public class AtualizadorDeContas {
	//atributos
	 private double saldoTotal = 0;
	 private double taxaPadrao;
	 
	 //construtores
	 public AtualizadorDeContas(double taxaPadrao) {
		 this.taxaPadrao = taxaPadrao;
	 }
	 
	 //metodos
	 public void rodaAtualizacao(Conta c) {
		 System.out.println("Saldo atual: R$"+c.getSaldo());
		 c.atualiza(taxaPadrao);
		 System.out.println("Saldo atualizado: R$"+c.getSaldo());
		 this.saldoTotal += c.getSaldo();
	 }
	 
	 public double getSaldoTotal() {
		 return this.saldoTotal;
	 }

	 public double getTaxaPadrao() {
		 return taxaPadrao;
	 }
	 
}
