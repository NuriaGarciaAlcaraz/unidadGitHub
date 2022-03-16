package juego;

import java.util.ArrayList;

public class Escenario {
	
	protected int ancho;
	protected int alto;
	protected int contSaltar;
	protected ArrayList<Elemento> elementos;
	protected Personaje personaje;
	
	
	
	public Escenario(int ancho, int alto) {
		
		this.ancho = ancho;
		this.alto = alto;
		this.elementos = new ArrayList<Elemento>();
	}

	public void agregarPersonaje() {
		
	}
	
	public void agregarFruta(int posicionX, int posicionY, int ancho, int alto, String imagen, String nombre, int puntos, char simbolo) {
		
	}
	
	public void agregarFrutaDragon(int posicionX, int posicionY) {
		
	}
	
	public void agregarFrutaDorada(int posicionX, int posicionY) {
		
	}
	
	public void agregarFrutaPlateada(int posicionX, int posicionY) {
		
	}
	
	public void agregarFrutaHarryPotter(int posicionX, int posicionY) {
		
	}
	
	
	public void agregarFrutaVenenosa(int posicionX, int posicionY) {
		
	}
	
	
	public void crearEscenario1() {
		// TODO Auto-generated method stub
		
	}
	public void crearEscenario2() {
		// TODO Auto-generated method stub
		
	}
	public void crearEscenario3() {
		// TODO Auto-generated method stub
		
	}
	public void crearEscenario4() {
		// TODO Auto-generated method stub
		
	}

	public Boolean jugando() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Elemento> getElementos() {
		// TODO Auto-generated method stub
		return elementos;
	}
	
	public void setElementos(ArrayList<Elemento> elementos){
		this.elementos = elementos;
		
	}

	public void saltarPersonaje() {
		// TODO Auto-generated method stub
		
	}

	

	

	
	
	
	
}
