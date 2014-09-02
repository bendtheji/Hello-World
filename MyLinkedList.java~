
import java.util.*;

class ListNode <E> {

	private E element;
	private ListNode<E> next;

	public ListNode(E e){

		this(e,null);
	}

	public ListNode(E e,ListNode<E> n){

		this.element = e;
		this.next = n;
	}

	public ListNode<E> getNext(){

		return next;
	}

	public E getElement(){

		return element;
	}

	public void setNext(ListNode<E> next){

		this.next = next;
	}

}

class MyLinkedList<E>{

	private ListNode<E> head = null;
	private int numNodes = 0;

	public boolean isEmpty(){

		if(numNodes == 0)
			return true;

		return false;
	}

	public int size(){

		return numNodes;
	}

	public E getFirst() throws NoSuchElementException{

		if(head==null)
			throw new NoSuchElementException("List is Empty");

		else	
			return head.getElement();
	}

	public boolean contains(E item){

		for(ListNode <E> curr = head;curr != null;curr = curr.getNext()){
			if(curr.getElement().equals(item))
				return true;
		}
		return false;
	}	

	public void addFirst(E item){

		head = new ListNode <E> (item,head);
		numNodes++;
	}

	public E removeFirst() throws NoSuchElementException{

		if(head == null)
			throw new NoSuchElementException("Nothing to remove!");

		else{
			ListNode<E> first = head;
			head = head.getNext();
			numNodes--;
			return first.getElement();
		}
	}



	public String toString(){

		String list = new String();
		list = list + "[";


		for(ListNode<E> curr = head;curr != null;curr = curr.getNext()){

			list = list + curr.getElement();			

			if(curr.getNext() != null){
				list = list + ", ";
			}

		}

		list = list + "]";

		return list;
	}

	public void reverse(){

		ListNode<E> previous = null;
		ListNode<E> curr = head;
		ListNode<E> next;

		while(curr != null){

			next = curr.getNext();
			curr.setNext(previous);
			previous = curr;
			curr = next;
		}

		head = previous;
	}

}
