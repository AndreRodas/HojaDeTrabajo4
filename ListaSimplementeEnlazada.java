// Universidad del Valle de Guatemala
// Algoritmos y Estructura de Datos, Seccion 10
// 8/11/2015
// Autores: Andre Rodas y Samuel Diaz 


public class ListaSimplementeEnlazada<E> extends Lista<E>{
	
	int list_size;
	Nodo<E> head; 
	
	
	public ListaSimplementeEnlazada() {
		list_size = 0;
		head = null;
	}

	public void addFirst(E v) {
		head = new Nodo<E>(v) ;
		list_size++;
	}
	
	public E getFirst() {
		return head.getvalue();
	}
	
	public int size() {
		return list_size;
	}
	
	public E removeFirst() {
		Nodo <E> temporal = head;
		head = head.getnext();
		list_size--;
		return temporal.getvalue();
	}
	
	public E removeLast() {
		Nodo <E> finger = head;
		Nodo <E> previous = null;
		while (finger.getnext() != null) { 
			previous = finger;
			finger = finger.getnext();
		}
		if (previous == null) 
			head = null; 
		else
			previous.setnext(null);
		list_size--;
		return finger.getvalue();
	}
	
	public void addLast(E v) {
		Nodo <E> temporal = new Nodo <E> (v);
		if (head!=null) {
			Nodo<E> finger = head;
			while (finger.getnext() != null) 
				finger = finger.getnext();
			finger.setnext(temporal);
		}
		else 
			head = temporal;
		list_size ++;
	}
	
	public E getLast() {
		Nodo <E> finger = head;
		Nodo <E> previous = null;
		while (finger.getnext() != null) { 
			previous = finger;
			finger = finger.getnext();
		}
		return previous.getvalue();
	}
	
	public boolean contains(E v) {
		Nodo <E> finger = head;
		while (finger != null && !finger.getvalue().equals(v))
			finger = finger.getnext();
		return finger != null;
	}

	@Override
	public void empty() {
		head = null;
		list_size = 0;		
	}

	@Override
	public boolean isEmpty() {
		if (list_size>0)
			return false;
		else
			return true;
	}

	@Override
	public void push(E x) {
		Nodo<E> temp1 = head;
		head = new Nodo<E>(x) ;
		head.setnext(temp1);
		list_size++;
	}

	@Override
	public E pop() throws Exception {
		Nodo <E> temp = head;
		if((head != null) && (head.getnext() != null)) {
			head = head.getnext();
		}else{
			head = null;
		}
		list_size--;
		return temp.getvalue();	
	}
	@Override
	public E peek() throws Exception {
		return head.getvalue();
	}
	
}
