package revHerançaAnimal;

public class Peixe extends Animal {
	String caracteristicas = "Barbatanas e cauda";
	int patas = 0;
	String cor = "cinza";
	String ambiente = "Mar";

	Peixe(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
		super(nome, cor, ambiente, comprimento, velocidade, patas);

	}

	void alteraCaracteristicas(String novaCaracteristica) {
		caracteristicas = novaCaracteristica;
	}

	void caracteristica() {
		System.out.println(this.nome);
		System.out.println("Caracteristicas :" + this.caracteristicas);
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
