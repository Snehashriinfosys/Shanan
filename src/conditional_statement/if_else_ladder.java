package conditional_statement;

public class if_else_ladder {
public static void main(String[] args) {
	int marks=100;
	if(marks>=85) {
		System.out.println("pass in first class with distriction");
	}
	else if(marks>=60) {
	System.out.println("pass in second class");
	}
	else if(marks>=45) {
		System.out.println("pass in third class");
	}
	else if(marks>=30) {
		System.out.println("pass");
	}
	else {
		System.out.println("successfully fail");
	}
}

}