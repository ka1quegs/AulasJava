
public class Triangulo implements AreaCalculavel{
	
	int base;
	int altura;
	public double getbase() {
		return base;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("O valor da conta do triangulo é " + base*altura);
		
	}
	
	

}
