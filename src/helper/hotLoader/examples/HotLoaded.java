package helper.hotLoader.examples;

import helper.hotLoader.examples.auxiliar.Padre;
import helper.hotLoader.rf.HotLoader;

public class HotLoaded extends Padre {
	
	public static void main(String[] args) throws InterruptedException {
	  while(true)	{
		  Padre p = (Padre)HotLoader.load(HotLoaded.class);
		  p.print();
		  
		  Thread.sleep(3000);
	  }
	}
	
	
	public void print(){
		System.out.println("soy el hijito");
	}
	

}


