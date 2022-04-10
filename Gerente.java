package herançaFuncionario;

public class Gerente extends Funcionario {

	void aumento() {
		salario += salario * 0.15;
		System.out.println("Salario mais aumento :" + this.salario);
	}

	void exibeDados() {
		System.out.println("Gerente");
		System.out.println("nome :" + this.nome);
		System.out.println("RG :" + this.rg);
		System.out.println("CPF :" + this.cpf);
		System.out.println("Salario :" + this.salario);
	}

}
