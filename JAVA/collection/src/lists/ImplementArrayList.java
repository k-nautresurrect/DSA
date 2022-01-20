package lists;

import java.util.ArrayList;
import java.util.Iterator;

import io.IO;

public class ImplementArrayList extends IO {

	public static void main(String[] args) {
		
		ArrayList hetrolist = new ArrayList();
		hetrolist.add("string");
		hetrolist.add(2);
		hetrolist.add(true);
		hetrolist.add(9.8);
		
		out.println(hetrolist);  // [string, 2, true, 9.8]
		
		// not applicable for different types.
		/* out.println(hetrolist.sort()); */ 
		
		ArrayList<Integer> homolist = new ArrayList<Integer>();
		homolist.add(1);
		homolist.add(7);
		homolist.add(6);
		homolist.add(0);
		/*
		 * homolist.add("string2");
		 * it is now not applicable for the arguments (string) 
		 * only applicable for integer objects  
		 */		
		out.println(homolist);
		homolist.sort(null); // to pass an comparotor is important if not any pass null
		out.println(homolist);
		
		
		// traversing the array list 
		
		for(int itr: homolist) {
			out.print(itr+ " ");		
		}
		out.println();
		
		for(int i = 0; i<homolist.size(); i++) {
			out.print(homolist.get(i));
		}
		out.println();
		
		// traversing using iterator
		
		
		Iterator<Integer> it = homolist.iterator();
		
		// new feature in java 
		var itr = homolist.iterator();
		out.println(it);

		while(itr.hasNext()) {
			out.print(itr.next()+ " ");  // 0 1 6 7
		}
		out.println();
		
		while(it.hasNext()) {
			out.print(it.next()+ " ");
			/*
			 * cannot converted from Iterator<Integer> to int,
			 * as iterator is an Interface
			 *  it++;
			 * 
			 */  
			// prints the iterator which has refrence to only
			// first element in the arraylist
			/* out.println("->" + it); */  		
		}	
		
		// initializing the arraylist 
		var n  = in.nextInt();
		var list = new ArrayList<Integer>(n);
		
		// will give only the number of elements in the arraylist
		out.println(list.size());
		// we can ensure minimum capacity of the array list by
		/* 
		 * cannot print void types in any stream
		 * 		out.println(list.ensureCapacity(n)); 
		 * the upper line will throw exception
		 * */
		list.ensureCapacity(n);
		out.println(list.size()); // remains 0
		out.println(list); // empty list -> []
		
		for(int i =0; i<n;i++) {
			list.add(1);
		}
		
		out.print(list.size()); // now it will give 5, after adding elements
		out.println(list); // [...elements]
		
		for(int i: list) {
			/*
			 * cannot set null for an integer class list
			 * list.set(i, null);
			 * */
			list.set(i, 4); // [1, 4, 1, 1, 4]
			// first set index 1 to 4 then read that 4 and set it to 4.
		}
		out.println(list);
	}
}
