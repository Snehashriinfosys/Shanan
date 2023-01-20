package Star1;

public class Nestead_loop2 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				//we need to use if else mthod
				if(i==j) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}

}
