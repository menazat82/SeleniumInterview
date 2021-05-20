import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
	String s="HELLO WORLD";
		
	
	//FIRST WAY
		String reversedString="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			reversedString=reversedString+s.charAt(i);
		}
		

		System.out.println(reversedString);
		
		System.out.println("------");


	//SECOND WAY

		StringBuffer sf =new StringBuffer(s);
		 
		System.out.println(sf.reverse());
		
	}
}
