package Arrays;

public class Single_dimentional_array1 {

	public static void main(String[] args) {
		String ar[] = new String [5];
		ar[0]="Swara";
		ar[1]="Daksh";
	     ar[2]="Kanchan";
	     ar[3]="Sonu";
	     ar[4]="Meene";
	     
	    //ar[5]="Suamy";//it is array index out of exception
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println(ar[3]);
	System.out.println(ar[4]);
	System.out.println(ar[5]);//is there no data but still trying to fetch aioobe
}
}
