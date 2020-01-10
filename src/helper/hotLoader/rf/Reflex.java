package helper.hotLoader.rf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflex {
	
	private Object obj1;

	public Reflex(Object obj1) {
		super();
		this.obj1 = obj1;
	}
	
    
    /**
     * @param methodName (Nombre del metodo a ejecutar dinamicamente)
     * @param (Arreglo de objetos Ej: new Object[]{"test", new Prim(1)}, 
     * en donde Prim lo uso para pasar los primitivos)
     * @return Devuelve objeto resultado de la ejecucion del metodo (Si la firma no devuelve nada return es null).
     */
    public Object execute(String methodName, Object[] args){
		
    	ArgsProc ap = new ArgsProc(args);
    	Class<?>[] ArgsClass = ap.getArgsClass();
		Object[] argChecked = ap.getArgChecked();
		
		Method method;
		Object ob1 = null;
		try {
			method = obj1.getClass().getDeclaredMethod (methodName, ArgsClass);
			if (!method.isAccessible()){
				method.setAccessible(Boolean.TRUE);
			}
			ob1 = method.invoke (obj1, argChecked);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		return ob1;
		
	}
	
     /**
     * @param methodName (Nombre del metodo a ejecutar dinamicamente)
     * @return Devuelve objeto resultado de la ejecucion del metodo (Si la firma no devuelve nada return es null).
     */
    public Object execute(String methodName){
		
		Method method;
		Object ob1 = null;
		Class<?>[] nullClz = null;
		Object[] nullObj = null;
		try {
			method = obj1.getClass().getMethod (methodName, nullClz);
			if (!method.isAccessible()){
				method.setAccessible(Boolean.TRUE);
			}
			ob1 = method.invoke (obj1, nullObj);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		return ob1;
		
	}


}
