/* Harrison Leece Period 5 Comp Sci A AP  Loops-Asg1: Ch 6 Book


R6.1b
int n = 1;
while ( n < 100)
{
   if ( (n % 10) == 0)
   {
      System.out.print("" + n + ", ");
      n=n+1;
   } else
   {
      n=n+1;
   }      
}

R6.2b or R6.2c
int i = 100;
int finalNum = 0;

for (int n = i; n>=4; n--)
{

   if ( math.sqroot(n) % 1 == 0)
   {
      finalNum = (finalNum + n);
   }else
   {
      finalNum = (finalNum + 0);
   }
}

R6.4a, c, f
a) 1 2 3 4 6 7 8 9 
c) 10 9 8 7 6 5 4 3 2 
f) -10 -8 -6 -4 -2 0 2 4 6 8 10

R6.10a, d, g
a) 10
d) 20
g) 7 I think

R6.11
Print header
for  x from 1 to 7
   Print table row
   Print newline
   Print table row
   Print newline
   Print table row
   Print newline   
   Print table row
   Print newline
I actually have no idea

R6.15
int s = 0;
int i = 1
while (i <=10)
{
   s = s+i;
   i++;
}

R6.16
 int n = in.nextInt();
 double x = 0;
 double s = 1.0 / (1 + n * n);
 n++;
 x=x+s;
 while (s > 0.01)
 {
    s = 1.0 / (1 + n * n);
    n++;
    x = x + s;
 }

R6.19b,d
b) probably 1 or something
d) 1337

R6.27
for (int i = 1; i <= height*width; i++)
{
   if (i%3 = 0)
   {
      System.out.println("");
   } else
   {
      System.out.println("*");
   }
}

then do the running Java program that satisfies both:
E6.9
E6.15

*/
public class LoopsAsg1Tester_Leece
{
   public static void main(String[] bakedpotato)
   {
      //Prints input backwards
      ESixNine potato = new ESixNine("Hello World");
      
      System.out.println(potato.printOut());
      System.out.println();
      System.out.println("E9.15");

      
      //E9.15 makes a box for some reason
      int height = 5;
      int width = 5;
      
      for (int i = 1; i <= height; i++)
      {
         for (int j=1; j<=width; j++)
         {
            System.out.print("*");
         }
         System.out.println("");
      }
      
      System.out.println();
      
      for (int i = 1; i <= height; i++)
      {
         for (int j=1; j<=width; j++)
         {
            if (i==1 || i==height)
            {
               System.out.print("*");
            } else if (i>1 && i<height)
            {
               String spaces = String.format("%"+(width-2)+"s", ""); //Thank god for StackOverflow
               j=j+3;
               System.out.print("*" + spaces);
            } else
            {
               System.out.print("*");
            }
         }
         System.out.println("");
      }
      System.out.println("Close enough");
      
      //Math tester
      //System.out.println("" + 0);
   }
}
class ESixNine
{
   private String input = "";
   private StringBuffer reverse = new StringBuffer(input.length());
   
   public ESixNine(String input)
   {
      input = input;
      int originalLength = input.length();
      
      for (int i =input.length()-1; i >= 0; i--) 
      {            
         System.out.print(input.charAt(i));          
      }
   }
   
   public StringBuffer printOut()
   {
      return reverse;
   }
}
class ESixFifteen
{
   public ESixFifteen()
   {
      
   }
}