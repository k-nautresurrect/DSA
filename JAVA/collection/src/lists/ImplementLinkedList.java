package lists;

import java.util.LinkedList;

import io.IO;

public class ImplementLinkedList extends IO{

	public static void main(String[] args) {
		
		// Implementing Linked List
		LinkedList hetro = new LinkedList();
		LinkedList<Integer> homo = new LinkedList<Integer>();
		var list = new LinkedList<Integer>();
		
		hetro.add(homo);
		hetro.add(list);
		hetro.add("String");
		hetro.add(10);
		
		out.println(hetro); // here the list and homo is empty
		
		for(int i = 0;i<10;i++) {
			homo.add(i);
		}
		
		// we cannot reserve capacity 
		//as copy of elements don't take place in linkedlist.
		
		for(int i = 1; i<=10;i++) {
			list.add(i);
		}
		out.println(hetro); // here as the list and homo is not empty
		out.println(list);
		
		homo.addLast(0);
		homo.addFirst(10);
		homo.sort(null);
		var it  = homo.descendingIterator();
		var itf = homo.iterator();
		// the hashcode adresses in the LinkedList
		out.println(it.hashCode());
		out.println(itf.hashCode());
		while(it.hasNext()) {
			out.println(it.next()); // reverse print the linkedlist
		}
		out.println(list);
		list.addAll(homo);
		out.println(list.contains(homo.peek())); // as it accept only object not collection
		if(list.contains(homo.peek())) {
			/* list.removeAll(homo); */ // it will remove all the repeated numbers from the list
		}
		var i  = list.listIterator(0);
		out.println(list.size());
		var ifi = list.listIterator(list.size() - 1);
		
		out.println(i + " " + ifi );
		out.println(list);
		out.println(homo);
		
	}

}
