import java.util.Vector;
/**
 * @author Diego Soler, Gladys de la Roca, Rene Olivet
 * Clase Pila
 * Clase que maneja la pila
 * @version 24/07/2016
 */
public class Pila<E> implements I_Pila<E> {
	private Vector<E> miPila;

	public Pila(){
		miPila = new Vector<E>();
	}
	@Override
	public void Push(E element) {
		miPila.addElement(element);
	}

	@Override
	public E Pop() {
		E x=(E) miPila.lastElement();
		miPila.remove(miPila.lastElement());
		return x;
	}

	@Override
	public boolean IsEmpty() {
		if (miPila.size()==0)
		return true;
		else
			return false;
	}

	@Override
	public int Size() {
		return miPila.size();
	}

	@Override
	public E Get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
