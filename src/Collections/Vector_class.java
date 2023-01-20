package Collections;

import java.util.Vector;

public class Vector_class {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Adhira");
		v.add(200);
		v.add('C');
		v.add(null);
		v.add(null);
		//check the capacity
		System.out.println(v.capacity());
		//print all data
		System.out.println(v);
		//size
		System.out.println(v.size());
		//isEmpty
		System.out.println(v.isEmpty());
		//contains
		System.out.println(v.contains(100));
		//get the particular data
		System.out.println(v.get(0));
		//right shift
		v.add(1,"Sneha");
		System.out.println(v);
		//left remove shift
		v.remove(1);
		System.out.println(v);
		
		
		
		
		
		
		
	}

}
