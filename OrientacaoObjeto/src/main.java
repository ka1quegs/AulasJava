
public class main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Kaique";
		pessoa1.numFigurinhas = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
	}

}
