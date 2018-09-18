//“I pledge	my Honor that I have not cheated, and will not cheat, on this assignment.” Sherzod Kariev	
import java.util.*;
import java.io.*;
import java.text.*;
import java.lang.*;
public class PalindromeTesterMod{
	public static void main(String[] args)
	 {
		String str, another = "y";
		int left = 0, right = 0;
		Scanner scan = new Scanner(System.in);
		 while (another.equalsIgnoreCase("y")) 
		  {
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();
			String a = charCheck(str);
			palindromeCheck(a);
			System.out.print("Test another palindrome (y/n)? ");
			another = scan.nextLine();
		  }
	 }	
	public static String charCheck(String par) {
		String var = "";
		for(int i = 0; i < par.length(); i++) {
			if(Character.isLetterOrDigit(par.charAt(i))) {
				var += par.charAt(i); 
			}
		}
		return var.toLowerCase();
	}
	public static void palindromeCheck(String par){
			int left = 0, right = 0;
			 right = par.length() - 1;
			
			while(par.charAt(left) == par.charAt(right) && left < right)
			 {
				 left++;
				 right--;
			 }
				 if (left < right)
				 System.out.println("That string is NOT a palindrome.");
				 else
				 System.out.println("That string IS a palindrome.");
		  } 
	}
