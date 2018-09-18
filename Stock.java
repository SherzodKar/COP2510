//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev

import java.util.Scanner;

public class Stock
{
   public static void main(String [] args)
   {
      System.out.println("This program will help you determine the cost of your stock transaction.\n");
     
	   Scanner number = new Scanner (System.in);
	   
	   System.out.print("First, enter the number of shares you wish to purchase: ");
      
      int dollar;
      
      double share;
      
      double commission;
      
      dollar = number.nextInt();
      
      Scanner price = new Scanner (System.in);
      
      System.out.print("\nNext, enter the price of each share: ");
      
      share = price.nextDouble();
      
      Scanner percentage = new Scanner (System.in);
      
      System.out.print("\nNow, enter your stockbroker's commission percentage: ");
      
      commission = percentage.nextInt();
      
      double tocks = dollar * share;
      
      double comcost = (commission * tocks)/100;
      
      double total = tocks + comcost;
            
      System.out.println("\nYour stock cost is: $" + tocks + " \nThe commission cost is: $" + comcost + " \nThe total amount of the transaction is: $" + total); 
   }
}
