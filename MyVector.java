/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 20/08/2015
 * Hoja de Trabajo 4
 *
 */


import java.util.Vector;

/**
 * 
 * La clase MVector y es una Pila.
 * Utiliza datos tipo Integer. Con esta clase se pretende utilizar
 * la clase Vector y Pila la cual tiene opciones predefinidas que harán
 * que se cree un vector de datos que tendrá la forma de una pila
 * por los métodos definidos para esta clase. Gracias a esta clase
 * se harán operaciones en notación Postfix en Calculadora si es 
 * seleccionada entre las opciones
 *
 * 
 * @author André Rodas
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 * @param <Integer> para recibir datos numéricos
 */
public class MyVector <Integer> extends Pila<Integer> {
	
	private Vector <Integer> vector;
	
	/**
	 * Este es el constructor de MVector y crea un nuevo vector
	 * de la Clase Vector 
	 * Crea un Objeto:
	 * vector que será el nuevo vector
	 * Lo inicializa y la vacía.
	 */
	
	public MyVector() {
		this.vector = new Vector <Integer>();	
		vector.clear();
	}

	public void empty() {
		vector.clear();		
	}


	public boolean isEmpty() {
		return vector.isEmpty();
	}

	public int size() {
		return vector.size();
	}
	
	public Integer pop() throws Exception {
		if (vector.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return vector.remove(vector.size()-1);
	}

	public Integer peek() throws Exception {
		if (vector.isEmpty())
			throw new Exception("Vector vacio!");
		else
			return vector.lastElement();
	}

	public void push(Integer x) {
		vector.add(x);
	}

}