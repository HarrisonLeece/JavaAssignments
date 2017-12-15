// Harrison Leece Period 5 Comp Sci A AP
// Arrays-Asg1: Chapter 7 Book
/*
R7.1 (a, c, d, f)
a)
myFirstArray = new int[10];
for (int i = 0; i < 10; i++)
{
   myFirstArray[i] = i+1;
}
c)
myFirstArray = new int[10];
for (int i = 0; i <10; i++)
{
   myFirstArray[i] = (i+1)*(i+1);
}
d)
myFirstArray = new int[10];
for (int i = 0; i<10; i++)
{
   myFirstArray[i] = 0;
}
f)
myFirstArray = new int[10];
for (int i = 0; i < 10; i++)
{
   myFirstArray[i] = (i+1 % 2);
}

R7.2: a,h
a)  25

h)  -23

R7.3: a, d, h
a)  [1, 1, 2, 3, 4, 3, 2, 1, 0, -1]

d)  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

h)  [1, 3, 4, 5, 4, 4, 3, 2, 1, 0]

R7.5
import java.util.Arrays;
int[] array1 = [1,2,3,4,5,6,7,8,9,10]

int min = Arrays.stream(array1).min();
int max = Arrays.stream(array1).max();
System.out.println("Min = " + min);
System.out.println("Max = " + max);

R7.6
a)  No value into 0th cell

b)  no ammount of cells defined for values

*/

import java.util.Arrays;

public class Chapter7Asg1
{
   public static void main(String[] Args)
   {
      int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
      for (int i = 1; i < 5; i++)
      {
         a[i] = a[i + 1];
      }
      System.out.print(Arrays.toString(a));
   }
}