// Universidad del Valle de Guatemala
// Algoritmos y Estructura de Datos, Seccion 10
// 8/11/2015
// Autores: Andre Rodas y Samuel Diaz 


public class Nodo<E> {

	E value;
	Nodo<E> next;
	
	public Nodo(E v) {
		value = v;
	}

	public void setvalue(E v){
		value=v;
	}
	
	public E getvalue(){
		return this.value;
	}
	
	public void setnext(Nodo<E> n){
		next=n;
	}
	
	public Nodo<E> getnext(){
		return next;
	}
	
}
