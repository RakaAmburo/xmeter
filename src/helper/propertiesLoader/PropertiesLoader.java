package helper.propertiesLoader;

import java.io.IOException;
import java.io.InputStream;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import org.apache.log4j.Logger;
//import com.inetpsa.batch.constants.GralConstants;

/**
 * Cargador de propiedades => singleton | lazy | thread safe | not synchronized
 * 
 * @author Pablo Paparini
 *
 */
public class PropertiesLoader {
	
	private static Properties PROPS;
	private static String[] PROPS_FILE_NAMES = {"/setUp.properties"};
	//private static final String WIN_SPACE = "%20";
	//private static final String SPACE = " ";
	private static final String SPECIAL_CHARS  = ".?+&:{}[]()^$";
	private static final String ESCAPE_CHARS = "\\";
	private static final String STRING_VACIO = "";
	
	private static final Pattern escapeVarEncaps = Pattern.compile("([${}])");
    private static final Pattern variableCon$ = Pattern.compile("(\\$\\{\\w+\\})");
    
    //public static Logger log = Logger.getLogger(PropertiesLoader.class);
        
	
	private static String parseProp(String propValue){
		
		Matcher vCon$ = variableCon$.matcher(propValue);
	   
	    while (vCon$.find()) {
	    	String newVarKey = escapeVarEncaps.matcher(vCon$.group(1)).replaceAll(STRING_VACIO);
	    	String newVarValue = PropertiesLoader.getProperty(newVarKey);
	    	
	    	propValue = propValue.replaceAll(escapeRegExpChars(vCon$.group(1)), escapeRegExpChars(parseProp(newVarValue)));
		}
		
		return propValue;
		
		 
	}
	
	protected PropertiesLoader()  {
		//if (PROPS_FILE_NAMES == null)
			//throw new Exception("Declare properties files");
		//System.out.println("Se cargo una instancia");
		System.err.println("INSTANCIAMOS");
		PROPS = new Properties();
		for (int i = 0; i < PROPS_FILE_NAMES.length; i++) {
			InputStream in =  getClass().getResourceAsStream(PROPS_FILE_NAMES[i]);
			try {
				PROPS.load(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	private static String escapeRegExpChars(String aRegexFragment){
	    StringBuffer result = new StringBuffer();
	    StringCharacterIterator iterator = new StringCharacterIterator(aRegexFragment);
	    char character =  iterator.current();
	    
	    while (character != CharacterIterator.DONE ){
	      /*
	      * All literals need to have backslashes doubled.
	      */
	      if (SPECIAL_CHARS.indexOf(String.valueOf(character)) > -1) {
	    	  result.append(ESCAPE_CHARS+character);
	      }
	      else {
	        //the char is not a special one
	        //add it to the result as is
	        result.append(character);
	      }
	      character = iterator.next();
	    }
	    return result.toString();
	  }
	
		
	/**
	 * Clase que contiene al unica instancia del singleton y se carga
	 * por unica vez cuando se hace referencia a INSTANCE.
	 * @author Pablo Paparini
	 *
	 */
	private static class SingletonHolder { 
	    
		public static final PropertiesLoader INSTANCE = new PropertiesLoader();
					     
	}

	
	private static Properties getProps() {

		if (PROPS == null) {
			SingletonHolder.INSTANCE.getClass();
		}

		return PROPS;

	}
	
	public static String getProperty(String prop){
		
		return parseProp(getProps().getProperty(prop));
		
	}
	
    public static void setProperty(String prop, String value){
		
		getProps().setProperty(prop,value);
		
	}

}
