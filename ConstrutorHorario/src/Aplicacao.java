
public class Aplicacao {

	public static void main(String[] args) {
		Data d1 = new Data(10,3,2000,0,30,10);   //cria um novo objeto com parametros
		d1.imprimir(Data.FORMATO_12H);  //usa o metodo imprimir para tal objeto com, tal formato
		d1.imprimir(Data.FORMATO_24H);	//usa o metodo imprimir para tal objeto com, tal formato
		System.out.println("------------------------");
		Data d2 = new Data(15, 06, 2000, 23, 15, 20);  //cria um novo objeto com parametros
		d2.imprimir(Data.FORMATO_12H);  //usa o metodo imprimir para tal objeto com, tal formato
		d2.imprimir(Data.FORMATO_24H);  //usa o metodo imprimir para tal objeto com, tal formato
		System.out.println("------------------------");  //cria um novo objeto com parametros
		Data d3 = new Data(5, 10, 2005); //cria um novo objeto com parametros
		d3.imprimir(Data.FORMATO_12H); //usa o metodo imprimir para tal objeto com, tal formato
		d3.imprimir(Data.FORMATO_24H); //usa o metodo imprimir para tal objeto com, tal formato
		System.out.println("------------------------");  //cria um novo objeto com parametros
		Data d4 = new Data(12,05,2006, 50,12,34); //cria um novo objeto com parametros
		d4.imprimir(Data.FORMATO_12H);  //usa o metodo imprimir para tal objeto com, tal formato
		d4.imprimir(Data.FORMATO_24H);  //usa o metodo imprimir para tal objeto com, tal formato
	}

}
