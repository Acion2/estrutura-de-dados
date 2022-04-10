package ingressoHerança;

import java.util.Scanner;

public class Show {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite 1 para ingresso normal :");
		System.out.println("Digite 2 para ingresso VIP :");
		int ingresso = teclado.nextInt();

		if (ingresso == 1) {
			Normal i = new Normal();
			i.ingresssoNormal();
		}
		if (ingresso == 2) {
			Scanner teclado2 = new Scanner(System.in);
			System.out.println("Digite 1 para Camarote superior :");
			System.out.println("Digite 2 para camarote inferior:");
			int local = teclado2.nextInt();
			if(local ==1) {
				CamaroteSuperior c = new CamaroteSuperior();
				c.camaroteS();
			}if(local ==2) {
				CamaroteInferior c = new CamaroteInferior();
				c.camaroteI();
			}
		}

	}

}
