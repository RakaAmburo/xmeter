package helper.hotLoader.examples;

import helper.hotLoader.rf.HotLoader;
import helper.hotLoader.rf.Prim;
import helper.hotLoader.rf.Reflex;

public class Reflect {
	
	private String text;
	private char ch;
	
	public Reflect(String text, char ch) {
		super();
		this.text = text;
		this.ch = ch;
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Reflect.class.getCanonicalName());
		try {
			Reflex.class.getClassLoader().loadClass(Reflect.class.getCanonicalName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true){
			Reflex r = HotLoader.load4reflect(Reflect.class, new Object[]{"prueba", new Prim("c".charAt(0))});
			System.out.println(r.execute("print"));
			System.out.println();
			Thread.sleep(3000);
		}
	}
	
	public String print(){
		System.out.println("parametros pasados al contructor " + text +  " " + ch);
		System.out.println();
		System.out.println("texto a modificar");
		System.out.println();
		return "correcto";
		
	}

}
