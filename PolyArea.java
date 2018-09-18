//“I pledge	my Honor that I have not cheated, and will not cheat, on this assignment.” Sherzod Kariev	
import java.util.*;
import java.text.*;
public class PolyArea {
	public static void main(String[] args) {
		double x, y;
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.####");
		System.out.print("Enter the number of sides: ");
		x = scan.nextDouble();
		System.out.print("Enter the side: ");
		y = scan.nextDouble();
		System.out.println("The area of the polygon is " + fmt.format(areacalculator(x, y)));
	}
	public static double areacalculator(double n, double s) {
		double area;
		return area = (n * Math.pow(s, 2))/(4 * Math.tan(Math.PI/n));
	}
}
