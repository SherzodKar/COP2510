//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev 
import java.util.*;
public class Markov {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		double [] [] array = new double [3][3];
		
		System.out.println("Enter a 3 by 3 matrix row by row: ");
		
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				array[row][col] = scan.nextDouble();
			}
		}
		System.out.println("The matrix you entered is: ");
		for(int row = 0; row < array.length; row++) {
			for(int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}
				
		if(mark(array)) 
		{
			System.out.println("It is a Markov matrix");
		}
		else 
		{
			System.out.println("It is not a Markov matrix");
		}
		
 	}
	public static boolean mark(double [][]array)
	{
		int count = 0;
		
		for(int row = 0; row < array.length; row++)
		{ 
			double sum = 0;
			for(int col = 0; col < array[row].length; col++) 
			{	
				if(array[row][col] < 0) 
				{
					count++;
				}
				
				sum += array[col][row];
			}
			if (sum != 1)
			{
				count++;
			}
		}
		if (count == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}