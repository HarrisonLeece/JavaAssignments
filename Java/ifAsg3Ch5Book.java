/*  Harrison leece Period 5 Computer Science 1 AP
If-Asg3: Ch 5 Book
R5.3 (describe the errors)
a. 'then' should be a pair of braces instead of the word 'then'
b. Missing  close parenthesis before first brace
c. if (x == 1) sing equal will set x to 1 instead of compare x to 1
d. IDK
e. Need if else and else statment for middle 2 if statments and last if statement respectivly

R5.4
a.  m
b.  n
c.  y
d.  x

R5.6
if (x < 0) { y = (x * -1)}
else {y = x }

R5.12
No

R5.19
Java compares the unicode values at certain points and compares them in order to determine lexicographic ordering, so unlike a dictionary capital letters and symbols matter.

R5.29
a.  false
b.  true
c.  true
d.  true
e.  false
f.  false
g.  false
h.  true

R5.31
a.  b = (n == 0);
b.  b = (n != 0);
c.  if ( n > 1 && n < 2 )
    {
      b = true;
    }
    else
    {
      b = false;
    }
    
d.  b != ( n > 1 && n < 2 )

*/
public class ifAsg3Ch5Book
{
   public static void main(String[] agonizingconvextfencehappydogtank)
   {
      // E5.7 tester
      E5dot7 lindypls = new E5dot7(8, 5, 3);
      System.out.println("" + (lindypls.inOrderChecker()));
      
      // E5.9 testerino
      
      E5dot9 lindywhy = new E5dot9("Bob", 10.50, 56);
      System.out.println("" + lindywhy.Paycheck());
   }
}
class E5dot7
{
   private int x;
   private int y;
   private int z;
   public E5dot7(int xprime, int yprime, int zprime)
   {
      x = xprime; 
      y = yprime;
      z = zprime;
   }
   
   public String inOrderChecker()
   {
      if ((y > x) && (z >= y))
      {
         return ("in order");
      }
      else 
      {
         if ( y <= x && z <= y)
         {
            return ("in order");
         }  
         else
         {
            return ("out of order");
         }
      }
   }
}
class E5dot9
{
   private String name;
   private double wage; 
   private double weekwage;
   
   public E5dot9(String entername, double enterwage, double hours )
   {
      wage = enterwage;
      name = entername;
      
      if ( hours < 40 )
      {
         weekwage = (wage * hours);
      } else
      {
         weekwage = ((wage * 40) + (wage * 1.5 * (hours - 40)));
      }
   }
   
   public double Paycheck()
   {
      return weekwage;
   }
}