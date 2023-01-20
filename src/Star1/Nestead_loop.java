package Star1;

public class Nestead_loop {
public static void main(String[] args) {
	for(int i=1; i<=3; i++) {
		for(int j=1; j<=4; j++) {
			
			//we need u use if else stament
			if(i==1 || i==3 || j==1 || j==4) {
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
