package revisãoHerança;

public class ContaEspecial extends ContaBancaria {
float limite;


public void sacarLimite(double valor) {
	
	saldo += limite;
	if (saldo >= valor) {
		saldo -= valor;
		System.out.println("Cliente :"+ cliente);
		System.out.println("Sacado: " + valor);
		System.out.println("Novo saldo: " + saldo + "\n");
	} else {
		System.out.println("Saldo insuficiente. Faça um depósito\n");
	}
}
}
