package day4;

public class Person{
	
	private String mobile;
	private String house;
	private String car;
	public String guestHouse;
	
	public Person(String mobile, String house, String car, String guestHouse) {
		
		this.mobile = mobile;
		this.setHouse(house);
		this.setCar(car);
		this.guestHouse = guestHouse;
	}
	
	public void printDetails() {
		
		System.out.println(mobile);
		System.out.println(getHouse());
		System.out.println(getCar());
		System.out.println(guestHouse);
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	
	
}
