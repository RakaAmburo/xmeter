package helper.hotLoader.rf;

public class Zuper {
	
	private Object obj;
	private int index;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Zuper(Object obj) {
		super();
		this.obj = obj;
	}
	
	/**Por default index es 0 y hace referencia la clase padre del object
	 * 1 a la clase abuela etc.
	 * 
	 * @param obj
	 * @param index
	 */
	public Zuper(Object obj, int index) {
		super();
		this.obj = obj;
		this.index = index;
	}

}
