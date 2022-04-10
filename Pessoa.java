package revisao;

public class Pessoa {
	String nascimento;
	String nome;
	String rg;
	String cpf;
	String rua;
	String bairro;
	String cidade;
	String estado;
	String cep;
	String complemento;
	Carro veiculo;
   
	public Pessoa() {

	}
	
	public void setVeiculo(Carro veiculo) {
		this.veiculo = veiculo;
	}

	public Carro getVeiculo() {
		return veiculo;
	}

	void status() {
		System.out.println("Pessoa :");
		System.out.println("Nome :" + this.nome);
		System.out.println("Nascimento :" + this.nascimento);
		System.out.println("RG :" + this.rg);
		System.out.println("CPF :" + this.cpf);
		System.out.println("rua :" + this.rua);
		System.out.println("bairro :" + this.bairro);
		System.out.println("estado :" + this.estado);
		System.out.println("cep :" + this.cep);
		System.out.println("complemento :" + this.complemento);
		System.out.println("=================================");
	}
	


	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
