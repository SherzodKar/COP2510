//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev 

public class Flight {
	private String name;
	private int number;
	private String origin;
	private String destination;
	private static int objects;
	
	public Flight(){
		name = "";
		number = 0;
		origin = "";
		destination ="";
		objects = 0;
		objects++;
	}
	public Flight(String a, int b, String c, String d){
		name = a;
		number = b;
		origin = c;
		destination = d;
		objects++;
	}
	public void setNAme(String name) {
		this.name = name;
	}
	public void setNumebr(int number) {
		this.number = number;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	} 
	public String getOrigin() {
		return origin;
	} 
	public String getDestination() {
		return destination;
	} 
	public static int getObject() {
		return objects;
	} 
	public String toString() {
		return (getName() + " " + getNumber() +  " -- From: " + getOrigin() + ", To: " + getDestination());
	}
}
