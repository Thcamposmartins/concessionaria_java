package concessionaria;

public class Funcionario extends Pessoa {
	private double salario;
	public Funcionario(int id, String nome) {
		super(id, nome);
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
 