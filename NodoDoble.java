// Universidad del Valle de Guatemala
// Algoritmos y Estructura de Datos, Seccion 10
// 8/11/2015
// Autores: Andre Rodas y Samuel Diaz 


public class NodoDoble<E> extends Nodo<E> {

	NodoDoble<E> previous;
	
	public NodoDoble(E v) {
		super(v);
	}
	
	public NodoDoble<E> getprevious() {
		return previous;
	}
	
	public void setprevious(NodoDoble<E> previous) {
		this.previous=previous;
	}

}