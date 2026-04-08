package br.com.cefet.banco.testes;

import br.com.cefet.banco.metodos.Empresa;
import br.com.cefet.banco.metodos.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa emp = new Empresa(1);
		emp.setCnpj("12345678911234");
		emp.setNome("CEFET");

		Funcionario f1 = new Funcionario();
		f1.setNome("Fulano");
		f1.setSalario(5000);
		f1.setDepartamento("FRONT");
		f1.getDataDeNascimento().setDia("14");
		f1.getDataDeNascimento().setMes("02");
		f1.getDataDeNascimento().setAno("2004");

		Funcionario f2 = new Funcionario("Beltrano");
		f2.setSalario(6000);
		f2.setDepartamento("BACK");
		f2.getDataDeNascimento().setDia("02");
		f2.getDataDeNascimento().setMes("02");
		f2.getDataDeNascimento().setAno("2004");
		
		Funcionario f3 = new Funcionario();
		f3.setNome("Kaylane");
		f3.setSalario(7000);
		f3.setDepartamento("FULL");
		f3.getDataDeNascimento().setDia("04");
		f3.getDataDeNascimento().setMes("03");
		f3.getDataDeNascimento().setAno("2005");

		emp.adiciona(f1);
		emp.adiciona(f2);
		emp.adiciona(f3);

		f2.aumentaSalario(20);
		//f1.demite();
		emp.getEmpregados()[1].demite();
		
		Funcionario funcRecuperado = emp.getFuncionario(1);
		System.out.println("Funcionário recuperado na posição 1");
		funcRecuperado.mostraDados();

		// Mostrando todos os empregados
		System.out.println("Exibindo os empregados da empresa " + emp.getNome() + ":\n");
		emp.mostraEmpregados();
		System.out.println("---- Mostrando os empregados novamente ----\n");
		for(Funcionario func: emp.getEmpregados()) {
			if(func!=null)
				func.mostraDados();
		}
		
		if(emp.existeNaEmpresa(f3))
			 System.out.println(f3.getNome()+" existe na empresa"); 
		else
			 System.out.println(f3.getNome()+" NÃO existe na empresa");
	}

}
