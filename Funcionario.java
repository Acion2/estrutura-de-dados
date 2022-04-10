package herançaFuncionario;

public class Funcionario {
	String nome;
	String rg;
	String cpf;
	double salario;
	String matricula;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	void aumento() {
		salario += salario * 0.10;
		System.out.println("Salario mais aumento :" + this.salario);
	}

	void exibeDados() {
		System.out.println("Funcionario");
		System.out.println("nome :" + this.nome);
		System.out.println("RG :" + this.rg);
		System.out.println("CPF :" + this.cpf);
		System.out.println("Salario :" + this.salario);
	}
}
