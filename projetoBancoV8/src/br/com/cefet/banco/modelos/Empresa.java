package br.com.cefet.banco.modelos;

import java.util.Arrays;

public class Empresa {
	// atributos
	private String nome, cnpj;
	private Funcionario[] empregados;
	private int posicaoLivre;
	
	//construtor
	public Empresa(int tamanho) {
        this.empregados = new Funcionario[tamanho];
    }
	
	//comportamentos
	public Funcionario getFuncionario(int posicao) {
		return this.empregados[posicao];
	}
	
	private void aumentaArray() {
		this.empregados = Arrays.copyOf(this.empregados, this.empregados.length+1);
	}
	
	
	public void adiciona(Funcionario f) {
		if(this.empregados.length == this.posicaoLivre) {
			this.aumentaArray();
		}
		this.empregados[this.posicaoLivre] = f;
		this.posicaoLivre++;
	}
	
	public void mostraEmpregados() {
		for(Funcionario f : empregados) {
			if(f!=null) {
				f.mostraDados();
			}
		}
		
	}
	
	public boolean existeNaEmpresa(Funcionario f) {
		for(int i=0;i>empregados.length;i++) {
			if(this.empregados[i]== f) {
				return true;
			}
		}
		return false;
	}
	
	// set e get
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario[] getEmpregados() {
		return empregados;
	}
	
}