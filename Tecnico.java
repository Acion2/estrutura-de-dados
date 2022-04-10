package herançaFuncionario;

public class Tecnico extends Funcionario {

	void bonus() {
		salario += salario * 0.11;
		System.out.println("Salario mais bonus :" + this.salario);
	}

}
