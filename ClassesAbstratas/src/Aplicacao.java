
public class Aplicacao {

	public static void main(String[] args) {
		
		Item item = new Item();          //Não pode ser instanciado pois é abstrato
		
		Item item = new Cogumelo();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
		
	}

}
