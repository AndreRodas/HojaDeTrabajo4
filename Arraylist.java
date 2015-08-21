import java.util.ArrayList;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 20/08/2015
 * Hoja de Trabajo 4
 *
 */

/**
 * 
 * La clase Arraylist es una Pila.
 * Utiliza datos tipo Integer. Con esta clase se pretende utilizar
 * la clase ArrayList y Pila la cual tiene opciones predefinidas que harán
 * que se cree un Arraylist que tendrá la forma de una pila
 * por los métodos definidos para esta clase. Gracias a esta clase
 * se harán operaciones en notación Postfix en Calculadora si es 
 * seleccionada entre las opciones
 * 
 * @author André Rodas
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 * @param <Integer> para recibir datos numéricos
 */
public class Arraylist<E> extends Pila<Integer> {
	
	private ArrayList <Integer> arrayList;
	
	/**
	 * Este es el constructor de Arraylist y crea un nuevo arraylist
	 * de la Clase ArrayList
	 * Crea un Objeto:
	 * arrayList que será el nuevo ArrayList
	 * La inicializa y la vacía.
	 */
	public Arraylist() {
		this.arrayList = new ArrayList <Integer>();	
		arrayList.clear();
	}

	@Override
	public void empty() {
		arrayList.clear();		
	}

	@Override
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

	@Override
	public int size() {
		return arrayList.size();
	}
	
	@Override
	public Integer pop() throws Exception {
		if (arrayList.isEmpty())
			throw new Exception("Arraylist vacio!");
		else
			return arrayList.remove(arrayList.size()-1);
	}

	@Override
	public Integer peek() throws Exception {
		if (arrayList.isEmpty())
			throw new Exception("ArrayList vacio!");
		else
			return arrayList.get(arrayList.size()-1);
	}

	@Override
	public void push(Integer x) {
		arrayList.add(x);
	}

}