package ingressoHerança;

public class CamaroteSuperior extends VIP {



void camaroteS() {
	valor += valor * 1.75;
	System.out.println("Camarote superior : ");
	System.out.println("Valor do ingresso :" + this.valor);
}
}
