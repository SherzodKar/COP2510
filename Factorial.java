//“I pledge	my Honor that I have not cheated, and will not cheat, on this test.” Sherzod Kariev	
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a nonnegative integer: ");
		int number = scan.nextInt();
		while(number < 0) {
		number++;
		System.out.println("Factorial is undefied for negative numbers.");
		System.out.print("Please enter a nonnegative integer: ");
		number = scan.nextInt();
		}
		int fact = 1;
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println(number + "! = " + fact);
	}
}
