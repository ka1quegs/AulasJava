
public class Triangulo implements AreaCalculavel{
	
	int base;  //Criação de variaveis
	int altura;
	public double getbase() { //pegará o valor da base e retornará o mesmo
		return base;
	}
	

	public void setBase(int base) {  //modificará o valor da base
		this.base = base;
	}

	public double getAltura() { //pegará o valor da altura e retornará o mesmo
		return altura;
	}

	public void setAltura(int altura) {  //modificará o valor da altura
		this.altura = altura;
	}

	@Override								//Dá override (subscrever) tal metodo
	public void calcularArea() { 
		System.out.println("O valor da conta do triangulo é " + base*altura);
		
	}
	
	

}
