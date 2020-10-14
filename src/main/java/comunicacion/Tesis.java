package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	/*
	public Tesis(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}
	*/
	public Tesis(String origen, String titulo, String autor, int paginas, String id, String[] ar, String c, String r, String i) {
		super(origen, titulo, autor, paginas);
		idea= id; 
		argumentos = ar; 
		this.conclusion = c;
		referencias  = r;
		interpretacion = i;
	}

	@Override
	public int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return (palabrasPagina*getPaginas()*5);
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getOrigen() + "\n" + getTitulo() + "\n" + getAutor()+ "\n"  + getPaginas() + "\n" + idea + "\n" + argumentos.length + "\n" + conclusion + "\n" + referencias);
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclucion) {
		this.conclusion = conclucion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
