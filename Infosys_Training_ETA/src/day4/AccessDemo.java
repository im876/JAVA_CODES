package day4;

public class AccessDemo {

	public static void main(String[] args) {

		Person dk = new Person("iPhone7", "DDD", "Kwid", "DD");
		
		//dk.printDetails();
		
		System.out.println(dk.getMobile());
		System.out.println(dk.getHouse());
		System.out.println(dk.getCar());
		System.out.println(dk.guestHouse);	
		
		dk.setMobile("iPhone12");
		System.out.println(dk.getMobile());

	}

}

