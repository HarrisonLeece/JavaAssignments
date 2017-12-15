// Harrison Leece period 5 Comsci A AP
// Inherits-A5: Question Classes (PP)
import java.util.Scanner;
import java.util.ArrayList;


/**
   This program shows a simple quiz with two choice questions.
*/
public class QuestionModified_Leece
{
   public static void main(String[] args)
   {
      ChoiceQuestion first = new ChoiceQuestion();
      first.setText("What was the original name of the Java language?");
      first.addChoice("*7", false);
      first.addChoice("Duke", false);
      first.addChoice("Oak", true);
      first.addChoice("Gosling", false);

      ChoiceQuestion second = new ChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);
      
      System.out.println("Numeric Question");
      NumericQuestion third = new NumericQuestion();
      third.setText("What is 3/2");
      third.setAnswer(3.0/2.0);
      
      System.out.println("Fill In Question");
      FillInQuestion fourth = new FillInQuestion();
      fourth.setText("Jet fuel can't melt steel _______.");
      fourth.setAnswer("beams");
      
      presentQuestion(first);
      presentQuestion(second);
      presentNumQuestion(third);
      presentFillInQuestion(fourth);
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(ChoiceQuestion q)
   {
      q.display();
      System.out.print("Your answer (String): ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
   public static void presentNumQuestion(NumericQuestion q)
   {
      q.display();
      System.out.print("Your answer (double): ");
      Scanner in = new Scanner(System.in);
      double response = in.nextDouble();
      System.out.println(q.checkAnswer(response));
   }
   public static void presentFillInQuestion(FillInQuestion q)
   {
      q.display();
      System.out.print("Your answer (String): ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
   
}

/**
   A question with a text and an answer.
*/
class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with empty question and answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equals(answer);
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.println(text);
   }
}
/**
   A question with multiple choices.
*/
class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
      }
   }
   
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
   }
}
class NumericQuestion extends Question
{
   private String text;
   private double answer;
   
   public NumericQuestion() 
   {
      text = "";
      answer = Integer.MAX_VALUE;
   }
   /*
   @Override
   */
   public void setAnswer(double correctResponse)
   {
      answer = correctResponse;
   }
   
   //@Override 
   public boolean checkAnswer(double response)
   {
      // small epsilon value for error correction error
      if((Math.abs((answer - response))) <= (0.01 + .00000000001) )
      {
         return true;
      } else
      {
         return false;
      }
      
   }
   
}

class FillInQuestion extends Question
{
   private String answer;
   private String text;
   
   public FillInQuestion()
   {
      text = "";
      answer = "";
   }
   
}