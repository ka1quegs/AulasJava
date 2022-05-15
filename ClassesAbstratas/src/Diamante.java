
public class Diamante extends Item {  //DIamante herda de Item

	@Override
	public void pegar() {      ////Subscreve o metodo pegar com mensagem para tal item
		System.out.println("Pegou diamante");
	}

}
