import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Criaçao de um scanner, para recebimento de dados
		
			
		
		Matematica matematica = new Matematica();
		
		System.out.println("Somar dois números");
		System.out.println("Digite o primeiro número: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int y = scanner.nextInt();
		
		
		int soma = matematica.somar(x, y);
		
		System.out.println("O resultado é " +  soma);
		
		soma = matematica.somar(x, y, 5);
		
		System.out.println("O resultado é " +  soma);
		
		double soma2 = matematica.somar(x, y);
		
		System.out.println("O resultado é " +  soma2);
		
	}

}
