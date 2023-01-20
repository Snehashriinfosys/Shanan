package String_class;

public class String_methods1 {
public static void main(String[] args) {
	//string:it is a NPDT whose memory size is not fix
	//it is inbiuld class present in JAVA.Lang
	
	String s1 = "ashvini";
	String s2 = "ASHVINI";
	String s3 = "vini";
	
	//Lenght();it is used to get no. of character present in string
	System.out.println(s1.length());
	
	////touppercase();it will convert lower case  alue to the uppercase
	System.out.println(s1.toUpperCase());
	
	//TOLOWERCASE(); it'll convert uppercase value to the lower case
	System.out.println(s2.toLowerCase());
	
	//equal();it caompare actual data inside the string
	System.out.println(s1.equals(s2));
	
	//equalignorecase():it ignore cases then compare
	System.out.println(s1.equalsIgnoreCase(s2));
	
	//contais():it is used to verify weher given string contain certain data or not
	System.out.println(s1.contains(s3));
	System.out.println(s2.contains(s3));
	
	//charAt(): it will give character if specific index
	System.out.println(s1.charAt(6));
	System.out.println(s2.charAt(4));
	
	//indexof(): it'll give index of perticular character
	System.out.println(s1.indexOf('i'));
	
	//concat();it is used to join to string
	System.out.println(s1.concat(s3));
	
	//substring(); it ll brak the string
	System.out.println(s1.substring(4));
	
	//startswith;it ll chech wether of string start with given  characer
	System.out.println(s1.startsWith("ah"));
	System.out.println(s1.startsWith("as"));
	
	//endswith()" it will check wether of ends with given character
	System.out.println(s1.endsWith("ni"));
}
}
