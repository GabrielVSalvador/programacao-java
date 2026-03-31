package br.com.cefet.banco.testes;
import br.com.cefet.banco.metodos.Data;
import br.com.cefet.banco.metodos.Empresa;
import br.com.cefet.banco.metodos.Funcionario;

public class TestaEmpresa {
	public static void main(String[] args) {
	Empresa empresa =new Empresa();
	
	Funcionario f1 = new Funcionario();
	f1.setNome("Rafael");
	f1.setDepartamento("INFORMÁTICA");
	f1.setSalario(2000);
	f1.aumentarSalario(10);
	f1.getDataDeNascimento().setDia("06");
	f1.getDataDeNascimento().setMes("11");
	f1.getDataDeNascimento().setAno("1974");
	
	Funcionario f2 = new Funcionario();
	f2.setNome("Maria");
	f2.setDepartamento("BIBLIOTECA");
	f2.setSalario(3000);
	f2.aumentarSalario(5);
	Data data = new Data();
	data.setDia("10");
	data.setMes("04");
	data.setAno("1995");
	f2.setDataDeNascimento(data);
	
	empresa.adiciona(f1);
	empresa.adiciona(f2);
	
	empresa.setNome("CEFET");
	
	System.out.println("");
		
	}
}
