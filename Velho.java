package imovelHeran�a;

public class Velho extends Imovel {

	void imovelVelho() {
		preco -= (preco * 0.25);
		System.out.println("Imovel usado na rua :" + this.endereco);
		System.out.println("Pre�o do imovel :" + this.preco+" Reais");
	}
}
