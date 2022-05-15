
public class Moeda extends Item { // Moeda herda de Item

	@Override
	public void pegar() {    //subescreve o metodo pegar, e coloca uma mensagem para tal item
		System.out.println("Pegou moeda");
	}

}
