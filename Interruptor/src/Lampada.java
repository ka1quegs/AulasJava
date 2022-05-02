
public class Lampada {

	private boolean ligado;

	public Lampada() {
		ligado = true;
		System.out.println("Interruptor ativado");
	}

	public void ligar() {

		ligado = true;
		if (ligado == true) {
			System.out.println("Lampada ON");
		}
	}

	public void desligar() {
		ligado = false;
		System.out.println("Interruptor desativado");
		if (ligado == false) {
			System.out.println("Lampada OFF");
		}
	}

}
