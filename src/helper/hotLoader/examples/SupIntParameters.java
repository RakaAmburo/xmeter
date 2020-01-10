package helper.hotLoader.examples;

import helper.hotLoader.rf.HotLoader;
import helper.hotLoader.rf.IntFaz;
import helper.hotLoader.rf.Reflex;
import helper.hotLoader.rf.Zuper;
import helper.hotLoader.examples.auxiliar.InterUno;
import helper.hotLoader.examples.auxiliar.SuperTres;
import helper.hotLoader.examples.auxiliar.SuperUno;

public class SupIntParameters {
	
	public static void main(String[] args) {
		Reflex r = HotLoader.load4reflect(SupIntParameters.class);
		
		SuperUno s1 = new SuperTres();
		InterUno i1 = new SuperTres();
		
		//la clase 0 es el padre y es default
		//la interface 0 hace referencia a la primera interface implementada de la clase en cuestion
		r.execute("print", new Object[]{new Zuper(s1,1), new IntFaz(i1, 2, 2)});
	}
	
	
	
	
	public void print(SuperUno s1, InterUno i1){
		s1.print();
		i1.print();
	}
	
	
	

}
