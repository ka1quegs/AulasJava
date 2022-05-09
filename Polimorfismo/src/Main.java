
public class Main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro();
//		System.out.println("Cachorro falou:");
//		animal.Falar();
//		
//		System.out.println();
//		
//		animal = new Gato();
//		System.out.println("E o gato respondeu: ");
//		animal.Falar();

		Gato gato = new Gato();
			Cachorro cachorro = new Cachorro();
			falar(gato);
			falar(cachorro);
		
	}
	public static void falar(Animal a) {
		a.Falar();
		
		if(a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}
	
}

