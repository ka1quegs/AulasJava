import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException {

		try (Scanner entrada = new Scanner(System.in)) {   //força a execução do scanner
			List<Pessoa> lista = new ArrayList<Pessoa>();

			for (int x = 0; x < 4; x++) {  //Laço de repetição para adicionar até 4 pessoas

				Pessoa pessoa = new Pessoa(); //criação da pessoa
				pessoa.setEndereco(new Endereco());

				System.out.println("Cadastre-se");  
				System.out.print("Digite seu nome: ");
				pessoa.setNome(entrada.next());

				System.out.print("Digite sua idade: ");
				pessoa.setIdade(entrada.nextInt());

				System.out.print("Digite seu sexo 1-Masculino 2-Feminino: ");  // Caso 1 vai direcionar o sexo masculino, caso 2 direciona o sexo feminino, se for outro dará sexo inexistente
				int opcao = 0;
				while (opcao != 1 && opcao != 2) { //laço de repetiçao While, enquanto a opcao for diferente de 1 e 2 faz as açoes abaixo
					opcao = entrada.nextInt();
					if (opcao == 1)           //uso das condiçoes
						pessoa.setSexo(Sexo.MASCULINO);

					else if (opcao == 2)
						pessoa.setSexo(Sexo.FEMININO);
					else {
						System.out.println("Sexo inexistente");
						System.out.println("Digite seu sexo 1-Masculino 2-Feminino: ");
					}
				}
				System.out.print("Digite onde bairro onde você mora: ");
				pessoa.getEndereco().setBairro(entrada.next());

				System.out.print("Digite o nome da rua onde você mora: ");
				pessoa.getEndereco().setRua(entrada.next());

				System.out.print("Digite o numero de sua casa: ");
				pessoa.getEndereco().setNum(entrada.nextInt());
				System.out.println();

				lista.add(pessoa);
			}

			try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {    //Escreve o arquivo txte
				for (Pessoa Pessoa : lista) {
					escrever.write(Pessoa.toString()); // o to string faz a ciclagem dos dados de cada pessoa

				}
			}
			List<Pessoa> ListaPessoas2 = new ArrayList<Pessoa>();          //Lista que voltará objeto

			try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
				String line;

				while ((line = reader.readLine()) != null) { //enquanto uma linha ter conteudo ela será lida
					Pessoa pessoa = new Pessoa(line); //instanciacao para o txt

					ListaPessoas2.add(pessoa);
				}

			}
			
			System.out.println(ListaPessoas2); //Mostra o objeto na tela.
		}

	}
}
