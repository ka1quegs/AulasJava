
public class Quadrado implements AreaCalculavel {

	double lado; //Criado a variavel do tipo double 

	public double getLado() { //recebe lado
		return lado; //retorna o valor de lado
	}

	public void setLado(double lado) {  //dá o valor para a variavel lado
		this.lado = lado;
	}

	@Override
	public void calcularArea() { //dado override do metodo Calcular area
		// TODO Auto-generated method stub
		System.out.println("O valor é " + Math.pow(lado, 2));
	}


}
