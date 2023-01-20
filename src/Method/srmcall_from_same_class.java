package Method;

public class srmcall_from_same_class {
public static void main(String[] args) {
	m1();
	m2();
	m3();
}
public static void m1(){
	System.out.println("method call from m1");
	System.out.println("method calling" );
}
	public static void m2() {
		System.out.println("im calling method m2");
	}
	public static void m3() {
		System.out.println("im calling method m3");
	}

}
