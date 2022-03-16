package juego;

import java.util.ArrayList;

public class Personaje extends Elemento{
	
	private int velocidad;
	protected ArrayList<Fruta> Frutas;
	protected int desaparecer;
	
	public Personaje(int posicionX, int posicionY, int ancho, int alto, String imagen, int velocidad, char simbolo) {
		super(posicionX, posicionY, ancho, alto, imagen, simbolo);
		// TODO Auto-generated constructor stub
		this.velocidad = velocidad;
		this.Frutas = new ArrayList<Fruta>();
	}
	
			public int getVelocidad() {
				return velocidad;
			}
			
			public void setVelocidad(int velocidad) {
				this.velocidad = velocidad;
			}

			public void mostrarFrutas() {
			
		}
			
			public void setDesaparecer(int desaparecer) {
				this.desaparecer = desaparecer;
			}
			
			@Override
			public void mostrarDatos() {
				// TODO Auto-generated method stub
				System.out.println("Personaje "+"Posición" + this.posicionX + "," + this.posicionY);
			}

		

}
