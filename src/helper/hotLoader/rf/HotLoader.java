package helper.hotLoader.rf;

import helper.propertiesLoader.PropertiesLoader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HotLoader {
	
	private static final String SEP = File.separator;
	private static final String POINT = ".";
	private static final String EXT = ".class";
	private static final String HEADER = "file:";
	private static final String CLASS_FOLDER = "bin";
	private static final String path = PropertiesLoader.getProperty("projectPath");
	
	private static final ClassLoader parentClassLoader = MyClassLoader.class.getClassLoader();
	
	/**Devuelve la clase recargada en el Obj StatReflex.
     * 
     * @param clazz (LaClaseARecargar.class)
     * @return Devuelve StatReflex para ejecutar metodos con reflection estaticamente.
     */
    public static StatReflex load4reflectStatic(Class<?> clazz){
		
		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
	    Class<?> myObjectClass = null;
	    String clazzName = replaceChar(clazz.getName(), POINT, SEP);
	    String file = HEADER + path + SEP + CLASS_FOLDER + SEP + clazzName + EXT;
	    
	    try {
			myObjectClass = classLoader.loadClass(clazz.getName(), file);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new StatReflex(myObjectClass);
		
	}
	
	/**Devuelve la instancia de una clase cuyo contructor necesita parametros.
     * 
     * @param clazz (LaClaseARecargar.class)
     * @param args (Arreglo de objetos Ej: new Object[]{"test", new Prim(1)}, 
     * en donde Prim lo uso para pasar los primitivos)
     * @return Devuelve instancia de LaClaseARecargar.class
     */
    public static Object load(Class<?> clazz, Object[] args){
		
		ArgsProc ap = new ArgsProc(args);
    	Class<?>[] ArgsClass = ap.getArgsClass();
		Object[] argChecked = ap.getArgChecked();
		
		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
	    Class<?> myObjectClass;
	    Object  object1 = null;
	    String clazzName = replaceChar(clazz.getName(), POINT, SEP);
	    String file = HEADER + path + SEP + CLASS_FOLDER + SEP + clazzName + EXT;
	    
	    
			try {
				myObjectClass = classLoader.loadClass(clazz.getName(), file);
				Constructor<?> constructor = myObjectClass.getConstructor(ArgsClass);
				object1 = constructor.newInstance(argChecked);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
		return object1;

	}
    
    /**Devuelve la instancia de una clase cuyo contructor necesita parametros envuelta en el objeto Reflex.
     * 
     * @param clazz (LaClaseARecargar.class)
     * @param args (Arreglo de objetos Ej: new Object[]{"test", new Prim(1)}, 
     * en donde Prim lo uso para pasar los primitivos)
     * @return Devuelve instancia de LaClaseARecargar.class en Reflex para ejecutar los metodos por reflection.
     */
    public static Reflex load4reflect(Class<?> clazz, Object[] args){
		
    	ArgsProc ap = new ArgsProc(args);
    	Class<?>[] ArgsClass = ap.getArgsClass();
		Object[] argChecked = ap.getArgChecked();
		
		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
	    Class<?> myObjectClass;
	    Object  object1 = null;
	    String clazzName = replaceChar(clazz.getName(), POINT, SEP);
	    String file = HEADER + path + SEP + CLASS_FOLDER + SEP + clazzName + EXT;
	    
	    
			try {
				myObjectClass = classLoader.loadClass(clazz.getName(), file);
				Constructor<?> constructor = myObjectClass.getConstructor(ArgsClass);
				object1 = constructor.newInstance(argChecked);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
		return new Reflex(object1);

	}
    
    /**Devuelve el objeto Reflex que envuelve la instancia de la clase clazz.
     * Con Reflex se pueden ejecutar los metodos de esta instancia por reflection.
     * 
     * @param clazz (LaClaseARecargar.class)
     * @return Devuelve instancia Objeto Reflector
     */
    public static Reflex load4reflect(Class<?> clazz){
		
		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
	    Class<?> myObjectClass;
	    Object  object1 = null;
	    String clazzName = replaceChar(clazz.getName(), POINT, SEP);
	    String file = HEADER + path + SEP + CLASS_FOLDER + SEP + clazzName + EXT;
	    //System.out.println(file);
	    
		try {
			myObjectClass = classLoader.loadClass(clazz.getName(), file);
			object1 = myObjectClass.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    		
		return new Reflex(object1);
		
	}
	
    
    /**Devuelve la instancia de una clase.
     * 
     * @param clazz (LaClaseARecargar.class)
     * @return Devuelve instancia de LaClaseARecargar.class
     */	
	public static Object load(Class<?> clazz){
		
		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
	    Class<?> myObjectClass;
	    Object  object1 = null;
	    String clazzName = replaceChar(clazz.getName(), POINT, SEP);
	    String file = HEADER + path + SEP + CLASS_FOLDER + SEP + clazzName + EXT;
	    	    
		try {
			myObjectClass = classLoader.loadClass(clazz.getName(), file);
			object1 = myObjectClass.getDeclaredConstructor().newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (InvocationTargetException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (NoSuchMethodException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (SecurityException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
	    
	    		
		return object1;
		
	}
	
	public static Object load(String clazzName){
      
      MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
      Class<?> myObjectClass;
      Object  object1 = null;
      String file = HEADER + path + SEP + CLASS_FOLDER + SEP + clazzName + EXT;
      String clazz = replaceChar(clazzName, SEP, POINT);
              
      try {
          myObjectClass = classLoader.loadClass(clazz, file);
          object1 = myObjectClass.newInstance();
          
      } catch (ClassNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }catch (InstantiationException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      } catch (IllegalAccessException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
      
              
      return object1;
      
  }
	
	private static String replaceChar(String string, String toRep, String replacement) {
		   String r = "";
		   char toRepChar = toRep.charAt(0);
		   char replacementChar = replacement.charAt(0);
		   for (int i = 0; i < string.length(); i ++) {
		      if (string.charAt(i) == toRepChar){
		    	  r += replacementChar;
		      }else {
		    	  r += string.charAt(i);
		      }
		    	  
		      }
		   return r;
		}

}
