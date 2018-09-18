//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev

public class Dollars
{
   public static void main(String [] args)
   {
      int dollar = 125;
      
      int twenty = dollar/20;
      
      int ten = (dollar % 20)/10;
      
      int five = (dollar % 10)/5;
      
      int one = (dollar % 5)/1; 
      
      System.out.println("$" + dollar + " converted is\n\n" + twenty + " $20s\n" + ten + " $10s\n" + five + " $5s\n" + one + " $1s\n");
      
   }
}
