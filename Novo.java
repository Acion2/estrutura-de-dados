package imovelHeran�a;

public class Novo extends Imovel {

	void imovelNovo() {
		preco += preco * 0.25;
		System.out.println("Imovel novo na rua :" + this.endereco);
		System.out.println("Pre�o do imovel :" + this.preco+" Reais");
	}
}
