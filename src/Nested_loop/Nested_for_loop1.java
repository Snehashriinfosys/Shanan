package Nested_loop;

public class Nested_for_loop1 {
public static void main(String[] args) {
	
	for(int i=1; i<=4; i++) {//row
		for(int j=1; j<=4; j++) {//column
			
			if(i==1 && j==1) {
				System.out.print("@");
				
			}
			else if(i==4 && j==4) {
				System.out.print("#");
				
			}
			else {
				System.out.print("*");
			}
			
		}
		System.out.println();
		
		
	}
}
}
