package revHerançaAnimal;

public class Animal {
	String nome;
	int comprimento;
	int numPatas;
	String cor;
	String ambiente;
	double velocidade;

	Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.numPatas = 4;
	}

	void alteraNome(String novoNome) {
		nome = novoNome;
	}

	void alteraComprimento(String novoComprimento) {
		nome = novoComprimento;
	}

	void alteraPatas(int nPatas) {
		numPatas = nPatas;
	}

	void alteraCor(String novaCor) {
		cor = novaCor;
	}

	void alteraAmbiente(String novoAmbiente) {
		ambiente = novoAmbiente;
	}

	void alteraVelocidade(float novaVelocidade) {
		velocidade = novaVelocidade;
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
