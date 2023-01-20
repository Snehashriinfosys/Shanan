package Final;

public class Final_keyword {
static int a = 10;
int b = 20;
public static void main(String[] args) {
	//object create
	Final_keyword ref = new Final_keyword();
	System.out.println(ref);//it will print address of object
	//object 2
	Final_keyword ref1 = new Final_keyword();
	System.out.println(ref1);
}
}