package revisao;

public class Carro {
	
	String modelo;
	String cor;
	int ano;
	String marca;
	String chassi;
	String proprietario;
	int velocidadeMax;
	int velocidadeAtual;
	int numPortas;
	boolean tetoSolar;
	int numMarchas;
	boolean temCambioAuto;
	int volumeCombustivel;
	
	void statusC() {
		System.out.println("Carro :");
		System.out.println("Modelo :"+this.modelo);
		System.out.println("Cor :"+this.cor);
		System.out.println("Ano :"+this.ano);
		System.out.println("Marca :"+this.marca);
		System.out.println("Chassi :"+this.chassi);
		System.out.println("Proprietario :"+this.proprietario);
		System.out.println("Velocidade máxima :"+this.velocidadeMax);
		System.out.println("Velocidade atual :"+this.velocidadeAtual);
		System.out.println("Numero de portas :"+this.numPortas);
		System.out.println("Possui teto solar? :"+this.tetoSolar);
		System.out.println("Número de marchas :"+this.numMarchas);
		System.out.println("Possui cambio automatico? :"+this.temCambioAuto);
		System.out.println("Volume de combustivel :"+this.volumeCombustivel+"%");
		System.out.println("=================================");
	}
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public boolean isTetoSolar() {
		return tetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}
	public int getNumMarchas() {
		return numMarchas;
	}
	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	public boolean isTemCambioAuto() {
		return temCambioAuto;
	}
	public void setTemCambioAuto(boolean temCambioAuto) {
		this.temCambioAuto = temCambioAuto;
	}
	public int getVolumeCombustivel() {
		return volumeCombustivel;
	}
	public void setVolumeCombustivel(int volumeCombustivel) {
		this.volumeCombustivel = volumeCombustivel;
	}
	
	
}
