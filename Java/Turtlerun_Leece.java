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
public class Turtlerun_Leece extends GraphicsProgram
{
	
	public static void main(String[]	args)
	{
		new Turtlerun_Leece().start(args);
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
		
	
		
		/*	firstNum	indicates the turtle	that crossed the finishline first */
		int firstNum =	0;
		boolean running =	true;
		
		while	(running)
		{
			for (int	i = 0; i	< numTurtles; i++) 
			{
				if	(turtleArray[i].getX() < 610)
				{
					turtleArray[i].forward((Math.random()*80)	+ 20);
				} 
				else
				{
					turtleArray[i].forward(0);
				}
			} 
		
			/*	Assigns the	number of the turtle	to	firstNum	if	that turtle	crosses the	finish line	first	*/
			
			pause(300);				  
		}
		//Victory dance
		
	
	}
}
