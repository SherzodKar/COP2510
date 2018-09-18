//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev 

package DeckOFCards;

import java.util.Scanner;

public class CardDriver {

	public static void main(String[] args) {
		DecksOFCards deck = new DecksOFCards();
		Scanner scan = new Scanner(System.in);
		int number = 0;
		deck.shuffle();
		int cardnumber = 1;
		System.out.println("How many cards?");
		number = scan.nextInt();
		while(cardnumber <= number && deck.remains()) {
			System.out.println(cardnumber + "." + deck.deal());
			cardnumber++;
		}
	}
}	

