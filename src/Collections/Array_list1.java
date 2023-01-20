package Collections;

import java.util.ArrayList;

public class Array_list1 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("Swara");
	al.add(100);
	al.add('B');
	al.add(null);
	al.add(null);
	al.add("Daksh");
	al.add(null);
	
	//i need to print entire data inside the collection
	System.out.println(al);
	//check the size
	System.out.println(al.size());
	//check whether it is empty
	System.out.println(al.isEmpty());
	//contain or not
	System.out.println(al.contains(100));
	//get the data of particular index
	System.out.println(al.get(1));
	//insertion(right shift operator)
	al.add(1,500);
	System.out.println(al.get(1));
	//print entire data
	System.out.println(al);
	//remove the data(left shift operator)
	al.remove(1);
	System.out.println(al);
	System.out.println();
}
}
