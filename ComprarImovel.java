package imovelHerança;

import java.util.Scanner;

public class ComprarImovel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 1 para imovel novo :");
		System.out.println("Digite 2 para imovel usado :");
		int escolha = teclado.nextInt();
		if (escolha == 1){
			Novo imovel = new Novo();
			imovel.imovelNovo();
		}if(escolha ==2) {
			Velho imovel = new Velho();
			imovel.imovelVelho();
		}
	}

}
