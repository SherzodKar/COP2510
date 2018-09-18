//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev 
package DeckOFCards;
import java.util.*;

public class Card {
		   private static int face;
		   private static int suit;
		   private String facecard, suitcard;
		   
		   public Card(int suit, int face) {
			   this.face = face;
					  assign1();
			   this.suit = suit;
					   assign2();
		   }
		   private void assign1() {
			   switch(face) {
			   		case 1: facecard = "Ace";
			   			break;
			   		case 2: facecard =  "Two";
			   			break;
			   		case 3: facecard =  "Three";
			   			break;
			   		case 4: facecard =  "Four";
			   			break;
			   		case 5: facecard =  "Five";
			   			break;
			   		case 6: facecard =  "Six";
			   			break;
			   		case 7: facecard = "Seven";
			   			break;
			   		case 8: facecard = "Eigth";
			   			break;
			   		case 9: facecard =  "Nine";
			   			break;
			   		case 10: facecard = "Ten";
			   			break;
			   		case 11: facecard =  "Jack";
			   			break;
			   		case 12: facecard = "Queen";
			   			break;
			   		case 13: facecard =  "King";
			   			break;
			   }
		   }
		   private void assign2() {
			   switch(suit) {
			   		case 1: suitcard = "Hearts";
			   			break;
			   		case 2: suitcard = "Clubs";
			   			break;
			   		case 3: suitcard = "Spades";
			   			break;
			   		case 4: suitcard = "Diamonds";
			   			break;
			   }
		   }
		   public  String toString() {
			return (facecard + " of " + suitcard);
		   }
}