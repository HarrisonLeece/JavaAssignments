// Harrison Leeece & Will Portman
// period 5 Comp Sci If_Asg Quiz(pt 1)
//Quiz on teen vernacular

import java.util.Scanner;

public class TeenQuizTester_PoLeece
{
   public static void main(String[] arg)
   {   
      System.out.println("Make sure to only enter the lowercase letter you want to submit in order to get points\n");
      TeenQuiz quiz = new TeenQuiz();
      quiz.askQuestions();
      
      System.out.println("" + quiz.outputScore());
      
   }
}
class TeenQuiz
{
   private int score;
   private int finScore;
   
   public TeenQuiz()
   {
      System.out.println("This is a quiz to test you on your knowledge of teenage vernacular.\nScores...\n4--6: Mastery\n2--4: Base Knowledge\n0--1: Incompetence\n");
   }
   
   public void askQuestions()
   {
      Scanner answer = new Scanner(System.in);
      System.out.println("Which app is popular with teens for sending photos that disappear?:\nA. Instagram\nB. Grindr\nC. Snapchat\nD. FB");
      String input1 = answer.nextLine();
      
      if (input1.equals("a"))
      {
         score = score + 1;
      } else
      {
         score = score + 0;
      }
      
      System.out.println("What is a meme?:\nA. A pervasive thought or thought pattern that replicates itself via cultural means; a parasitic code, a virus of the mind especially contagious to children and the impressionable\nB. A funny video or image on the internet\nC. A kind of Dog\nD. A kind of food popular with teens");
      String input2 = answer.nextLine();
      
      if (input2.equals("b") || input2.equals("a"))
      {
         score = score + 1;
      } else
      {
         score = score + 0;
      }
      
      System.out.println("Which of the following is NOT popular with kids?:\nA. Reddit\nB. Youtube\nC. Facebook\nD. Myspace");
      String input3 = answer.nextLine();
      
      if (input3.equals("a"))
      {
         score = score + 1;
      } else
      {
         score = score + 0;
      }
      
      System.out.println("Which of the following is the best definition for chill?:\nA. Cold\nB. A state of calm\nC. A state of euphoria\nD. A new meme");
      String input4 = answer.nextLine();
      
      if (input4.equals("b"))
      {
         score = score + 1;
      } else
      {
         score = score + 0;
      }
      
      System.out.println("Choose the BEST definition of 'savage':\nA. (Noun) The word the English refer to Americans as\nB. (Noun)A person who puts someone down for no ostensible reason\nC. (Adj.)An act that is either cool or hardcore, going beyond the normal scope of the given situation. \nD. (Noun) A person who cannot use a fork");
      String input5 = answer.nextLine();
      
      if (input5.equals("c"))
      {
         score = score + 1;
      } else
      {
         score = score + 0;
      }
      
      System.out.println("What famous(ish) person said 'How Can Mirrors Be Real If Our Eyes Arn't Real':\nA. Jaden Smith\nB. Tom Cruise \nC. Hillary Clinton\nD. Mr.Lindemann");
      String input6 = answer.nextLine();
      
      if (input6.equals("a"))
      {
         score = score + 1;
      } else
      {
         score = score + 0;
      }
      finScore = score;
   }
   public int outputScore()
   {
      return finScore;
   }
}