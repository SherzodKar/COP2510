//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev 
import java.util.*;
public class FlightTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Here is the information for the first part of your flight: ");
		Flight obj1;
		obj1 = new Flight();
		obj1.setNAme("American Airlines");
		obj1.setNumebr(1717);
		obj1.setOrigin("Tampa Bay");
		obj1.setDestination("Las Vegas");
		System.out.println(obj1);
		System.out.print("\nPlease enter the information for the second part of the flight: ");
		Flight obj2;
		System.out.print("\nAirline: ");
		String name = scan.nextLine();
		System.out.print("\nFlight Number: ");
		int number = scan.nextInt();
		System.out.print("\nOrigin for connecting flight: ");
		scan.nextLine();
		String origin = scan.nextLine();
		System.out.print("\nDestination for connecting flight: ");
		String destination = scan.nextLine();
		obj2 = new Flight(name, number, origin, destination);
		System.out.println("Here is the information for " + Flight.getObject() + " flights:\n");
		System.out.println(obj1);
		System.out.println(obj2);
	}
}