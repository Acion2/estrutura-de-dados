package revisao;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Carro c = new Carro();
		p.nome="joao";
		p.cpf = "009";
		p.rg ="33849";
		p.nascimento="15/03/1989";
		p.rua="aj";
		p.bairro="Mathias";
		p.estado="RS";
		p.cep="92030010";
		p.complemento="fundos";
		
		c.modelo= "Corsa";
		c.cor="vermelho";
		c.ano=1995;
		c.marca="Chevrolet";
		c.chassi="423-345e";
		c.proprietario="joao";
		c.velocidadeMax=250;
		c.velocidadeAtual=0;
		c.numPortas=4;
		c.tetoSolar=false;
		c.numMarchas=5;
		c.temCambioAuto=false;
		c.volumeCombustivel=40;
		
		p.status();
		c.statusC();
		p.setVeiculo(c);
		System.out.println("Veiculo - "+p.getVeiculo().getModelo()+" - Proprietario - "
		+p.getVeiculo().proprietario);

	}

}
