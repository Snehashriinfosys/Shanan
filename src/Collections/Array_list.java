package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.apache.commons.collections4.iterators.ArrayListIterator;

public class Array_list {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("Ashvini");
	al.add(100);
	al.add('A');
	al.add(null);
	al.add(null);
	al.add("daksh");
	al.add(null);
	
	
	//I need to print entire data inside the collection 
	System.out.println(al);
	//check the size 
	System.out.println(al.size());
	//check whether it is empty
	System.out.println(al.isEmpty());
	//contains or not
	System.out.println(al.contains(100));
	//get the data of particular index
	System.out.println(al.get(2));
	//insertion right shift operator
	al.add(2,500);
	System.out.println(al.get(2));
	//print entire data
	System.out.println(al);
	//remove the data(left shift operator)
	al.remove(1);
	System.out.println(al);
	
	//System.out.println("print the data in the arralist using list iterator");
	
	//ListIterator litr =new ListIterator();
	
	//Iterator itr = litr.iterator();
	
	//while (litr.hasNext()){
		//System.out.println(litr.next());
	}
	
}
	
//}

