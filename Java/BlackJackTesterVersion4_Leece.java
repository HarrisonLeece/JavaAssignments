//Harrison Leece Period	5 AP CompSci
//Deck 

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *	This is a class that	tests	the Deck	class.
 */
public class BlackJackTesterVersion4_Leece	
{

	 /**
	  * The main method in this class checks the	Deck operations for consistency.
	  *	 @param args is not used.
	  */
   public static	void main(String[] args) 
   {
      String ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
      String suits[] = {"Diamonds","Clubs","Spades","Hearts"};
      int values[]	= {11,2,3,4,5,6,7,8,9,10,10,10,10};
      
      Scanner typeNum = new Scanner(System.in);
      Scanner typeString = new Scanner(System.in);
      
      
      
      System.out.println("Enter integer number of players");
      int numPlayers = typeNum.nextInt();
      String playerNames[] = new String[numPlayers];
      
      System.out.println();
      
      for (int i = 0; i < numPlayers; i++)
      {
         System.out.println("Enter player names");
         String playerNameScanner = typeString.nextLine();
         playerNames[i] = playerNameScanner;
      }
      
      
      
   	  
      Deck standardDeck = new Deck(ranks, suits, values);
      standardDeck.shuffle();
            
      Dealer blackJackGame = new Dealer(playerNames, standardDeck);
      
      
      System.out.println("Welcome to Blackjack Simulator 2015+1");
      System.out.println();
      
      Boolean running = true;
      
      
      
      while(running)
      {
         
         
         blackJackGame.printHand(numPlayers, standardDeck);
      
      
      
         
         System.out.println();
         
         System.out.println("\n \n");
         
         int stayCount = 0;
         int winnerIndex =0;
         int winnerTotal = blackJackGame.game.get(0).handTotal();
         for(int i = 0; i < blackJackGame.game.size(); i++)
         {
            if(blackJackGame.game.get(i).getStay())
            {
               stayCount++;
            }
         }
         for(int i = 0; i < blackJackGame.game.size(); i++)
         {
            if(blackJackGame.game.get(i).handTotal() > winnerTotal && blackJackGame.game.get(i).handTotal() <= 21)
            {
               winnerTotal = blackJackGame.game.get(i).handTotal();
               winnerIndex = (i);
            }
         }
         
         if(blackJackGame.game.size() == 1 || blackJackGame.game.size() == stayCount)
         {
            running = false;
            System.out.println("Player " + blackJackGame.game.get(winnerIndex).getName() + " wins.");
         } else
         {
            System.out.println("Next turn: \n");
         }
      }
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
   public int	pointValue;


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
    
    
    public List<Card> playerHand;

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
      // size = 0 refills deck
      size = 0;
      for (int i = 0; i < 999999; i++)
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
class Hand
{
   //probably should be public
   public int recountTotal;
   private int total;
   public List<Card> hand;
   //Must be private or OoB exception
   public int ace;
   private String name;
   private Boolean isStaying;
   
   
   public Hand(String nameFromArray, Card ini1, Card ini2)
   {
      hand = new ArrayList<Card>();
      hand.add(ini1);
      hand.add(ini2);
      total = 0;
      name = "defaultName";
      name = nameFromArray;
      for(int i = 0; i < hand.size(); i++)
      {
         total += (hand.get(i)).pointValue();
         if(hand.get(i).pointValue == 11)
         {
            ace++;
         }
      }
      recountTotal = total;
   }
   public int handTotal()
   {
      return recountTotal;
   }
   public Card getCard(int i)
   {
     return hand.get(i);
   }
   public int handSize()
   {
      return hand.size();
   }
   public int aceCount()
   {
      return ace;
   }
   public String getName()
   {
      return name;
   }
   public Boolean getStay()
   {
      return isStaying;
   }
 
  /**
  printHand() method calls this from Dealer class to
  This method is what runs most of the game and contains most of the game logic 
  If the player is staying that should be stored in the instance variable isStaying
  */
   public void hitOrStay(Deck blackJackDeck)
   {
      System.out.println("Score: " + recountTotal);
      Scanner typeHit = new Scanner(System.in);
      System.out.println("hit or stay?");
      String playerHitScanner = typeHit.nextLine();
      while(!playerHitScanner.equals("hit") && !playerHitScanner.equals("stay") && !isStaying)
      {
         
         System.out.println("hit or stay?");
         playerHitScanner = typeHit.nextLine();
      }
      if(playerHitScanner.equals("hit"))
      {
         isStaying = false;
         int tempScore = 0;  
         hand.add(blackJackDeck.deal());
         if (hand.get(hand.size()-1).pointValue == 11)
         {
            ace++;
         }
         System.out.println(hand.get((hand.size()-1)).toString());
         for (int i = 0; i < hand.size(); i++)
         {
            tempScore = tempScore + hand.get(i).pointValue();
         }
         recountTotal = tempScore;
         System.out.println("New score: " + recountTotal);
         
      } else
      {
         isStaying = true;
         int tempScore = 0;
         for (int i = 0; i < hand.size(); i++)
         {
            tempScore =tempScore + hand.get(i).pointValue();
         }
         recountTotal = tempScore;
      }
      if(recountTotal > 21 && ace > 0)
      {
         System.out.println("Ace reduced to 1 to prevent bust");
      } else if(recountTotal > 21)
      {
        System.out.println("You busted, you suck");
      }
      
   }
}

class Dealer
{
   public List<Hand> game;
   //private int leader;
   
   /**
   
   */
   public Dealer(String players[], Deck mainBlackJackDeck)
   {
      game = new ArrayList<Hand>();
      for(int i = 0; i < players.length; i++)
      {
         game.add(new Hand(players[i], mainBlackJackDeck.deal(), mainBlackJackDeck.deal()));  
      }   
   }
   
   /**
   From 0 to num players
   Prints out a players hand and asks for a hit
   
   Also checks to make sure your hand did not bust, and if it did because of an ace it will reduce the value of the ace to 1
   int ace is an instance variable created when the hand is first initialized from 2 cards by checking each card added to
   the hand and checking if it is an ace
   Any time an ace is dealt ace should increase by one and anytime the value of an ace must be kicked down ace will be decreased
   int i = the hand I want to affect with the bust class

   */
   public void printHand(int numPlayers, Deck blackJackDeck)
   {
      //k prevents an OoB exception by adding 1 to it while removing a card from array list then subtracting from the print statement under the first for loop
      int k = 0;
      for(int j = 0; j < numPlayers; j++)
      {  
         System.out.println("Player "+ (j+1) + " hand size: " + (game.get(j).handSize() - k));
         
         for(int i = 0; i < game.get(j).handSize(); i++)
         {
            System.out.println(game.get(j).getCard(i).toString());
         }
         game.get(j).hitOrStay(blackJackDeck);
         
         if(game.get(j).aceCount() < 1 && game.get(j).handTotal() > 21)
         {
            game.remove(j);
            k = k+1;
            //Prevents out of points error for more than 2 people
            j = j-1;
            numPlayers = numPlayers - 1;
            
         }
         else if(game.get(j).aceCount() >= 1 && game.get(j).handTotal() > 21)
         {
            game.get(j).recountTotal = game.get(j).handTotal() - 10;
            game.get(j).ace = game.get(j).aceCount() -1;
         }
            System.out.println("\n \n");
         }
   }
}
