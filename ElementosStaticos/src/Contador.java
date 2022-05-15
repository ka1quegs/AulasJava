
public class Contador {

	private static int valor; //criacao de uma variavel do tipo inteiro (int)
	
	
	
//	public Contador() {  
//		this.valor = 1;
//	}
	static{  //informaçao fica estatica, e dá para ser usado para implementaçao de valores futuros
		valor = 1;
	}
	

	public static void incrementar() {  //incrementa um valor na variavel
		valor ++;
	}
	
	
	public static int getValor() { //pega o valor da variavel e retorna ele mesmo
		return valor;
	}

	public void setValor(int valor) {  //modifica o valor da variavel,dentro de uma nova variavel que poderá ser usada apenas nesse bloco de codigo
		this.valor = valor;
	}
	
	
	
	
}
