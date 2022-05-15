package src;

public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo(); //criacao de objeto
		
		veiculo.setMarca("Nissan");  //dá informaçao para cada atributo
		veiculo.setModelo("GTR");
		veiculo.setAno(2016);
		
		
		veiculo.imprimir();  // imprime os metodos
		veiculo.buzinar();

		Carro carro = new Carro();  //criacao de objeto
		carro.setMarca("Fiat");
		carro.setModelo("Uno");
		carro.setAno(2017);
		carro.setQuatroPortas(true);
		System.out.println();
		carro.imprimir();  // imprime os metodos
		carro.buzinar();
	
		Caminhao caminhao = new Caminhao();  //criacao de objeto
		caminhao.setMarca("Mercedes-Benz");
		caminhao.setModelo("4wheels");
		caminhao.setAno(2002);
		System.out.println();   
		caminhao.imprimir(); // imprime os metodos
		caminhao.buzinar(); 
		
		Moto moto = new Moto();  //criacao de objeto
		moto.setMarca("Yamaha");
		moto.setModelo("XJ6");
		moto.setAno(2017);
		System.out.println();
		moto.imprimir();  // imprime os metodos
		moto.empinar(); 
		moto.buzinar();
	}
		
	

}
