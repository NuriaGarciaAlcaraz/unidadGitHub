package juego;

public abstract class Elemento {
	
	protected int posicionX;
	protected int posicionY;
	protected int ancho;
	protected int alto;
	protected String imagen;
	protected char simbolo;
	
	public Elemento(int posicionX, int posicionY, int ancho, int alto, String imagen, char simbolo) {
		// TODO Auto-generated constructor stub
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.ancho = ancho;
		this.alto = alto;
		this.imagen = imagen;
		this.simbolo = simbolo;
	}

	public int getPosicionX() {
		return posicionX;
	}
	
	public int getPosicionY() {
		return posicionY;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public int getAlto() {
		return alto;
	}
	
	public String getImagen() {
		return imagen;
	}

	public char getSimbolo() {
		// TODO Auto-generated method stub
		return simbolo;
	}
	
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public abstract void mostrarDatos();

	
}
