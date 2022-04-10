package imovelHerança;

public class Velho extends Imovel {

	void imovelVelho() {
		preco -= (preco * 0.25);
		System.out.println("Imovel usado na rua :" + this.endereco);
		System.out.println("Preço do imovel :" + this.preco+" Reais");
	}
}
