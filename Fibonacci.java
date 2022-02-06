package utilidades;
import utilidades.Teclado;
public class Fibonacci {
     public static void main(String[]args) {
    	 int val, pre=0, pos=1;
    	 System.out.println("Número de términos de la serie");
    	 int n=Teclado.readInt();
    	 System.out.println(pre+"\t"+pos);
    	 for(int x = 3; x <= n; x++) {
    	 val = pre + pos;
    		 pre = pos;
    		 pos = val;
    		 System.out.println("\t"+val);
    		 
    	 }
}
}
