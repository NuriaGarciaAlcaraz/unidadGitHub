package juego;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import juego.Elemento;

public class Ventana {
	
	private final int WIDHT = 50;
	private final int HEIGHT = 50;
	
	private Escenario escenario; 
	
	public Ventana(){
		this.escenario = new Escenario(WIDHT, HEIGHT);
	}
	
	public void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
	
		System.out.println("Seleccione un escenario");
		System.out.println();
		System.out.println("Escenario 1");
		System.out.println("Escenario 2");
		System.out.println("Escenario 3");
		System.out.println("Escenario 4");
		
		opcion = scanner.nextInt();
		
	switch(opcion) {
	case 1:
		this.escenario.crearEscenario1();
		break;
	case 2: 
		this.escenario.crearEscenario2();
		break;
	case 3:	
		this.escenario.crearEscenario3();
		break;
	case 4:
		this.escenario.crearEscenario4();
		break;
		}	
	
	Timer timer = new Timer();
	
    timer.schedule(new TimerJuego(this), 0, 200);
    
    scanner.nextLine();
    
    while(true) {
    	String input = scanner.nextLine();
    	if (input.equals("")) {
    		this.escenario.saltarPersonaje();
    	}
    }
	
	}

	public boolean jugando() {
		Boolean result = this.escenario.jugando();
		if(result) {
			dibujarEscenario(this.escenario.getElementos(),WIDHT,HEIGHT);
		}
		return result;
		
	}
	
	public void dibujarEscenario(ArrayList<Elemento> elementos, int WIDHT, int HEIGHT) {     
		  char[][] escenarioTextual = new char[WIDHT][HEIGHT];  
		  for (int i = 0; i < WIDHT; i++) {     
		    for (int j = 0; j < HEIGHT; j++) {           
		      if (j==0) {              
		        escenarioTextual[i][j] = '#';           
		      }else {              
		        escenarioTextual[i][j] = ' ';          
		       }        
		    }     
		  }     
		  for (Elemento elemento: elementos) {      
		      escenarioTextual[elemento.posicionX][elemento.posicionY] = elemento.getSimbolo();         
		  }     
		  for (int y =HEIGHT - 1; y >= 0; y--) {        
		    for (int x = 0; x < WIDHT; x++) {           
		      if (y==0) {              
		        System.out.printf("#");           
		      }else {
		        System.out.printf(Character.toString(escenarioTextual[x][y]));           
		      }        
		    }        
		    System.out.printf("\n");     
		  }  
		}
		
}
