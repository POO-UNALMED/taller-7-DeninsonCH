package comunicacion;

public class Fabula extends Escrito{
	private String ense�anza;
	private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}
	public Fabula(String origen, String titulo, String autor, int paginas, String e, String i) {
		super(origen, titulo, autor, paginas);
		ense�anza=e;
		interpretacion=i;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return (palabrasPagina*getPaginas()*1);
	}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getOrigen() + "\n" + getTitulo() + "\n" + getAutor()+ "\n"  + getPaginas() + "\n" + ense�anza);
	}

	public String getEnse�anza() {
		return ense�anza;
	}

	public void setEnse�anza(String ense�anza) {
		this.ense�anza = ense�anza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
