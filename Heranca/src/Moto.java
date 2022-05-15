package src;

public class Moto extends Veiculo {  //metodo exclusivo para esse tipo de veiculo
	public void empinar() {
		System.out.println("Empinando: BOLOLOLOLOLOLO");
		
	}

	@Override
	public void buzinar() {  //Metodo modificado para apenas esse objeto
		// TODO Auto-generated method stub
		System.out.println("PIIIIIIIIIIIIIIIIIIIIIIIIIII");
	}
	
}
