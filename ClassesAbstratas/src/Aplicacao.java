
public class Aplicacao {

	public static void main(String[] args) {
		
		Item item = new Item();          //N�o pode ser instanciado pois � abstrato
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
	}

}