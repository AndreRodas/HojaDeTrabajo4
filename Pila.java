/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * @author Diego Morales. Carné: 14012
 * @author Diego Sosa. Carné: 14735
 * @author Julio González. Carné: 14096
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */


/**
 * Esta es la clase abstracta Pila basada en ADTstack creada por los propios alumnos para
 * utilizarlo en toda la sección. Con esta CLASE se busca implementar una
 * pila y realizar las funciones principales: push y pop de datos. 
 * Esta clase puede recibir cualquier tipo de datos numéricos (E)
 * ya que por ahora interesa relizar operaciones numéricas básicas.
 * 
 * Además utiliza los siguientes métodos:
 * empty: vaciar pila
 * isEmptiy: verifica si está vacía
 * push: guarda datos
 * pop: saca datos
 * size: tamaño de la pila
 * peek: obtener el valor más alto de la pila
 *
 * @param <E> para utilizar cualquier tipo de dato
 */
public abstract class Pila<E> {
	/**
	 * Este método es el encargado de vaciar la pila. 
	 * Con este método se pueden elminar todos los elementos
	 * de la pila sin importar el orden en que hayan entrado.
	 * Simplemente borra todos los datos.
	 */
	public abstract void empty();
	
	/**
	 * Con este método se puede verificar excusivametne si la pila está vacía.
	 *  
	 * @return true únicamente si la pila no tiene ningún elmento
	 * 		   false de manera opuesta
	 */
	public abstract boolean isEmpty();
	
	/**
	 * Este método permite agregar un elemento a la pila.
	 * Se realiza la operación agergando el parámetro <x> directamente 
	 * al final del vector que contiene los datos. No puede ingresarse 
	 * el valor en otra posicion
	 * 
	 * @param x es el elemento que será agregado al final de la pila
	 */
	public abstract void push(E x) ;
	
	/**
	 * Este métdo permite recuperar el último elemento ingresado a la pila.
	 * Toma el último elemento del vector, toma el valor o el dato y lo
	 * remueve de la pila para ser utilizado como sea requerido.
	 * 
	 * @return El último valor de la pila, además de removerlo de dicha pila.
	 * @throws Exception errores en ejecución cuando se llama al método
	 * 		   			 Retorna un error si la pila está vacía
	 */
	public abstract E pop() throws Exception;
	
	/**
	 * Con este método se puede saber la cantidad de componentes que tiene la pila luego de
	 * estarle agretando elementos.
	 * @return el tamaño de la pila. Este tamaño será el número de elementos que tiene la pila.
	 */
	public abstract int size();
	
	/**
	 * Con este método se puede obtener el último componente de la pila sin sacarlo de dicha pila. 
	 * Se diferencia del método pop porque dicho método saca el valor de la pila. Con este método
	 * el elemento se mantiene dentro de la pila.
	 * 
	 * @return Retorna el último componente de la pila. Esta opción no quita el elemento de
	 * 				   la pila como lo hace el pop sino solo se obtiene dicho componente:
	 * 				   el dato, el valor que tiene, etc. 
	 * 
	 * @throws Exception errores en ejecución cuando se llama al método
	 * 		   			 Retorna un error si la pila está vacía
	 */
	public abstract E peek() throws Exception;
	
}