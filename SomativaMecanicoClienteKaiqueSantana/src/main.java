import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

		Mecanico mecanico1 = new Mecanico("Pedro", 101010, 100);
		Mecanico mecanico2 = new Mecanico("Carlos", 202020, 200);

		Servico servico1 = new Servico("Troca de pneu", 2, 50, mecanico1);
		Servico servico2 = new Servico("Troca de oleo", 3, 70, mecanico2);

		List<Cliente> listaCliente = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("Kaique", 303030, servico1, FormaPag.A_VISTA);
		Cliente cliente2 = new Cliente("Jorge", 404040, servico1, FormaPag.CARNE);
		Cliente cliente3 = new Cliente("Rafael", 505050, servico2, FormaPag.A_VISTA);
		Cliente cliente4 = new Cliente("Danilo", 606060, servico2, FormaPag.CARTAO_CREDITO);

		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		listaCliente.add(cliente4);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			for (Cliente cliente : listaCliente) {
				escrever.write(cliente.toString());
				System.out.println("O cliente: " + cliente.getNome() + ",cpf: " + cliente.getCpf() + ",fez o serviço " + cliente.getServico().getNome());
				System.out.println("Seu mecanico será o " + mecanico1.getNome());
				System.out.println("Sua forma de pagamento será " + cliente.getFormaPag());
				System.out.println("Com valor total de R$ " + cliente.getValorPagarServico());
				System.out.println("---------------------------------------------------------");

			}
		}

	}
}