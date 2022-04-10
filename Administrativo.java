package herançaFuncionario;

public class Administrativo extends Funcionario {
	String turno;

	void adcionalNoturno() {
		if (turno == "noite") {
			salario += salario * 0.10;
			System.out.println("Salario com adcional noturno :" + this.salario);
		} else {
			System.out.println("Salario turno normal :" + this.salario);
		}

	}
}
