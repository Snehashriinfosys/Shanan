package Arrays;

public class Muti_dime1 {
	public static void main(String[] args){
		int ar[][] = new int[2][2];
		ar[0][0]=20;
		ar[0][1]=30;
		ar[1][0]=40;
		ar[1][1]=50;

		//system.out.pirntln([1][1]);
		//system.out.println([0][0]);
		//using for loop
		for (int i =0; i<=1;i++){
		for (int j=0;j<=1;j++){
		System.out.print(ar[i][j]+ "");
		}
		System.out.println();
		}
		}
		
}
