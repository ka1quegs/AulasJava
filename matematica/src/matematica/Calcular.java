package matematica;
import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		Areas areas = new Areas();
		
		System.out.println("Digite a base do poligono para calcular a área: ");
		int x =scanner.nextInt();
		
		int Quadrado = areas.calculararea(x);
		System.out.println("Resultado do quadrado é igual a: " + Quadrado);
		
		System.out.println("Digite a altura para calcular o triangulo");
		int y = scanner.nextInt();
		
		int triangulo = areas.calculararea(x, y);
		System.out.println("Resultado do retaungulo igual a : " + triangulo);
		
		System.out.println("Digite a altura para calcular o retangulo");
		double y2 = scanner.nextDouble();
		double retangulo = areas.calculararea(x, y2);
		System.out.println("Resultado é igual a: " + retangulo);
		
	}

}
