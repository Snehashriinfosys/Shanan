package Exceptions;

public class arithmatic_exception1 {
public static void main(String[] args) {
	int a=1;
	int b=0;
	try {
		int c = a/b;//risky code
		System.out.println(c);
	}
	catch(Throwable monkey) {
		System.out.println("exception is handle");
		
	}
	
}
}
