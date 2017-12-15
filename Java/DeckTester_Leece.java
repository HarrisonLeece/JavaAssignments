//Harrison Leece Period	5 AP CompSci
//Deck 

import java.util.List;
import java.util.ArrayList;

/**
 *	This is a class that	tests	the Deck	class.
 */
public class DeckTester_Leece	
{

	 /**
	  * The main method in this class checks the	Deck operations for consistency.
	  *	 @param args is not used.
	  */
   public static	void main(String[] args) 
   {
      String ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
      String suits[] = {"Diamonds","Clubs","Spades","Hearts"};
      int values[]	= {14,2,3,4,5,6,7,8,9,10,11,12,13};
      
      String wRanks[] = {"Dog","2","Cats","4","Potatos","6","Toilets","8","Peanuts","10","Lad","Queen","Hobo"};
      String wSuits[] = {"Planets","Nebulas","Asteroids","Stars"};
      int wValues[]	= {14,2,3,4,5,6,7,8,9,10,11,12,13};
      
   	  
      Deck standardDeck = new Deck(ranks, suits, values);
        
      System.out.println(standardDeck.isEmpty());
      System.out.println(standardDeck.toString());
      System.out.println();
      standardDeck.shuffle();
      System.out.println();
      System.out.println(standardDeck.size()); 
      
      Deck whackyDeck = new Deck (wRanks, wSuits, wValues);
      System.out.println(whackyDeck.isEmpty());
      System.out.println(whackyDeck.toString());
      System.out.println();
      whackyDeck.shuffle();
      System.out.println();
      System.out.println(whackyDeck.size());
   	
      Deck lazyDeck = new Deck (wRanks, suits, wValues);
      
      System.out.println(lazyDeck.isEmpty());
      System.out.println(lazyDeck.toString());
      System.out.println();
      lazyDeck.shuffle();
      System.out.println();
      System.out.println(lazyDeck.size());
      System.out.println();
      
      System.out.println(standardDeck.deal());
      System.out.println(standardDeck.deal());
      System.out.println(standardDeck.deal());
      
      /*
      Q2
      6 because 3 * 2 = 6
      Q3
      >>>>See my first deck<<< its just a standard deck<<<<
      */
      
   }
}

class	Card 
{

	/**
	 *	String value that	holds	the suit	of	the card
	 */
   private String	suit;

	/**
	 *	String value that	holds	the rank	of	the card
	 */
   private String	rank;

	/**
	 *	int value that	holds	the point value.
	 */
   private int	pointValue;


	/**
	 *	Creates a new <code>Card</code> instance.
	 *
	 *	@param cardRank  a <code>String</code>	value
	 *						  containing the rank of the card
	 *	@param cardSuit  a <code>String</code>	value
	 *						  containing the suit of the card
	 *	@param cardPointValue an <code>int</code>	value
	 *						  containing the point value of the	card
	 */
   public Card(String cardRank, String	cardSuit, int cardPointValue)	
   {
      suit = cardSuit;
      rank = cardRank;
      pointValue = cardPointValue;
   }


	/**
	 *	Accesses	this <code>Card's</code> suit.
	 *	@return this <code>Card's</code>	suit.
	 */
   public String suit()	
   {
      return this.suit;
   }

	/**
	 *	Accesses	this <code>Card's</code> rank.
	 *	@return this <code>Card's</code>	rank.
	 */
   public String rank()	
   {
      return this.rank;
   }

	/**
	 *	Accesses	this <code>Card's</code> point value.
	 *	@return this <code>Card's</code>	point	value.
	 */
   public int pointValue()
   {
      return this.pointValue;
   }

	/** Compare	this card with	the argument.
	 *	@param otherCard the	other	card to compare to this
	 *	@return true if the rank, suit, and	point	value	of	this card
	 *					 are equal to those of the	argument;
	 *			  false otherwise.
	 */
   public boolean	matches(Card otherCard)	
   {
      if(this.pointValue()	==	otherCard.pointValue() && this.suit().equals(otherCard.suit())	&&	this.rank().equals(otherCard.rank()))
      {
         return true;
      } 
      else
      {
         return false;
      }
   }

	/**
	 *	Converts	the rank, suit, and point value into a	string in the format
	 *		 "[Rank]	of	[Suit] (point value = [PointValue])".
	 *	This provides a useful way	of	printing	the contents
	 *	of	a <code>Deck</code> in an easily	readable	format or performing
	 *	other	similar functions.
	 *
	 *	@return a <code>String</code>	containing the	rank,	suit,
	 *			  and	point	value	of	the card.
	 */
   @Override
   public String toString() 
   {
      String rank2 =	this.rank();
      String suit2 =	this.suit();
      int pointValue2 =	this.pointValue();
      return (rank2 + " of " + suit2 +	" (point value) = " +pointValue2);
   }
}

/**
 *	The Deck	class	represents a shuffled deck	of	cards.
 *	It	provides	several operations including
 *		  initialize, shuffle, deal, and	check	if	empty.
 */
class	Deck	
{

	 /**
	  * cards contains all the	cards	in	the deck.
	  */
   private	List<Card> cards;

	 /**
	  * size	is	the number of not-yet-dealt cards.
	  * Cards are dealt from the top	(highest	index) down.
	  * The next card	to	be	dealt	is	at	size - 1.
	  */
   private	int size;


	 /**
	  * Creates	a new	<code>Deck</code>	instance.<BR>
	  * It pairs each	element of ranks with each	element of suits,
	  * and produces one	of	the corresponding	card.
	  * @param ranks is an array containing all of the	card ranks.
	  * @param suits is an array containing all of the	card suits.
	  * @param values	is	an	array	containing all	of	the card	point	values.
	  */
   public Deck(String[] ranks, String[] suits,	int[]	values)
   {
      cards	= new	ArrayList<Card>();
   	
      for (int	i = 0;	i < suits.length;	i++)
      {
         String suit	= suits[i];
         for (int	j = 0; j< ranks.length;	j++)
         {
            String rank	= ranks[j];
            int value =	values[j];
            cards.add(new Card (rank, suit, value));	
         }
      }
   }  


	 /**
	  * Determines	if	this deck is empty (no undealt cards).
	  * @return	true if this deck	is	empty, false otherwise.
	  */
   public boolean isEmpty()
   {
      if (cards.size() == 0)
         return true;
      else
         return false;
   }

	 /**
	  * Accesses the number	of	undealt cards in this deck.
	  * @return	the number of undealt cards in this	deck.
	  */
   public int size()
   {
      return cards.size() - size;
   }

	 /**
	  * Randomly permute	the given collection	of	cards
	  * and reset the	size to represent	the entire deck.
	  */
   public void shuffle()
   {
      size = 0;
      for (int i = 0; i < 9999; i++)
      {
         Card temp = cards.get(0);
         int tempNum = (int) (Math.random() * cards.size());
         cards.set(0, cards.get(tempNum));
         cards.set(tempNum, temp);
      }
   }

	 /**
	  * Deals a	card from this	deck.
	  * @return	the card	just dealt,	or	null if all	the cards have	been
	  *			previously dealt.
	  */
	 
   public Card deal()
   {
   	  
      if (cards.size() != 0)
      {
         size++;
         return cards.get(size-1);
      }
      else
      {
         return null;
      } 
   } 
	 /**
	  * Generates and	returns a string representation of this deck.
	  * @return	a string	representation	of	this deck.
	  */
   @Override
    public String toString() {
      String rtn = "size = " + size + "\nDealt cards: \n";
   
      for (int k = size - 1; k >= 0; k--) {
         rtn = rtn + cards.get(k);
         if (k != 0) {
            rtn = rtn + ", ";
         }
         if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }
   
      rtn = rtn + "\nUndealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--) {
         rtn = rtn + cards.get(k);
         if (k != size) {
            rtn = rtn + ", ";
         }
         if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
            rtn = rtn + "\n";
         }
      }
   
      rtn = rtn + "\n";
      return rtn;
   }
}