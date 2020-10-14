package comunicacion;

public class Fabula extends Escrito{
	private String enseñanza;
	private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}
	public Fabula(String origen, String titulo, String autor, int paginas, String e, String i) {
		super(origen, titulo, autor, paginas);
		enseñanza=e;
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
		return (getOrigen() + "\n" + getTitulo() + "\n" + getAutor()+ "\n"  + getPaginas() + "\n" + enseñanza);
	}

	public String getEnseñanza() {
		return enseñanza;
	}

	public void setEnseñanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
