
public class main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();

		pessoa1.nome = "Kaique";
		pessoa1.numFigurinhas = 1;

		pessoa1.receber(3);
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "José";
		pessoa2.numFigurinhas = 3;

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas);

		boolean retorno = pessoa1.dar(5, pessoa2);

		if (retorno == true) {

			pessoa1.dar(5, pessoa2);

			System.out.println("depois");

			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numFigurinhas);

			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numFigurinhas);

		}
	}
}
