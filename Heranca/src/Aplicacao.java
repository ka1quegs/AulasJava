package src;

public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Nissan");
		veiculo.setModelo("GTR");
		veiculo.setAno(2016);
		
		
		veiculo.imprimir();
		veiculo.buzinar();

		Carro carro = new Carro();
		carro.setMarca("Fiat");
		carro.setModelo("Uno");
		carro.setAno(2017);
		carro.setQuatroPortas(true);
		System.out.println();
		carro.imprimir();
		carro.buzinar();
	
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("Mercedes-Benz");
		caminhao.setModelo("4wheels");
		caminhao.setAno(2002);
		System.out.println();
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		moto.setMarca("Yamaha");
		moto.setModelo("XJ6");
		moto.setAno(2017);
		System.out.println();
		moto.imprimir();
		moto.empinar();
		moto.buzinar();
	}
		
	

}
