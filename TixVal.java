//“I pledge my	Honor	that I have	not cheated, and will not cheat, on this assignment” Sherzod Kariev

import javax.swing.*;

public class TixVal {
	public static void main(String [] args) {
		String inputString;
		int number;
		inputString = JOptionPane.showInputDialog("Enter 6 - digit number: " );
		number = Integer.parseInt(inputString);
		int digits = number / 10;
		int lastDigit = number % 10;
		int remainder = digits % 7;
		if (remainder == lastDigit) {
			JOptionPane.showMessageDialog(null, "The ticket number " + number + " is valid.\n" + "lastDigit = " + lastDigit + "\nremainder = " + remainder);	
		}
		else {
			JOptionPane.showMessageDialog(null, "The ticket number " + number + " is invalid.\n" + "lastDigit = " + lastDigit + "\nremainder = " + remainder);
		}
	}
}
