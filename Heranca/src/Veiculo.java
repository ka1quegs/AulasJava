package src;

public class Veiculo {
	
	private String nome;
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar() {
		System.out.println(("BI BI"));
	}
	
	public void imprimir() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo " + modelo);
		System.out.println("Ano: " + ano);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
