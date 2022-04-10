package ingressoHerança;

public class CamaroteInferior extends VIP {
	

	void camaroteI() {
		valor += valor * 1.5;
		System.out.println("Camarote Inferior : ");
		System.out.println("Valor do ingresso :" + this.valor);
	}
}
