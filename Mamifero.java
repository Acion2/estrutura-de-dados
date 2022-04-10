package revHerançaAnimal;

public class Mamifero extends Animal {

	String alimento;
	String nome = "urso";
	String cor = "Marrom";
	String ambiente = "terra";
	int comprimento = 310;
	float velocidade = 50;
	int patas = 4;

	Mamifero(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
		super(nome, cor, ambiente, comprimento, velocidade, patas);

	}

	void alteraAlimento(String novoAlimento) {
		alimento = novoAlimento;
	}

	void mostraAlimento() {
		System.out.println(this.nome);
		System.out.println("Alimento :" + this.alimento);
	}

	void dados() {
		System.out.println("========================================");
		System.out.println("Animal:");
		System.out.println("nome :" + this.nome);
		System.out.println("comprimento :" + this.comprimento);
		System.out.println("Numero de Patas :" + this.numPatas);
		System.out.println("Cor :" + this.cor);
		System.out.println("Ambiente :" + this.ambiente);
		System.out.println("Velocidade em km/h :" + this.velocidade);
		System.out.println("========================================");
	}
}
