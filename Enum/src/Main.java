public class Main {
	public static final double  PI = 3.14; //Criação de constante de maneira diferente do Enum

	private enum Sexo{  
		MASCULINO, FEMININO //opçoes de escolha
	}
	
	public static void main(String[] args) {
		
		
		double pi = Main.PI; //Mostrando que para cada constante que criar sem ser no enum tem que ser guardada em algum lugar.
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum(); //Pega o Dia da semana e o numero do indice
	
		System.out.println(num);// Mostra a variavel num que contem o indice de segunda.
		
		String s = "TERCA"; //Guarda o valor na variavel
		hoje = DiaDaSemana.valueOf(s);// Procura no Enum a string que está na variavel s e coloca na variavel hoje.
		
		
		System.out.println(hoje.getNum()); // Mostra o Dia de hoje, com o valor da variavel s
		
		Sexo sexo = Sexo.FEMININO; //sexo é do tipo Feminino
		sexo = Sexo.MASCULINO; // sexo é do tipo Masculino
	}

}