package MethodandConstructor;

public class Reverse_string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="java";
		String reversed = new StringBuilder(input).reverse().toString();
		if(input==reversed) {
			System.out.println("the string is palindrome");
		}
		else {
			System.out.println("the string is not palindrome");
		}
		
		

	}

}
