package day7.banking;

public class Tester {

	public static void main(String[] args) {
		
		SBI chennai = new SBI("Chennai", 9876543210l, 1, "Chennai street", "Chennai", "TamilNadu", 600001);
		
		System.out.println(chennai.ifscCode);
		
		SBI bangalore = new SBI("Bangalore", 9321457856l, 2, "Bangalore street", "Bangalore", "Karnataka", 700001);
		
		System.out.println(bangalore.ifscCode);
		
		IOB delhi = new IOB("Delhi", 8564759684l, 3, "Delhi street", "Delhi", "Delhi", 800001);
		
		System.out.println(delhi.ifscCode);
		
		IOB cuttack = new IOB("Cuttack", 8632154759l, 4, "Cuttack street", "Cuttack", "Odisha", 900001);
		
		System.out.println(cuttack.ifscCode);
		
		System.out.println();
		
		Person dk = new Person("Dineshkumar", "06-02-1991");
		
		dk.applyPan();
		
		System.out.println(dk.panNo.panNo);
		
		System.out.println(dk.panNo.aadharNo);
		
		dk.openAccount(chennai);
		
		System.out.println(dk.accNo);
		
		
		
		

	}

}
