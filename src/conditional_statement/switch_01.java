package conditional_statement;

public class switch_01 {
	public static void main(String[] args) {
		switch("dosa") {//outup of expression
		case"idle":{
			System.out.println("on monday");
			break;//jvm stop execution
		}
		case"dosa":{
			System.out.println("on tuesday");
			break;
		}
		case"wada":{
		System.out.println("on wednsday");	
		break;
		}
		default:
			System.out.println("no chatney");
	}
	}
}
