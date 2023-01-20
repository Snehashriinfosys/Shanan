package Collections;

import java.util.LinkedList;

public class Linked_list {
public static void main(String[] args) {
	LinkedList l= new LinkedList();
	l.add("Sneha");
	l.add(200);
	l.add('B');
	l.add("Aru");
	l.add(null);
	l.add(null);
	
	//print all data
	System.out.println(l);
	//size
	System.out.println(l.size());
	//isEmpty
	System.out.println(l.isEmpty());
	//contains
	System.out.println(l.contains("Aru"));
	//get the data
	System.out.println(l.get(3));
	//insertion(right shift operator)
	l.add(2,'S');
	System.out.println(l);
	//left shift operator
	l.remove(2);
	System.out.println(l);
	
}
}
