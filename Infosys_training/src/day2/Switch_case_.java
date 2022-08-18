package day2;

public class Switch_case_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 14;
		if(day>7)
			day = (day % 7);
			if(day==0)
				day = day + 7;
			
			
		// TODO alternative logic switch((day-1)%7) and case from 0-6
			
			
		switch(day)
		{
			default:
				System.out.println("Invalid Day Input");
				break;
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
		}

	}

}
