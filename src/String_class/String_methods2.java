package String_class;

public class String_methods2 {
public static void main(String[] args) {
	String s1 = "swara";
	String s2 ="SWARA";
	String s3="ara";
	
	
	//length()
	System.out.println(s1.length());
	
	//to uppercase()
	System.out.println(s1.toUpperCase());
	
	//tolowercase();
	System.out.println(s2.toLowerCase());
	
	//equals()
	System.out.println(s1.equals(s2));
	
	//equalignorecase()
	System.out.println(s1.equalsIgnoreCase(s2));
	
	//contais()
	System.out.println(s1.contains(s3));
	
	//charAt()
	System.out.println(s1.charAt(4));
	
	//indexof()
	System.out.println(s1.indexOf('w'));
	
	//concat()
	System.out.println(s1.concat(s3));
	
	//substring
	System.out.println(s1.substring(3));
	
	//startsWith()
	System.out.println(s1.startsWith("sw"));
	
	
	//endswith()
	System.out.println(s1.endsWith("ra"));
}
}
