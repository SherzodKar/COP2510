//“I pledge	my Honor that I have not cheated, and will not cheat, on this test.” Sherzod Kariev	
import java.util.*;
public class RPSGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String comp = null;
		String answer;
		do {
			System.out.println("Let's play Rock, Paper or Scissors!");
			System.out.print("Enter your choice: Rock, Paper, or Scissors: ");
			String choice = scan.nextLine();
			while(!(choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors"))) {
				System.out.print("Error!Enter right choice: Rock, Paper, or Scissors: ");
				choice = scan.nextLine();
			}
				Random rand = new Random();
				int gen = rand.nextInt(2);
				switch(gen) {
					case 0:
						System.out.println("Computer chooses Rock");
						comp = "Rock"; 
						break;
					case 1: 
						System.out.println("Computer chooses Paper");
						comp = "Paper";
						break;
					case 2:
						System.out.println("Computer chooses Scissors");
						comp = "Scissors";
						break;
				}
				if(choice.equalsIgnoreCase(comp)){
					System.out.println("It's a tie!");
				}
				else if(choice.equalsIgnoreCase("Rock") && comp.equalsIgnoreCase("Scissors")) {
					System.out.println("Rock crushes Scissors. You win!!!");
				}
				else if(choice.equalsIgnoreCase("Rock") && comp.equalsIgnoreCase("Paper")) {
					System.out.println("Paper covers Rock. You lost!");
				}
				else if(choice.equalsIgnoreCase("Scissors") && comp.equalsIgnoreCase("Rock")) {
					System.out.println("Rock crushes Scissors. You lost!");
				}
				else if(choice.equalsIgnoreCase("Scissors") && comp.equalsIgnoreCase("Paper")) {
					System.out.println("Scissors cut the paper. You win!!!");
				}
				else if(choice.equalsIgnoreCase("Paper") && comp.equalsIgnoreCase("Rock")) {
					System.out.println("Paper covers Rock. You win!!!");
				}
				else if(choice.equalsIgnoreCase("Paper") && comp.equalsIgnoreCase("Scissors")) {
					System.out.println("Scissors cut the paper. You lost!");
				}
				System.out.print("Play again? Enter yes or no: ");
				answer = scan.nextLine();
				while(!(answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("No"))){
					System.out.print("Error! Wrong word.Please, enter yes or no: ");
					answer = scan.nextLine();
				}
		}while(answer.equalsIgnoreCase("Yes"));
	}
}	

