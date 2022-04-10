package herançaFuncionario;

public class Empresa {

	public static void main(String[] args) {
		Administrativo f1 = new Administrativo();
		Tecnico f2 = new Tecnico();
		
		f1.nome = "joao";
		f1.cpf= "9903224438";
		f1.rg= "227439443";
		f1.matricula = "35859330";
		f1.turno="noite";
		f1.salario= 1500;
		
		f2.nome = "pedro";
		f2.cpf= "9403224438";
		f2.rg= "22743w9443";
		f2.matricula = "35859331";
		f2.salario= 1500;
		
		
		System.out.println("Funcionario :"+ f1.nome);
		System.out.println("matricula :"+f1.matricula);
		f1.adcionalNoturno();
		System.out.println("===========================");
		System.out.println("Funcionario :"+ f2.nome);
		System.out.println("matricula :"+f2.matricula);
		f2.bonus();
		System.out.println("===========================");
	}

}
