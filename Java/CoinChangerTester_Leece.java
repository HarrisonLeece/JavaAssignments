// Harrison Leece period 5 TypesA2: Bell Market Coiun Changer

import java.util.Scanner;

public class CoinChangerTester_Leece
{
   public static void main(String[] bananas)
   {
      Scanner doshInput = new Scanner(System.in);
      
      System.out.println("Total sale ammount:");
      double doshNeeded = doshInput.nextDouble();
      
      System.out.println("Total ammount received:");
      double doshReceived = doshInput.nextDouble();
      
      CoinChanger bellMarketCoinChanger = new CoinChanger(doshNeeded, doshReceived);
      
      
      
      /* The following code was used to help test the program, but are ultimatly not used in the final program. Included to make future debugging easier */
      /* tests optimal # of quarters that must be returned to customer, the dollars are multiplied by 4 and added to the getQuarter value because the bell market guy is an
         idiot who only returns quarters to the customer for some contrived reason*/
      System.out.println("Quarters: " + bellMarketCoinChanger.getQuarters());
   
      /* tests optimal # of dimes that must be returned to customer, should never be more than 2 */
      System.out.println("Dimes: " + bellMarketCoinChanger.getDimes());
      
      /* tests optimal # of nickles that must be returned, should never be more than 1 */
      System.out.println("Nickles: " + bellMarketCoinChanger.getNickles());
      
      /* tests optimal # of pennies that must be returned, should never be more than 4 */
      System.out.println("Pennies: " + bellMarketCoinChanger.getPennies());
      
   }
}
class CoinChanger
{
   private double change;
   private int quartersReturned;
   private int dimesReturned;
   private int nicklesReturned;
   private int penniesReturned;
   private int dollarsReturned;
   final static int QUARTER_VALUE = 25;
   final static int DIME_VALUE = 10;
   final static int NICKLE_VALUE = 5;
   final static int PENNY_VALUE = 1;
   
   public CoinChanger(double doshNeeded, double doshReceived)
   {
      change = doshReceived - doshNeeded;
      dollarsReturned = (int) change;
      quartersReturned = (int) (((change * 100.0) % 100) -  QUARTER_VALUE);
      dimesReturned = (int) ((((change * 100) % 100) - (quartersReturned * QUARTER_VALUE)) / DIME_VALUE);
      nicklesReturned = (int) ((((change * 100) % 100) - (quartersReturned * QUARTER_VALUE) - (dimesReturned * DIME_VALUE)) / NICKLE_VALUE);
      penniesReturned = (int) ((((change * 100) % 100) - (quartersReturned * QUARTER_VALUE) - (dimesReturned * DIME_VALUE) - (nicklesReturned * NICKLE_VALUE)) / PENNY_VALUE);
   }
   
   /* The following methods were used to help test the program, but are ultimatly not used in the final program. Included to make future debugging easier */
   public String getQuarters()
   {
      return ("" + (quartersReturned + (dollarsReturned * 4) ));
   }
   public String getDimes()
   {
      return ("" + dimesReturned);
   }
   public String getNickles()
   {
      return ("" + nicklesReturned);
   }
   public String getPennies()
   {
      return ("" + penniesReturned);
   }
}