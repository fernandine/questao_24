package entidade;

import java.util.Date;

public class Funcionario {
	
	private String nome;
	private String matricula;
	private double salario;
	private Date dataAdmissao;
	private String Cpf;

	
	public Funcionario() {
	}

	public Funcionario(String nome, String matricula, double salario, Date dataAdmissao, String Cpf) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.Cpf = Cpf;
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	
	public double receberAumento(double aumento) {
		return aumento = aumento * salario;
		
	}
	
	public double calcularGanhoLiquidoMensal() {
		
		double liquidoMensal = salario - salario * 0.11;
		return liquidoMensal;

	}
	
	public double calcularGanhoLiquidoAnual() {
		
		double totalLiquido = this.calcularGanhoLiquidoMensal() * 12;
		return totalLiquido;
	}
	
	public double calcularGanhoBrutoAnual() {
	double	brutoAnual = this.salario;
		return brutoAnual;
	}
	
	public double receberImposto() {
	
		double ImpAnual = calcularGanhoLiquidoAnual() -  calcularGanhoBrutoAnual();
		return ImpAnual;
		
	}

	@Override
	public String toString() {
		System.out.println();
		System.out.println("*************");
		return " Salario Liquido Mensal: " + calcularGanhoLiquidoMensal() 
		+ "\n Aumento: " + receberAumento(0.1)
		+ "\n Salario Bruto Anual: R$ " + calcularGanhoBrutoAnual()
		+ "\n Salario Liquido Anual: " + calcularGanhoLiquidoAnual()
		+ "\n Imposto pago no decorrer do ano: " + receberImposto();
	}
	

	}
	
