package Nested_loop;

public class Nested_for_loop {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1; j<=5; j++) {
		
			//here need to if eles statement
			if(i==1 && j==1) {
			System.out.print("@");	
			}
			
			else if(i==5 && j==5) {
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