package conditional_statement;

public class switch_case {
	public static void main(String[] args) {
		switch("Idle") {//output of expression 
		case "Idle":{//false"
		System.out.println("on monday");
		break;//jvm stop execution
		}
		case"Dosa":{//true
			System.out.println("on tuesday");
			break;
		}
		case"uttapam":{
			System.out.println("on wednesday");
			break;
		}
		default:{
			System.out.println("no chatney");
			
			
		}
		}
	}

}
