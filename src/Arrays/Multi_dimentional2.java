package Arrays;

public class Multi_dimentional2 {
	public static void main(String[] args){
		int ar [][]=new int [2][2];
		ar[0][0]=10;
		ar[0][1]=30;
		ar[1][0]=50;
		ar[1][1]=60;
		//System.out.pirntln([1[1]);
		//System.out.println([0][0]);
		//print the matrix box
		for(int i=0; i<=1; i++){//outer for loop

		for(int j=0; j<=1; j++){
		System.out.print(ar[i][j]+ "");
		}
		System.out.println();

		}
		}
		}