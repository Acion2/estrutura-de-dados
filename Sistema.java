package revisãoHerança;

public class Sistema {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.cliente = "joao";
		c1.conta = 123456;
		c1.saldo = 500;

		c1.depositar(100);
		c1.sacar(500);
      
		ContaEspecial c2 = new ContaEspecial ();
		c2.cliente = "maria";
		c2.conta = 546333;
		c2.limite = 300;
		c2.saldo = 400;
		
		c2.depositar(50);
	    c2.sacarLimite(500);
	    
	    ContaPoupança c3 = new ContaPoupança ();
	    c3.cliente = "pedro" ;
	    c3.conta = 345213;
	    c3.saldo = 600;
	    
	    c3.depositar(400);
	    c3.rendimento(40);
	    c3.sacar(300);
	}

}
