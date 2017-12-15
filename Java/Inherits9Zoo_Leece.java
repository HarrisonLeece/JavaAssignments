// Harrison Leece  Computer Science A AP
// Period 5 Inherits-A9: Zoo
import java.util.ArrayList;

public class Inherits9Zoo_Leece
{
   public static void main(String[] ARGUSafadjs)
   {
      ArrayList<Animal> zooArray = new ArrayList<Animal>();
      
      zooArray.add(new Hippo(1588, "Harry", 4));
      zooArray.add(new Hippo(4000, "BlackBeard", 3));
      zooArray.add(new Dog(40, "Cookie", 4));
      zooArray.add(new Cat(4, "Mittens", 4));
      zooArray.add(new Eagle(3, "Xerxes", 2));
      
      for (int i = 0; i < zooArray.size(); i++)
      {
         zooArray.get(i).speak();
      }
      
      
   }
}
abstract class Zoo
{
   public int day;
    
   public void incrementDay()
   {
      day++;
   }
}

class Animal extends Zoo
{
   private double kilogramsMass;
   private String species;
   private String name;
   private int numLegs;
   private boolean isFed;
   
   public Animal(double mass, String name, int numLegs)
   {
      isFed = true;
      kilogramsMass = mass;
      this.species = species;
      this.name = name;
      this.numLegs = numLegs;
   }
   public void speak()
   {
      System.out.print("I am " + name + " the ");
   }
   /*  Maybe later
   public void feed()
   {
      System.out.println( "You feed " + name);
   }
   */
}
class Hippo extends Animal
{
   String species = "Hippo(genus: Hippopotamus)";
   String animalName = "";
   public Hippo(double thisMass, String thisName, int thisNumLegs)
   {
      super(thisMass, thisName, thisNumLegs);
      animalName = thisName;
   }
   public void speak()
   {
      super.speak();
      System.out.println(species);
   }
}
class Dog extends Animal
{
   String species = "Dog(genus: Canis)";
   String animalName = "";
   public Dog(double thisMass, String thisName, int thisNumLegs)
   {
      super(thisMass, thisName, thisNumLegs);
      animalName = thisName;
   }
   public void speak()
   {
      super.speak();
      System.out.println(species);
      System.out.println("Bark bark ruff");
   }
}
class Cat extends Animal
{
   String species = "Cat(genus: Felis)";
   String animalName = "";
   public Cat(double thisMass, String thisName, int thisNumLegs)
   {
      super(thisMass, thisName, thisNumLegs);
      animalName = thisName;
   }
   public void speak()
   {
      super.speak();
      System.out.println(species);
      System.out.println("Meow");
   }
}
class Eagle extends Animal
{
   String species = "Eagle(genus: Aquila)";
   String animalName = "";
   public Eagle(double thisMass, String thisName, int thisNumLegs)
   {
      super(thisMass, thisName, thisNumLegs);
      animalName = thisName;
   }
   public void speak()
   {
      super.speak();
      System.out.println(species);
      System.out.println("SCREEEE, CAW");
   }
}