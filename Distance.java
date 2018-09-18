//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev

import java.util.*;

public class Distance
{
   public static void main(String [] args)
   {
      Scanner first = new Scanner (System.in);
      
      System.out.print("Enter the coordinates of the first point (put a space between them): ");
      
      double point1 = first.nextDouble();
      
      double point2 = first.nextDouble();
      
      Scanner second = new Scanner (System.in);
      
      System.out.print("Enter the coordinates of the second point: ");
      
      double point3 = second.nextDouble();
      
      double point4 = second.nextDouble();
      
      double subtract1 = point3 - point1;
      
      double  subtract2 = point4 - point2;
      
      double distance = Math.sqrt(Math.pow(subtract1, 2.0) +  Math.pow(subtract2, 2.0)); 
      
      System.out.println("The distance between " + "(" + point1 + "," + point2 + ")" + "and" + "(" + point3 + "," + point4 + ") is " + distance);      
   }
}   