package conditional_statement;

public class if_else_ladder2 {
	public static void main(String[] args) {
		int marks=55;
		if(marks>=75) {
			System.out.println("pass with distriction");
		}
		else if (marks>=55) {
			System.out.println("pass in second class");
		}
		else if (marks>=40) {
			System.out.println("pass in third class");
		}
		else if(marks>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("successfully fail");
		}
	}

}
