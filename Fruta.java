package juego;

public class Fruta extends Elemento{
	
	protected String nombre;
	protected int puntos;
	
	public Fruta(int posicionX, int posicionY, int ancho, int alto, String imagen, String nombre, int puntos, char simbolo) {
		super(posicionX, posicionY, ancho, alto, imagen, simbolo);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.puntos = puntos;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Fruta: " + this.nombre + "Puntos: " + this.puntos);
	}

}
