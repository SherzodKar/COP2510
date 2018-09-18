//“I pledge my	Honor	that I have	not cheated, and will not cheat, on this assignment” Sherzod Kariev

import java.util.*;
import java.text.*;

public class WindChill {
	public static void main (String[] args) {
		double twc, ta, v;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		ta = scan.nextDouble();
		if (ta < -58 ^ ta > 41) {
			System.out.print("Temperature must be between -58 degrees F and 41 degrees F.\n" + "Please re-enter: ");
			ta = scan.nextDouble();
			if (ta < -58 ^ ta > 41) {
				System.out.println("Sorry, inputted value is wrong! Please, restart the program.");
				System.exit(0);
			}
		}
		System.out.print("Enter the wind speed miles per hour: ");
		v = scan.nextDouble();
		if (v < 2) {
			System.out.print("Speed must be greater than or equal to 2.\r\n" + "Please re-enter: ");
			v = scan.nextDouble();
			if (v <2) {
				System.out.println("Sorry, inputted value is wrong! Please, restart the program.");
				System.exit(0);
			}
		}
		twc = 35.74 + 0.6215 * ta - 35.75 * Math.pow(v, 0.16) + 0.4275 * ta * Math.pow(v, 0.16);
		DecimalFormat fmt = new DecimalFormat ("0.###");
		System.out.println("The wind chill index is " + fmt.format(twc));
	}
}
