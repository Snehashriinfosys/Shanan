package This_super_keywords;

public class This_keyword {//it doesn't have main method
	int a=10;//global variable
	public void test() {
		int b =20;
		System.out.println(b);//now i want to print globa variable from same class
		System.out.println(this.a);
	}

}
