package concessionaria;

public class Funcionario extends Pessoa {
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		super(id, nome);
		this.setSalario(salario);
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
 