package MethodandConstructor;

public class Checkvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="hello";
		boolean found=false;
		String str=input.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("the string contains a vowels.");
		}
		else {
			System.out.println("no vowels are found");
		}
		

	}

}
