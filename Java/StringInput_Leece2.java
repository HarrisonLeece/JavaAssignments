/*Harrison Leece Computer Science A AP
Types assignment 2: Sting input */

import java.util.Scanner;

public class StringInput_Leece2
{
   public static void main(String[] d)
   {
      Scanner typeName = new Scanner(System.in);
      
      System.out.println("Enter your first name:");
      String nameFirst = typeName.nextLine();
      System.out.println("Enter your last name:");
      String nameLast = typeName.nextLine();
      
      System.out.println ("Your name is " + nameFirst + " " + nameLast + "\n \"Do it, just do it! Don’t let your dreams be dreams\"\n -Shia Labeouf intense motivational speech");
      /* R2.8 */
      String hello = ("hello");
      String helloUpper = hello.toUpperCase();
      System.out.println(helloUpper);
   }
}

/* R2.10 
An object is like an instance of a class, and an object variable is like an instance of an object.  Multiple object variables could referance one object.  Basically class-ception. */

/* R2.16
a)  Should be : Rectangle r = new (5, 10 15, 20);  needs the "new"
b)  A "Rectangle" object needs to be defined already.  Should be: double width = r.getWidth();
c)  Rectange 'r' needs to be defined first.
d)  You cant use a string for the translate() meathod, two integers required.
*/