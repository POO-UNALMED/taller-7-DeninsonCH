package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclucion;
	private String referencias;
	private String interpretacion;
	
	
	
	
	
	public Tesis(String origen, String titulo, String autor, int paginas) {
		super(origen, titulo, autor, paginas);
		// TODO Auto-generated constructor stub
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
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

	public String getConclucion() {
		return conclucion;
	}

	public void setConclucion(String conclucion) {
		this.conclucion = conclucion;
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