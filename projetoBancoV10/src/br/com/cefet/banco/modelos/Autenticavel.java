package br.com.cefet.banco.modelos;

public interface Autenticavel {
	boolean autentica(int senha);
	void setSenha(int senha);
}
