package helper.hotLoader.examples;

import helper.hotLoader.rf.HotLoader;
import helper.hotLoader.rf.Prim;
import helper.hotLoader.rf.StatReflex;


public class ReflectStatic {
	
	public static final String texto = "asdf texto a modificar durante la ejecucion";
	public static final int numero = 2;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		while (true){
			StatReflex sr = HotLoader.load4reflectStatic(ReflectStatic.class);
			sr.execute("print");
			
			sr.execute("print", new Object[]{texto, new Prim(numero)});
		    
		    Thread.sleep(3000);
		}
		
		
		
		
	}
	
	public static void print() {
		System.out.println("texto a modificar durante durante la ejecucion");
		System.out.println("");
	}
	
	public static void print(String text, int num){
		
		System.out.println("parametros pasados pro el metodo " + text + " con el numero " + num);
		System.out.println("");
		System.out.println("parametros de la clase " +texto + " con el numero " + numero );
		System.out.println("");
	}

}
