
public class Aplicacao {

	public static void main(String[] args) {

		Rota rota = new Rota(); // instanciando rota
		Ferrari ferrari = new Ferrari(); //instanciando veiculo
//		Fusca fusca = new Fusca(); //instanciando veiculo
		
//		rota.ir(ferrari); // metodo para ir 
//		System.out.println(); //pula linha
//		rota.ir(fusca);
		
//		Automovel automovel = new Ferrari(); //Deixa o polimorfismo mais evidente
//		rota.ir(automovel);
//		System.out.println();
//		automovel = new Fusca();
//		rota.ir(automovel);
//
		
		Vendedor vendedor = new Vendedor();  //criacao de um novo objeto
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);  //uso de metodo para tal objeto
		vendedor.mostrarPreco(ferrari);
	}

}
