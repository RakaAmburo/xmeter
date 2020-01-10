package helper.hotLoader.rf;

public class ArgsProc {
	
	@SuppressWarnings("rawtypes")
	private Class[] ArgsClass;
	private Object[] argChecked;

	@SuppressWarnings("rawtypes")
	public ArgsProc(Object[] args) {
				
		ArgsClass = new Class[args.length];
		argChecked = new Object[args.length];
		for (int i = 0; i < args.length; i++) {
			if (args[i].getClass() == Prim.class){
				ArgsClass[i] = ((Prim)args[i]).getClazz();
				argChecked[i] = ((Prim)args[i]).getObject();
			}else if(args[i].getClass() == IntFaz.class){
				IntFaz iz = (IntFaz)args[i];
				Class cl = iz.getObj().getClass();
				for (int j = 0; j < iz.getClazzIndex(); j++) {
					cl = cl.getSuperclass();
				}
				ArgsClass[i] = cl.getInterfaces()[iz.getIntFazIndex()];
				argChecked[i] = iz.getObj();
			}else if(args[i].getClass() == Zuper.class){
				Zuper zup = (Zuper)args[i];
				Class cl = zup.getObj().getClass().getSuperclass();
				for (int j = 0; j < zup.getIndex(); j++) {
					cl = cl.getSuperclass();
				}
				ArgsClass[i] = cl;
				argChecked[i] = zup.getObj();
			}else {
				ArgsClass[i] = args[i].getClass();
				argChecked[i] = args[i];
			}
			
		}
		
	}

	@SuppressWarnings("rawtypes")
	public Class[] getArgsClass() {
		return ArgsClass;
	}

	public Object[] getArgChecked() {
		return argChecked;
	}

}
