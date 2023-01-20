package Arrays;

public class Sample {
public static void main(String[] args) {
	String ar[] = new String [4];
	ar[0]="Dolly";
	ar[1]="Monkey";
	ar[2]="Rinkey";
	ar[3]="Teena";
	//ar[4]="abc"; Array index out of boundary exception
	System.out.println(ar[0]);
	System.out.println(ar[1]);
	System.out.println(ar[2]);
	System.out.println(ar[3]); 
System.out.println(ar[4]);//is there no data but still we are trying to fetch so we will get AIOOOBE 
}
}
