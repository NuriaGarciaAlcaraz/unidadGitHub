package juego;

import java.util.TimerTask;

public class TimerJuego extends TimerTask {
	
	private final Ventana consola;
    TimerJuego ( Ventana consola ) {       
      this.consola = consola;     
    }
    public void run() {
       //M�todo que ser� ejecutado cada 200 milisegundos
      // Para cancelar el timer pod�is utilizar: "cancel();" 
    
    } 

}
