//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev

import java.util.*;

public class RandTemp
{
   public static void main(String [] args)
   {
      Random generator = new Random();
      
      System.out.println("This program generates a random temperature in Celsius and converts it to Fahrenheit.");
      
      int cel = generator.nextInt(100);
      
      System.out.println("The temperature selected is: " + cel);
      
      double frac = (9.0/5.0)*cel;
      
      double far = frac + 32.0;
      
      System.out.println(cel + " Celsius is " + far + " Fahrenheit");
      
   }
 }  