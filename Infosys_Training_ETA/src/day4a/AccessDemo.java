package day4a;

import day4.Person;

public class AccessDemo {

	public static void main(String[] args) {

		Person dk = new Person("iPhone", "DDD", "Kwid", "DD");
		
		System.out.println(dk.getMobile());
		System.out.println(dk.getHouse());
		System.out.println(dk.getCar());
		System.out.println(dk.guestHouse);
	}

}
