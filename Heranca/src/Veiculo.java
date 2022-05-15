package src;

public class Veiculo {
	 
	private String nome;     //variaveis do veiculo
	protected String marca;
	protected String modelo;
	protected int ano;
	
	public void buzinar() {     //criacao de metodo
		System.out.println(("BI BI"));
	}
	
	public void imprimir() {   //criacao de metodo
		System.out.println("Marca: " + marca);
		System.out.println("Modelo " + modelo);
		System.out.println("Ano: " + ano);
	}

	public String getNome() {  //recebe o valor e retorna ele mesmo
		return nome;
	}

	public void setNome(String nome) {  //modifica o valor da variavel e coloca em uma nova variavel instanciada
		this.nome = nome;
	}

	public String getMarca() { //recebe o valor e retorna ele mesmo
		return marca;
	}

	public void setMarca(String marca) {  //modifica o valor da variavel e coloca em uma nova variavel instanciada
		this.marca = marca;
	}

	public String getModelo() {  //recebe o valor e retorna ele mesmo
		return modelo;
	}

	public void setModelo(String modelo) {   //modifica o valor da variavel e coloca em uma nova variavel instanciada
		this.modelo = modelo; 
	}

	public int getAno() {  //recebe o valor e retorna ele mesmo
		return ano;
	}

	public void setAno(int ano) {  //modifica o valor da variavel e coloca em uma nova variavel instanciada
		this.ano = ano;
	}
	
	
}
