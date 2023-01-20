package String_class;

public class String_methods {
public static void main(String[] args) {
	String s1 = "shrirame";
	String s2 ="SHRIRAME";
	String s3 ="ram";
	
	//lenght()
	System.out.println(s1.length());
		
	//uppercase()
	System.out.println(s1.toUpperCase());
	
	//Lowercase()
	System.out.println(s2.toLowerCase());
	
	//equal()
	System.out.println(s1.equals(s2));
	
	//equalignorecase()
	System.out.println(s1.equalsIgnoreCase(s2));
	
	//contains()
	System.out.println(s1.contains(s3));
	
	System.out.println(s2.contains(s3));
	
	//charAt()
	System.out.println(s1.charAt(7));
	System.out.println(s1.charAt(4));
	
	//indexof()
	System.out.println(s1.indexOf('e'));
	
	System.out.println(s2.indexOf('H'));
	
	//concat()
	System.out.println(s1.concat(s3));
	
	//substring()
	System.out.println(s1.substring(4));
	System.out.println(s1.substring(6));
	
	//startwith()
	System.out.println(s1.startsWith("sh"));
	
	//endswith()
	System.out.println(s1.endsWith("me"));
	
	
	
	
	
	
	
	
	
	
}
}
