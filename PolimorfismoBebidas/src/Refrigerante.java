
public class Refrigerante extends Bebida{		//extend = heran�a

	public Refrigerante() {
		super("Refrigerante", false);
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante");
	}

	
	
	
}
