package Nonsrmcf_same_class;

public class sample {
public static void main(String[] args) {
	System.out.println("main method open ");
	sample s = new sample ();
	s.m4();
	s.m5();
	
	System.out.println("main method close");
	
	
}
public void m4() {
	System.out.println("i'm from m1 non static regular method ");
	System.out.println("hello world");
}
public void m5() {
	System.out.println("i'm from m2 non static regular method");
	System.out.println("method implementaton");
	//in this non static regular method call from differenr class 1st we have to  create object 
	//within a class.we do nothave to create two class
	
}
}
