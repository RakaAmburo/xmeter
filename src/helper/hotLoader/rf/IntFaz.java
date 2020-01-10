package helper.hotLoader.rf;

public class IntFaz {
	
	private Object obj;
	private int clazzIndex;
	private int intFazIndex;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	/**Por default clazzIndex y index es cero.
	 * clazzIndex 0 hace referencia al obj en si, 1 a la superclase de obj etc.
	 * intfazIndex 0 hace referencia a la primera interface del obj indicado por classInex 
	 * y intfazIndex 1 a la segunda interface etc. 
	 * 
	 * @param obj
	 * @param clazzIndex
	 * @param index
	 */
	public IntFaz(Object obj, int clazzIndex, int intfazIndex) {
		super();
		this.obj = obj;
		this.intFazIndex = intfazIndex;
		this.clazzIndex = clazzIndex;
	}

	public IntFaz(Object obj, int intFazIndex) {
		super();
		this.obj = obj;
		this.intFazIndex = intFazIndex;
	}
	
	public IntFaz(Object obj) {
		super();
		this.obj = obj;
	}

	public int getClazzIndex() {
		return clazzIndex;
	}

	public void setClazzIndex(int clazzIndex) {
		this.clazzIndex = clazzIndex;
	}

	public int getIntFazIndex() {
		return intFazIndex;
	}

	public void setIntFazIndex(int intFazIndex) {
		this.intFazIndex = intFazIndex;
	}

}
