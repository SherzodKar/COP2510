//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Sherzod Kariev 

package DeckOFCards;

public class DecksOFCards {
		   public static final int NEWCARDS = 52;
		   private static Card[] deckOfCards;
		   public static int numberofCards;
		 
		public DecksOFCards() {
		numberofCards = NEWCARDS;
		  deckOfCards = new Card[NEWCARDS];
		  int index = 0;
		 
		  for ( int suit = 1; suit <= 4; suit++ )
		     for ( int face = 1; face <= 13; face++ )
		         deckOfCards[index++] = new Card(suit, face);
		 
		}
		 public static Card deal() {
			if(numberofCards > 0) {
				return deckOfCards[--numberofCards];
			}
			return null;
			 
		 }
		 public static boolean remains() {
			 if(numberofCards > 0) {
					return true;
				}
			return false;
		 }
		
		
		   public void shuffle() {
			   
			   Card temp;
		       int a, b;

		       for (int i = 0;  i < 9999 ; i ++)
		       {
		           a = (int) ( NEWCARDS * Math.random() );
		           b = (int) ( NEWCARDS * Math.random() );
		           temp = deckOfCards[a];
				   deckOfCards[a] = deckOfCards[b];
				   deckOfCards[b] = temp;
		        }
		  }
}
