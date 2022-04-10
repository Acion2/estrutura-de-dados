package revisãoHerança;

public class ContaPoupança extends ContaBancaria {
    double diaDeRendimento ;
    double taxa;
    
    
    public void rendimento(double diaDeRendimento) {
    	if (diaDeRendimento >30) {
    		taxa = 0.05;
    	}else
    	{
    		taxa = 0.10;
    	}
		saldo += saldo*taxa ;
		System.out.println("Cliente :"+ cliente);
		System.out.println("Rendimento total: " + saldo + "\n");
	}
    
}
