
public class Aplicacao {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado(); //instanciaçao de objeto
		quadrado.setLado(100);
		quadrado.calcularArea(); //usado o metodo para tal objeto
		
		
		
		Triangulo triangulo = new Triangulo(); //instanciaçao de objeto

		triangulo.setBase(50);; //dado o valor da base
		triangulo.setAltura(10); //dado o valor da altura
		
		triangulo.calcularArea();  //usado o metodo para tal objeto
	}

}
