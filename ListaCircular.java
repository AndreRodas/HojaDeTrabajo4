// Universidad del Valle de Guatemala
// Algoritmos y Estructura de Datos, Seccion 10
// 8/20/2015
// Autores: Andre Rodas y Samuel Diaz 


public class ListaCircular<E> extends Lista<E>{
	
	Nodo<E> tail;
	int list_size;
	
	public ListaCircular(){
		tail = null;
		list_size = 0;
	}
	
	public int size() {
		return list_size;
	}
	
	public void addLast(E v) {
		Nodo<E> finger;
		finger = tail;
		for(int i=0; i==list_size; i++)
			if(finger.getnext()!=null)
				finger=finger.getnext();
		Nodo<E> temp=new Nodo<E>(v); 
		finger.setnext(temp);
		temp.setnext(tail);
	}
	
	public void addFirst(E v) {
		Nodo<E> temp = new Nodo<E>(v);
		if (tail != null) {
			temp.setnext(tail.getnext());
			tail.setnext(temp);
		}
		else {
			tail = temp;
			tail.setnext(tail);
		}
		list_size++;
	}
	
	public E getLast() {
		Nodo<E> pointer = tail;
		while (pointer.getnext()!= tail)
			pointer = pointer.getnext();
		return (E) pointer;
	}
	
	public E removeFirst() {
		Nodo<E> temporal1;
		Nodo<E> temporal2;
		temporal2 = tail.getnext();
		temporal1 =  tail.getnext().getnext();
		tail.setnext(temporal1);
		return (E) temporal2;
	}
	
	public E removeLast() {
		Nodo<E> pointer = tail;
		while (pointer.getnext()!= tail)
			pointer = pointer.getnext();
		Nodo<E> temp = tail;
		if (pointer == tail)
			tail = null;
		else {
			pointer.setnext(tail.getnext());
			tail = pointer;
		}
		list_size--;
		return (E) temp;
	}
	
	public E getFirst() {
		if (list_size!=0)
			return (E) tail.getnext();
		else
			return null;
	}
		
	public boolean contains(E v) {
		Nodo<E> temp = tail;
		int cont = 0;
		while (cont < list_size) {
			if (temp == v)
				return true; 
			cont++;
		}
		return false;
	}

	@Override
	public void empty() {
		list_size = 0;
		tail = null;
		
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
		Nodo<E> temp = new Nodo<E>(x);
		if (tail == null) {
			tail = temp;
			tail.setnext(tail);
		}
		else {
			temp.setnext(tail.getnext());
			tail.setnext(temp);
		}
		list_size++;
		
	}

	@Override
	public E pop() throws Exception {
		Nodo<E> temp1;
		Nodo<E> temp2;
		temp2 = tail.getnext();
		temp1 = tail.getnext().getnext();
		tail.setnext(temp1);
		return (E) temp2.getvalue();
	}

	@Override
	public E peek() throws Exception {
		if (list_size>0)
			return (E) tail.getnext().getvalue();
		else
			return null;
	}
}