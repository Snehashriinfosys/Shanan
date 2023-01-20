package Set;

import java.util.HashSet;

public class HashSet_class {
public static void main(String[] args) {
	HashSet hs = new HashSet ();
	
	hs.add("Sangita");
	hs.add('A');
	hs.add(200);
	hs.add(null);
	hs.add(null);
	hs.add("Sangita");
	System.out.println(hs);
	
	//isEmpty
	System.out.println(hs.isEmpty());
	
	//size
	System.out.println(hs.size());
	
	
}
}
