//“I pledge	my Honor that I have not cheated, and will not cheat, on this assignment.” Sherzod Kariev	
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;
public class AvgTestGrade {
	public static void main(String[] args) {
		int d;
		do {
			String input;
			double x, y, z;
			DecimalFormat fmt = new DecimalFormat("0.##");
			input = JOptionPane.showInputDialog("Enter the first test score: ");
			x = Double.parseDouble(input);
			while(x <= 0 || x >= 100) {
				input = JOptionPane.showInputDialog("Error. The score cannot be negative or more than 100. Enter the first test score again: ");
				x = Double.parseDouble(input);
			}
			input = JOptionPane.showInputDialog("Enter the second test score: ");
			y = Double.parseDouble(input);
			while(y <= 0 || y >= 100) {
				input = JOptionPane.showInputDialog("Error. The score cannot be negative or more than 100. Enter the second test score again: ");
				y = Double.parseDouble(input);
			}
			input = JOptionPane.showInputDialog("Enter the third test score: ");
			z = Double.parseDouble(input);
			while(z <= 0 || z >= 100) {
				input = JOptionPane.showInputDialog("Error. The score cannot be negative or more than 100. Enter the third test score again: ");
				z = Double.parseDouble(input);
			}
			JOptionPane.showMessageDialog(null, "Here are the grades for each test: \n\n" + "Test 1: " + grade(x) + 
			"\nTest2: " + grade(y)  + "\nTest3: " + grade(z) + "\n\nThe average score is " + fmt.format(average(x, y, z)) + "\nAverage Letter Grade: " + grade(average(x, y, z)));
			d = JOptionPane.showConfirmDialog(null, "Do you want to average another set of scores?", "Decide!", JOptionPane.YES_NO_OPTION);
			while(d == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		}while(d ==JOptionPane.YES_OPTION);
	}
	public static double average(double a, double b, double c) {
		double avg;
		return avg = (a + b + c)/3;
	}
	public static String grade(double num) {
		String result;
		if(num >= 90 && num <= 100){
			return result = "A";
		}
		else if(num >= 80 && num <= 90) {
			return result = "B";
		}
		else if (num >= 70 && num <= 80) {
			return result = "C";
		}
		else if (num >= 60 && num <= 70) {
			return result = "D";
		}
		else {
			return result = "Unsatisfactory";
		}
	}
}
