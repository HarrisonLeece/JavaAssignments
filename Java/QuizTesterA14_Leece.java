// Harrison Leece Period 5 CompSci A AP
// Inherits-A14: QuizMeasurable Bk\


public class QuizTesterA14_Leece
{
   public static void main(String[] potatos)
   {
      int numStudents = (int)(Math.random() * 10) + 10;
      Quiz[] quizArray;
      quizArray = new Quiz[numStudents];
      for(int i = 0; i < numStudents; i++)
      {
          quizArray[i] = new Quiz(Math.random()*30, 30);
      }
      
      System.out.println(Data.max(quizArray).getMeasure());
      System.out.println(((Quiz)Data.max(quizArray)).getGrade());
      System.out.println(Data.average(quizArray));
      
   }
}
interface Measurable
{
   double getMeasure();

}
class Quiz implements Measurable
{
   private double score;
   private String grade;
   private int scoreMax;
   
   public Quiz(double scoreInput, int scoreMaxInput)
   {
      score = scoreInput;
      scoreMax = scoreMaxInput;
      if(score/scoreMax * 100 >= 93)
      {
         grade = "A";
      } else if (score/scoreMax * 100 >= 90)
      {
         grade = "A-";
      } else if (score/scoreMax * 100 >= 87)
      {
         grade = "B+";
      } else if (score/scoreMax * 100 >= 83)
      {
         grade = "B";
      } else if (score/scoreMax * 100 >= 80)
      {
         grade = "B-";
      } else if (score/scoreMax * 100 >= 77)
      {
         grade = "C+";
      } else if (score/scoreMax * 100 >= 73)
      {
         grade = "C";
      } else if (score/scoreMax * 100 >= 70)
      {
         grade = "C-";
      } else if (score/scoreMax * 100 >= 67)
      {
         grade = "D+";
      } else if (score/scoreMax * 100 >= 63)
      {
         grade = "D";
      } else if (score/scoreMax * 100 >= 60)
      {
         grade = "D-";
      } else
      {
         grade = "F";
      }
       
   }
   public double getMeasure()
   {
      return score;
   }
   public String getGrade()
   {
      return grade;
   }
}

class Data
{
   public static Measurable max(Measurable[] objects)
   {
      Measurable max = objects[0];
      for(Measurable obj : objects)
      {
         if (obj.getMeasure() > max.getMeasure())
         {
            max = obj;
         }
      }
      return max;
   }
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for(Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if(objects.length > 0)
      {
         return sum/(objects.length);  
      } else
      {
         return 0;
      }
   }
}