// Harrison Leece Will Portman
// If-Asg6: Quizzer 2: Validate Entry Period 5 Comp Sci A AP

import java.util.Scanner;
/**
Tests the program
*/
public class ValidateEntry_TesterPoLeece
{
   public static void main(String[] WaffleChicken)
   {
      String playAgain = "Ayylmao";
      Scanner yesNo = new Scanner(System.in);
      
      Quizzer quiz = new Quizzer();
      quiz.askQuestions();
      quiz.displayResults();
      
      while (!playAgain.equals("y") && !playAgain.equals("n"))
      {
         System.out.println("Would you like to play again?? y/n\n");
         playAgain = yesNo.nextLine();
      }
    
      if (!playAgain.equals("n"))
      {
         quiz.askQuestions();
         quiz.displayResults();
      } else
      {
         System.out.println("Thanks for playing");
      }
   }
}
/**
Makes a quizzer object and .askQuestions() on that object to start the quiz and count score, as well as assess that score
*/
class Quizzer
{
   private double score;
   private double finScore;
   
   public Quizzer()
   {
      
   }
   /** 
   Asks questions to user when called on the Quizzer object
   
   Uses while loops to make sure a valid choice is input, and adds points for correct answers using if else statments
   */
   public void askQuestions()
   {
      Scanner answer = new Scanner(System.in);
      
      String input1 = "z";
      String input2 = "z";
      String input3 = "z";
      String input4 = "z";
      String input5 = "z";
      String input6 = "z";
      score = 0;
      finScore = 0;

      
      while (!input1.equals("a") && !input1.equals("b") && !input1.equals("c") && !input1.equals("d"))
      {
         System.out.println("\nWhich app is popular with teens for sending photos that disappear?:\nA. Instagram\nB. Grindr\nC. Snapchat\nD. FB\n");
         input1 = answer.nextLine();
      }
      if (input1.equals("c"))
         {
            score = score + 1;
         } else
         {
            score = score + 0;
         }

      
      while (!input2.equals("a") && !input2.equals("b") && !input2.equals("c") && !input2.equals("d"))
      {
         System.out.println("\nWhat is a meme?:\nA. A pervasive thought or thought pattern that replicates itself via cultural means; a parasitic code, a virus of the mind especially contagious to children and the impressionable\nB. A funny video or image on the internet\nC. A kind of Dog\nD. A kind of food popular with teens\n");
         input2 = answer.nextLine();
      }
      if (input2.equals("a"))
         {
            score = score + 1;
         } else
         {
            score = score + 0;
         }

      
      while (!input3.equals("a") && !input3.equals("b") && !input3.equals("c") && !input3.equals("d"))
      {
         System.out.println("\nWhich of the following is NOT popular with kids?:\nA. Reddit\nB. Youtube\nC. Facebook\nD. Myspace\n");
         input3 = answer.nextLine();
      } 
      if (input3.equals("d"))
         {
            score = score + 1;
         } else
         {
            score = score + 0;
         }
      
      while (!input4.equals("a") && !input4.equals("b") && !input4.equals("c") && !input4.equals("d"))
      {
         System.out.println("\nWhich of the following is the best definition for chill?:\nA. Cold\nB. A state of calm\nC. A state of euphoria\nD. A new meme\n");
         input4 = answer.nextLine();
      } 
      if (input4.equals("b"))
         {
            score = score + 1;
         } else
         {
            score = score + 0;
         }
      
      while (!input5.equals("a") && !input5.equals("b") && !input5.equals("c") && !input5.equals("d"))
      {
         System.out.println("\nChoose the BEST definition of 'savage':\nA. (Noun) The word the English refer to Americans as\nB. (Noun)A person who puts someone down for no ostensible reason\nC. (Adj.)An act that is either cool or hardcore, going beyond the normal scope of the given situation. \nD. (Noun) A person who cannot use a fork\n");
         input5 = answer.nextLine();
      }
      if (input5.equals("c"))
         {
            score = score + 1;
         } else
         {
            score = score + 0;
         }
      
      while (!input6.equals("a") && !input6.equals("b") && !input6.equals("c") && !input6.equals("d"))
      {
         System.out.println("\nWhat famous(ish) person said 'How Can Mirrors Be Real If Our Eyes Arn't Real':\nA. Jaden Smith\nB. Tom Cruise \nC. Hillary Clinton\nD. Mr.Lindemann\n");
         input6 = answer.nextLine();
      }
       if (input6.equals("a"))
         {
            score = score + 1;
         } else
         {
            score = score + 0;
         }

     
      finScore = score;
   }
   
   /**
   This is basically getScore also.  Will show how good the play is at the game when the game ends based on their final score.
   */
   public void displayResults()
   {
      if (score == 6)
      {
         System.out.println("\nYou are a master of teenage culture and society.\n");
      }
      
      else if (score == 5 || score == 4)
      {
         System.out.println("\nNot bad. You know a bit about teens.\n");
      }
      
      else
      {
         System.out.println("\nYour teen knowledge needs improvement.\n");
      }
      
   }

}