package comunicacion;

public class Libro extends Escrito{
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	
	public Libro(String origen, String titulo, String autor, int paginas) {
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
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
