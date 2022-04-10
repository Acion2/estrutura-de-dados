package revis�oHeran�a;

public class ContaBancaria {
	String cliente;
	int conta;
	float saldo;

	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Cliente :"+ cliente);
			System.out.println("Sacado: " + valor);
			System.out.println("Novo saldo: " + saldo + "\n");
		} else {
			System.out.println("Saldo insuficiente. Fa�a um dep�sito\n");
		}
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Cliente :"+ cliente);
		System.out.println("Depositado: " + valor);
		System.out.println("Novo saldo: " + saldo + "\n");
		System.out.println("===============================");
	}

}
