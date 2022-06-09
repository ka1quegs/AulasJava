public enum DiaDaSemana {
	
	//Dias da semana (Valor)
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);
	
	
	private int num;


	private DiaDaSemana(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	
}
