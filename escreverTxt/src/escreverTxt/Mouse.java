package escreverTxt;

public class Mouse {
	private boolean funciona;
	private int qtdBotoes;
	private String tamanho;
	
	
	public Mouse(boolean funciona, int qtdBotoes, String tamanho) {
		super();
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		return "Mouse [funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho + "]\n";
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(int qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}
