
public class Mecanico extends Usuario{
	
	private double maoDeObra;
	
	public Mecanico(String nome, int cpf, double maoDeObra) {
		super(nome,cpf);
		
	}
	

	public double getMaoDeObra() {
		return maoDeObra;
	}
	public void setMaoDeObra(double maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	
	@Override
	public String toString() {
		return "Mecanico [maoDeObra=" + maoDeObra + "]";
	}

}
