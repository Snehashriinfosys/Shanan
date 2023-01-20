package This_super_keywords;

public class This_keyword1 { //BLC it doen't have main method 
int a =20;//global variable
public void test() {
	int b = 30;//local variable
	System.out.println(b);//now i want to print global var from same class
	System.out.println(this.a);
}
}
