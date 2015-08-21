/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 20/08/2015
 * Hoja de Trabajo 4
 *
 */

/**
 * Esta es la clase lista que hace referenca a que es una Pila. 
 * Con esta clase se busca soloamente utilizar algunos métodos
 * que están incluidos en la pila, dejando a un lado push y pop.
 * El objetivo de realizar esta clase abstracta es que habrá una
 * lista simplemente enlazada, doblemente enlazada y una ciruclar 
 * que luego el programa deberá selecionar para saber cual utilizar.
 *
 * @param <E>
 */
public abstract class Lista<E> extends Pila<E>{
	
	protected int cont=0;
	
	/**
	 * Con este método se puede remover el úlimo elemento 
	 * de la lista y eliminarlo. Luego el puntero apuntará 
	 * al elemento inmediatamente anterior al eliminado
	 * @return el último elemento de la lsita
	 */
	public abstract E removeLast();
	
	/**
	 * Con este método se agregará un elemento al final de la
	 * lista. El puntero de cola apuntará a este elemento si es
	 * requerido por el tipo de lista
	 * 
	 * @param value elemento agregado al final de la lista
	 */
	public abstract void addLast(E value);
	
	/**Este método peromite obetener el ultimo valor de una lista sin
	 * necesidad de ser removido de dicha lista.
	 * 
	 * @return el ultimo valor
	 */
	public abstract E getLast();
	
	
	/**
	 * Este método realiza un recorrido por la lista para verificar si
	 * cierto valor está contenido dentro de la lista.
	 * @param value el valor que se quiere verificar dentro de la lista
	 * @return true si lo contiene
	 */
	public abstract boolean contains(E value);

}