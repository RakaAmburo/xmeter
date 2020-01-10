package helper.hotLoader.rf;

public class Prim {
	
	private Class<?> clazz;
	private Object obj;
	
	public Object getObject(){
		
		return obj;
	
	}
		
	public Prim(byte b) {
		super();
		clazz = byte.class;
		obj = new Byte(b);
	}
	
	public Prim(short s) {
		super();
		clazz = short.class;
		obj = new Short(s);
	}
	
	public Prim(int i) {
		super();
		clazz = int.class;
		obj = new Integer(i);
	}
	
	public Prim(long l) {
		super();
		clazz = long.class;
		obj = new Long(l);
	}
	
	public Prim(float f) {
		super();
		clazz = float.class;
		obj = new Float(f);
	}
	
	public Prim(double d) {
		super();
		clazz = double.class;
		obj = new Double(d);
	}
	
	public Prim(boolean bol) {
		super();
		clazz = boolean.class;
		obj = new Boolean(bol);
	}
	
	public Prim(char c) {
		super();
		clazz = char.class;
		obj = new Character(c);
	}

	public Class<?> getClazz() {
		return clazz;
	}

}
