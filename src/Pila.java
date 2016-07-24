import java.util.Vector;

public class Pila implements I_Pila {
	private Vector Pila;

	public Pila(){
		Pila = new Vector();
	}
	@Override
	public void push(Object element) {
		Pila.addElement(element);
	}

	@Override
	public Object pop() {
		return null;
	}

	@Override
	public boolean IsEmpty() {
		if (Pila.size()==0)
		return true;
		else
			return false;
	}

	@Override
	public int Size() {
		
		return Pila.size();
	}

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
