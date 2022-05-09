
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		
		System.out.println("Preparando bebida " + bebida.getNome());

		bebida.preparar();
		//verifica se a bebida é quente ou fria
		if(bebida.isAquecer()) {
				System.out.println("Aquecendo a bebida " + bebida.getNome());
				
		}
		
		System.out.println("Bebida preparada com sucesso!!\n" );
	}
	
	
}
