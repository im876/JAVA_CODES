package day2;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		int dayOrder =79;
		
		switch((dayOrder-1)%7 ) { //int, char, string , not used-> float, boolean
		default:
			System.out.println("Invalid day order");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;				
		}
		
		switch((dayOrder-1)%7 ) { //int, char, string , not used-> float, boolean
		default:
			System.out.println("Invalid day order");
			break;
		case 0:
			System.out.println("Sunday");
			
		case 2:
			System.out.println("Tuesday");
			
		case 4:
			System.out.println("Thursday");
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 1:
			System.out.println("Monday");			
		
		case 3:
			System.out.println("Wednesday");			
		
		case 5:
			System.out.println("Friday");
			break;
						
		}
		
		/*
		char ch = 's';
		
		switch(ch) { //int, char, string , not used-> float, boolean
		default:
			System.out.println("Invalid day order");
			break;
		case 83:
		case 115:
			System.out.println("Sunday");
			break;
		case 'M':			
		case 'm':
			System.out.println("Monday");
			break;
		case 't':
			System.out.println("Tuesday");
			break;
		case 'w':
			System.out.println("Wednesday");
			break;
		case 'h':
			System.out.println("Thursday");
			break;
		case 'f':
			System.out.println("Friday");
			break;
		case 'r':
			System.out.println("Saturday");
			break;				
		}
		
		String str = "sun";
		
		switch(str) { //int, char, string , not used-> float, boolean
		default:
			System.out.println("Invalid day order");
			break;
		case "sun":
			System.out.println("Sunday");
			break;
		case "mon":
			System.out.println("Monday");
			break;
		case "tue":
			System.out.println("Tuesday");
			break;
		case "wed":
			System.out.println("Wednesday");
			break;
		case "thur":
			System.out.println("Thursday");
			break;
		case "fri":
			System.out.println("Friday");
			break;
		case "sat":
			System.out.println("Saturday");
			break;				
		}
		
		System.out.println("Day order is printed");
		*/	
		
	}

}
