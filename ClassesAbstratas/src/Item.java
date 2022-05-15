
public abstract class Item {	//Superclass
	private int posX;    //criaçao de variavel
	private int posY;
	
	public abstract void pegar() ; //criaçao do metodo pegar
		
	public int getPosX() {  //pega o valor da PosX e retorna o mesmo
		return posX;
	}

	public void setPosX(int posX) {  //Modifica o valor da PosX dentro de uma nova variavel que pode ser usada apenas nesse bloco de código
		this.posX = posX;
	}

	public int getPosY() { //pega o valor da PosY e retorna o mesmo
		return posY;
	}

	public void setPosY(int posY) { 	//Modifica o valor da PosY dentro de uma nova variavel que pode ser usada apenas nesse bloco de código
		this.posY = posY; 
}
}
