//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev 
import java.util.Scanner;
public class AnalyzeScore {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double[] fifty = new double[50];
		int count = 0;
		double sentinel = -1;
		int num = 0;
		double sum = 0;
		double average = 0;
		int i = 0;
		double score = 0;
			while(i < fifty.length) 
			{
				System.out.print("Enter a new score(enter -1 to stop): ");
				score = scan.nextDouble();
				
				if(score == sentinel)
				{
					break;
				}
				else if(score < 0) {
					count = 0;
					continue;
				}
				
				else if(score >= 0){
					fifty[i] += score;
					sum += fifty[i];
					count++;
				}
				
				num = i + 1;
				average = sum/num;
				i++;
			}
			if(num == 0){
				System.out.println("No useful numbers were entered!");
			}
			else {
				System.out.println("The number of scores you entered is " + num);
			}
			int above = 0;
			int below = 0;
			int a = 0;
			while(a < count) {
				if(fifty[a] >= average)
				{
					above ++;
					below = num - above;
				}
				a++;
			}
		System.out.println("Average is " + average + "\nNumber of scores above or equal to the average: " + above + "\nNumber of scores below the average: " + below);
	}
}
