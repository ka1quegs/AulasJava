
public class Quadrado implements AreaCalculavel {

	double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("O valor é " + Math.pow(lado, 2));
	}


}
