
public class Aplicacao {

	public static void main(String[] args) {
		
		//Item item = new Item();          //Não pode ser instanciado pois é abstrato
		
		Item item = new Cogumelo();  //instanciaçao do objeto
		item.pegar(); //usado o metodo nele
		
		item = new Moeda(); //instanciaçao do objeto
		item.pegar();//usado o metodo nele
		
		item = new Diamante();//instanciaçao do objeto
		item.pegar();//usado o metodo nele
		
	}

}
