
public class Aplicacao {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado();
		quadrado.setLado(100);
		quadrado.calcularArea();
		
		
		
		Triangulo triangulo = new Triangulo();

		triangulo.setBase(50);;
		triangulo.setAltura(10);
		
		triangulo.calcularArea();
	}

}
