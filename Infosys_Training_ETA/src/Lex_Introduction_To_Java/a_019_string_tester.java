package Lex_Introduction_To_Java;

class a_019_string_tester{


	public static String removeWhiteSpaces(String str){
		//Implement your code here and change the return value accordingly
		String result = str.replaceAll(" ", "");
		return result;
	}

	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}