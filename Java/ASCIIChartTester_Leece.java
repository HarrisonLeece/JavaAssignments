//Harrison Leece period 5 CompSci A AP
// Loops-Asg3: ASCII Chart
/**
Tests ASCII class by creating a default ASCII constructor and calling .printChart()
*/
public class ASCIIChartTester_Leece
{
   public static void main(String[] bubberducky)
   {
      ASCII testerino = new ASCII();
      
      testerino.printChart();     
   }
}
/**
Constructs ASCII.  printChart() method can be called on ASCII and print out an Decimal-ASCII equivalent character table from 32-128
*/
class ASCII
{
   public ASCII()
   {
   
   }
   
   public void printChart()
   {
      int reallyCoolSpecialUltraNumberThingGuyDude = 32;
      System.out.println(" ________________________________");
      for (int i = 1; i <= 24; i++)
      {
         System.out.print("|");
         for(int j = 1 ; j <= 4; j++)
         {
            if (reallyCoolSpecialUltraNumberThingGuyDude < 100)
            {
               System.out.print(reallyCoolSpecialUltraNumberThingGuyDude + " " + (char) reallyCoolSpecialUltraNumberThingGuyDude + "    " );
               reallyCoolSpecialUltraNumberThingGuyDude++;
            } 
            else
            {
               System.out.print(reallyCoolSpecialUltraNumberThingGuyDude + " " + (char) reallyCoolSpecialUltraNumberThingGuyDude + "   " );
               reallyCoolSpecialUltraNumberThingGuyDude++;
            }
         }
         System.out.print("|");
         System.out.println("");
      }
      System.out.print("|" + reallyCoolSpecialUltraNumberThingGuyDude + " ");
      System.out.print(((char) 128) + "                           |"); 
      System.out.println("\n --------------------------------");
   }
}