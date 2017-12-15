// Harrison Leece Period 5
// AList-Asg2: ArrayList Book Program
import java.util.ArrayList;

public class ArrayListTester_Leece
{   
   public static void main(String[] args)
   {
      Bell harrison = new Bell(216217);
      Bell nick = new Bell(216218);
      Bell travis = new Bell(216219);
      Bell gabe = new Bell(216420);
      Bell jensen = new Bell(216221);
      Bell drew = new Bell(216222);
      Bell evan = new Bell(216223);
      Bell michael = new Bell(216224);
      Bell ian = new Bell(216225);
      Bell harry = new Bell(216226);
      
      ArrayList<Bell> list = new ArrayList<Bell>();
      
      list.add(harrison);
      list.add(nick);
      list.add(travis);
      list.add(gabe);
      list.add(jensen);
      list.add(drew);
      list.add(evan);
      list.add(michael);
      list.add(ian);
      list.add(harry);
      
      /* Prints intitial array  */
      for (int i=0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
      System.out.println();
      
      // Initialize new Array exactly like first one
      ArrayList<Bell> alist = new ArrayList<Bell>();
      
      alist.add(harrison);
      alist.add(nick);
      alist.add(travis);
      alist.add(gabe);
      alist.add(jensen);
      alist.add(drew);
      alist.add(evan);
      alist.add(michael);
      alist.add(ian);
      alist.add(harry);
      
      System.out.println("a) switch the first and last element");     
      Bell temp = alist.get(alist.size()-1);
      alist.set((alist.size()-1) , alist.get(0));
      alist.set(0, temp);
      for (int i=0; i < alist.size(); i++)
      {
         System.out.println(alist.get(i));
      }
      
      System.out.println();
      
      
      // Initialize new Array exactly like first one
      ArrayList<Bell> blist = new ArrayList<Bell>();
      
      blist.add(harrison);
      blist.add(nick);
      blist.add(travis);
      blist.add(gabe);
      blist.add(jensen);
      blist.add(drew);
      blist.add(evan);
      blist.add(michael);
      blist.add(ian);
      blist.add(harry);
      
      System.out.println("b)");
      temp = blist.get(blist.size()-1);
      blist.add(0, temp);
      blist.remove(blist.size()-1);
      
      
      for (int i=0; i < blist.size(); i++)
      {
         System.out.println(blist.get(i));
      }
      System.out.println();
      
      
      // Initialize new Array exactly like first one
      ArrayList<Bell> clist = new ArrayList<Bell>();
      
      clist.add(harrison);
      clist.add(nick);
      clist.add(travis);
      clist.add(gabe);
      clist.add(jensen);
      clist.add(drew);
      clist.add(evan);
      clist.add(michael);
      clist.add(ian);
      clist.add(harry);
      
      System.out.println("c)");
      Bell zero = new Bell(216222);
      for (int i = 0; i < clist.size(); i++)
      {
         if (i%2 != 0)
         {
            clist.set(i, zero);
         } 
      }
      for (int i=0; i < clist.size(); i++)
      {
         System.out.println(clist.get(i));
      }
      System.out.println();
      
      // Initialize new Array exactly like first one
      ArrayList<Bell> dlist = new ArrayList<Bell>();
      
      dlist.add(harrison);
      dlist.add(nick);
      dlist.add(travis);
      dlist.add(gabe);
      dlist.add(jensen);
      dlist.add(drew);
      dlist.add(evan);
      dlist.add(michael);
      dlist.add(ian);
      dlist.add(harry);
      
      System.out.println("d)");
      temp = alist.get(0);
      
      for (int i = 1; i < dlist.size()-1; i++)
      {
         if (temp.id() > dlist.get(i).id() && temp.id() > dlist.get(i+1).id())
         {
            dlist.set(i, temp);
         } else if (temp.id() > dlist.get(i).id() && temp.id() < dlist.get(i+1).id())
         { 
            dlist.set(i, dlist.get(i+1));
         } else
         {
            dlist.set(i, dlist.get(i));
         }
         temp = dlist.get(i);
      }
      
      for (int i=0; i < dlist.size(); i++)
      {
         System.out.println(dlist.get(i));
      }
      System.out.println();
      
      // Initialize new Array exactly like first one
      ArrayList<Bell> elist = new ArrayList<Bell>();
      
      elist.add(harrison);
      elist.add(nick);
      elist.add(travis);
      elist.add(gabe);
      elist.add(jensen);
      elist.add(drew);
      elist.add(evan);
      elist.add(michael);
      elist.add(ian);
      elist.add(harry);
      
      System.out.println("e)");
      elist.remove(elist.size()/2);
      elist.remove(elist.size()/2 +1);
      for (int i=0; i < elist.size(); i++)
      {
         System.out.println(elist.get(i));
      }
      System.out.println();
      
      // Initialize new Array exactly like first one
      ArrayList<Bell> flist = new ArrayList<Bell>();
      
      flist.add(harrison);
      flist.add(nick);
      flist.add(travis);
      flist.add(gabe);
      flist.add(jensen);
      flist.add(drew);
      flist.add(evan);
      flist.add(michael);
      flist.add(ian);
      flist.add(harry);
      
      System.out.println("f)");
      for (int i=1; i < flist.size(); i++)
      {
         if(flist.get(i).id() % 2 == 0)
         {
            if (i == 1)
            {
               flist.add(0, flist.get(i));
               //flist.remove(i);
               
            } else
            {
               flist.add(0, flist.get(i));
               flist.remove(i-1);
            }
         }
      }
      flist.remove(flist.size()-1);
      for (int i=0; i < flist.size(); i++)
      {
         System.out.println(flist.get(i));
      }
      System.out.println();
      
      // Initialize new Array exactly like first one
      ArrayList<Bell> glist = new ArrayList<Bell>();
      
      glist.add(harrison);
      glist.add(nick);
      glist.add(travis);
      glist.add(gabe);
      glist.add(jensen);
      glist.add(drew);
      glist.add(evan);
      glist.add(michael);
      glist.add(ian);
      glist.add(harry);
      
      // g
      int biggest = glist.get(0).id();
      int secondBiggest = glist.get(0).id();
      for (int i=0; i < glist.size(); i++)
      {
         if (glist.get(i).id() > biggest)
         {
            biggest = glist.get(i).id();
         } else if (glist.get(i).id() > secondBiggest && glist.get(i).id() < biggest)
         {
            secondBiggest = glist.get(i).id();
         } else
         {
            i = i;
         }
      }
      System.out.println("g)");
      System.out.println(secondBiggest);  
      System.out.println();
            
      // Initialize new Array exactly like first one
      ArrayList<Bell> jlist = new ArrayList<Bell>();
      
      jlist.add(harrison);
      jlist.add(nick);
      jlist.add(travis);
      jlist.add(gabe);
      jlist.add(jensen);
      jlist.add(drew);
      jlist.add(evan);
      jlist.add(michael);
      jlist.add(ian);
      jlist.add(harry);
      
      System.out.println("j)");
      int temporaryMarkTwo;
      boolean isDup = false;
      for (int j=0; j < jlist.size(); j++)
      {
         temporaryMarkTwo = jlist.get(j).id();
         for (int i=0; i < jlist.size(); i++)
         {
            if (temporaryMarkTwo == jlist.get(i).id() && j!=i)
            {
               isDup = true;
            }
         }
      }
      System.out.println(isDup);
      
      
   }
}

class Bell 
{

  private int studentId;

  public Bell( int id )
  {
     studentId = id;
  }

  public int id()
  {
     return studentId;
  }

  public int compareTo( Bell otherBell )
  {
     return this.id() - otherBell.id();
  }
  public String toString() 
  {
     return "" + studentId;
  }
} 