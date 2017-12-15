//Harrison Leece Period 4
// Calclus BC 2-1-4 Simpsons rule
import java.util.Scanner;

public class SimpsonsRuleTester_Leece
{
   public static void main(String[] ayylmao)
   {
      Scanner numInput = new Scanner(System.in);
      System.out.println("Upper bound:");
      double b = numInput.nextDouble();
      
      System.out.println("Lower bound:");
      double a = numInput.nextDouble();
      
      System.out.println("Precision:");
      double n = numInput.nextDouble();
      
      
      double h = (b - a) / n;
      double x;
      double r;
      char m = 0;
      double sum = 0.0;

      for (x = a; x <= b; x+=h) 
      {
         r = f(x);
         if (x == a || x == b)
         {
            sum += r;
         } else 
         {
            //m = !m;
            sum += r * (m+1) * 2.0;
         }
      }
        System.out.println( sum * (h/3.0));
   
   }
}