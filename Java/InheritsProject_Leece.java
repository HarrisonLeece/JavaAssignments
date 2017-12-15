// Harrison Leece period 5 Comp Sci A AP
// Inherits assign 7: Inheritance Project
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class InheritsProject_Leece
{
   public static void main(String[] arguments)
   {
      int year;
      int month;
      int day;
      int type;
      
      String description;
            
      ArrayList<Appointment> appointments = new ArrayList<Appointment>();
      Scanner input = new Scanner(System.in);
      
      
      System.out.println("Make an appointment:");
      System.out.println("Choose type of appointment, 1 for daily, 2 for monthly, and 3 for one time");
      type = input.nextInt();
      System.out.println("Input desired year of appointment");
      year = input.nextInt();
      System.out.println("Input desired month of appointment");
      month = input.nextInt();
      System.out.println("Input desired day of appointment");
      day =  input.nextInt();
      System.out.println("Input desired description of appointment");
      
      input.nextLine();
      description = input.nextLine();
      
      
      if (type == 1)
      {
         appointments.add(new DailyAppointment(year, month, day, description));
      }else if (type == 2)
      {
         appointments.add(new MonthlyAppointment(year, month, day, description));
      } else
      {
         appointments.add(new Appointment(year, month, day, description));
      }
      
      System.out.println("Check for appointments:");
      
      System.out.println("Input desired year you want to check");
      year = input.nextInt();
      System.out.println("Input desired month you want to check");
      month = input.nextInt();
      System.out.println("Input desired day you want to check");
      day =  input.nextInt();
      for(int i = 0; i < appointments.size(); i++)
      {
      
         
         if(appointments.get(i).occursOn(year, month, day))
         {
            System.out.println(appointments.get(i).toString());
         }

      }
      
      
   }
}

/**
   A class to keep track of a single appointment.
*/
class Appointment
{
   private String description;
   private int year;
   private int month;
   private int day;

   /**
      Initializes appointment for a given date.
      @param year the year
      @param month the month
      @param day the day
      @param description the text description of the appointment
   */
   public Appointment(int year, int month, int day, String description)
   {
      this.year = year;
      this.month = month;
      this.day = day;
      this.description = description;
   }

   /**
      Returns the year of the appointment.
      @return the year
   */
   public int getYear()
   {
      return year;
   }

   /**
      Returns the month of the appointment.
      @return the month
   */
   public int getMonth()
   {
      return month;
   }

   /**
      Returns the day of the appointment.
      @return the day
   */
   public int getDay()
   {
      return day;
   }

   /**
      Determines if the appointment is on the date given.
      @param year the year to check
      @param month the month to check
      @param day the day to check
      @return true if the appointment matches all three parameters
   */
   public boolean occursOn(int year, int month, int day)
   {
      return (year == this.year) && (month == this.month) && (day == this.day);
   }

   /**
      Converts appointment to string description.
   */
   public String toString()
   {
      return description;
   }
}
class DailyAppointment extends Appointment
{
   
   public DailyAppointment(int theYear, int theMonth, int theDay, String theDescription)
   {
      super(theYear, theMonth, theDay, theDescription);
   }
   
   
   public boolean occursOn(int theYear, int theMonth, int theDay)
   {
      return ((getYear() >= theYear) && (getMonth() >= theMonth));
   }

}
class MonthlyAppointment extends Appointment
{
   public MonthlyAppointment(int theYear, int theMonth, int theDay, String theDescription)
   {
      super(theYear, theMonth, theDay, theDescription);
   }
   
   public boolean occursOn(int theYear, int theMonth, int theDay)
   {
      return ((getYear() >= theYear) && (getDay() >= theDay));
   }
}