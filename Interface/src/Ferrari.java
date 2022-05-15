
public class Ferrari implements Automovel, ItemCaro {

	@Override	//dando override no metodo
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
	}

	@Override	//dando override no metodo
	public void virarDireita() {
		System.out.println("Ferrari virou a direita");

	}
	
	@Override	//dando override no metodo
	public void acelerar() {
		System.out.println("Ferrari acelerou");

	}

	@Override
	public double getPreco() {  //subescreve o valor
		
		return 1250000;
	}

	
}
