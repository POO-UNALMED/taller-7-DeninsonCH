package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;

	/*
	public Fabula(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}
	*/
	public Fabula(String origen, String titulo, String autor, int paginas, String e, String i) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=e;
		this.interpretacion=i;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return (palabrasPagina*getPaginas()*1);
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getOrigen() + "\n" + getTitulo() + "\n" + getAutor()+ "\n"  + getPaginas() + "\n" + ensenanza);
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
