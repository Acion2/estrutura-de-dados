package vetorCaneta;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Uma Caneta ");
		System.out.println("Modelo " + this.modelo);
		System.out.println("Cor " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.print("Carga " + this.carga);
		System.out.println("%");
		System.out.println("Está tampada? " + this.tampada);

	}


	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}
}
