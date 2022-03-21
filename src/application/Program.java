package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		Funcionario func = new Funcionario();
		
		func.setNome("Luiz");
		System.out.println("Nome: " + func.getNome());
		func.setMatricula("0010");
		System.out.println("Matricula: " + func.getMatricula());
		func.setSalario(2500.0);
		System.out.println("salario: " + "R$ " + func.getSalario());
		func.setDataAdmissao(sdf.parse("12/12/2012"));
		System.out.println("Data de Admissao: " + sdf.format(func.getDataAdmissao()));
		func.setCpf("065.958.452-22");
		System.out.println("Cpf: " + func.getCpf());
		

		System.out.println(func);
		
		
		sc.close();
	}

}
