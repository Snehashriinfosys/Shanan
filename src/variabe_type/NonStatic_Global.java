package variabe_type;

public class NonStatic_Global {
static int i =10;//static
int j =30; //non static 
public static void main(String[] args) {
	
	NonStatic_Global g =new NonStatic_Global();
	System.out.println(i);
	System.out.println(g.j);
}
}
