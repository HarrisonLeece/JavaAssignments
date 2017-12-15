//	Harrison	Leece	Period 6	Comp Sci	A AP
//	Loops-Asg5:	Turtle run

import acm.graphics.GTurtle;
import acm.graphics.GObject;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

import javax.swing.JOptionPane;
/**
Initializes	3 turtles and races them.	When all	3 cross the	finish line, the winner	starts his victory dance.
*/
public class GRacing_Leece extends GraphicsProgram
{
	
   public static void main(String[]	args)
   {
      new GRacing_Leece().start(args);
   }
   public void	run()
   {
      String input =	JOptionPane.showInputDialog( "Enter number of turtles");
      int numTurtles	= Integer.parseInt(input);
      System.out.println("# "	+ numTurtles);
   	
      GLine	finishLine = new GLine(600, 1000, 600,	0 );
      add (	finishLine );
   	
      GTurtle[] turtleArray =	new GTurtle[numTurtles];
   	
      for (int	i = 0; i	< numTurtles; i++)
      {
         turtleArray[i]	= new	GTurtle(50,	(i*100)+	100);
         add( turtleArray[i] );
      }
   	
   
   	
   	/*	firstNum	indicates the index of the turtle that crossed the finishline first, initializes at -1 */
      int firstNum = -1;
      
      int breakNum = 0;
      for (int i = 0; i < numTurtles-1; i++)
      {
         breakNum += i;
      }
      
      boolean running =	true;
   	
      
      whileLoop:
         while	(running == true)
         {
            for (int	i = 0; i	< numTurtles; i++) 
            {
               if	(turtleArray[i].getX() < 610)
               {
                  turtleArray[i].forward((Math.random()*80)	+ 20);
               } 
               else if (firstNum == -1)
               {
                  /*	Assigns the	number of the turtle	to	firstNum	if	that turtle	crosses the	finish line	first	*/
                  firstNum = i;
                  turtleArray[i].forward(0);
               } 
               else
               {
                  turtleArray[i].forward(0);
               }
            } 
            int k = 0;
            for (int i = 0; i< numTurtles; i++)
            {            
               if ( turtleArray[i].getX() > 610)
               {
                  k += i;
               }
               if (k == breakNum)
               {
                  
                  running = false;
                  break whileLoop;
               } 
            }
         }
   	//Victory dance (might be broken)
      
      turtleArray[firstNum].setLocation(300, 300);
      turtleArray[firstNum].setSize(200);
      while(true)
      {
         turtleArray[firstNum].right(10);
      }
   }
}