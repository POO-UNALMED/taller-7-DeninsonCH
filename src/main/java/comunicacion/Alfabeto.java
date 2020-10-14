package comunicacion;

public abstract class Alfabeto extends Pictograma{

	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen) {
		super(origen);
		// TODO Auto-generated constructor stub
	}
	
	public int cantidadLetras() {
		return letras.length;
	}
	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
}
