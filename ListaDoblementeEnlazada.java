// Universidad del Valle de Guatemala
// Algoritmos y Estructura de Datos, Seccion 10
// 8/11/2015
// Autores: Andre Rodas y Samuel Diaz 


public class ListaDoblementeEnlazada <E> extends Lista<E> {

	NodoDoble <E> head = null;
	NodoDoble <E> tail = null;
	int list_size;
	
	
	public ListaDoblementeEnlazada() {
		list_size = 0;
	}
	
	public int size() {
		return list_size;
	}
	
	public void addFirst(E v) { 
		head = new NodoDoble<E>(v) ;
		if (tail == null)
			tail = head; 
		list_size++;
	}
	
	public E removeFirst() {
		if (this.size()>0){
			NodoDoble<E> temporal1 = (NodoDoble<E>) head.getnext();
			NodoDoble<E> temporal2 = (NodoDoble<E>) head;
			head = temporal1;
			return (E) temporal2;
		}
		return null;
	}
	
	public E getFirst() {
		return head.getvalue();
	}
	
	public void addLast(E v) { 
		tail = new NodoDoble <E>(v);
		list_size++;
	}
	
	public E removeLast() {
		NodoDoble<E> temp1 = tail;
		tail = tail.getprevious();
		if (tail == null)
			head = null;
		else
			tail.setnext(null);
		list_size--;
		return temp1.getvalue();		
	}
	
	public E getLast() {
		return tail.getvalue();
	}
	
	public boolean contains(E v) { 
		NodoDoble<E> temporal = head;
		int cont = 0;
		while (cont <= this.size() ){
			if ( temporal.getvalue() == v)
				return true;
			else
				temporal = (NodoDoble<E>) temporal.getnext();
			cont++;
		}
		return false;
	}

	@Override
	public void empty() {
		list_size = 0;
		head = null;		
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
		if (head == null)
			head = new NodoDoble<E>(x) ;
		else {
			tail=head;
			head= new NodoDoble<E>(x) ;
			head.setnext(tail);
			tail.setprevious(head);
		}
		list_size++;		
	}

	@Override
	public E pop() throws Exception {
		if (head!=null && list_size>0) {
			NodoDoble<E> temp1;
			temp1 = head;
			head.setnext(null);
			head = tail;
			head.setprevious(null);
			if(head.getnext()!=null) {
				tail = (NodoDoble<E>) head.getnext();
			}
			list_size--;
			return (E) temp1.getvalue();
		}
		list_size--;
		return null;
	}

	@Override
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		return head.getvalue();
	}
}