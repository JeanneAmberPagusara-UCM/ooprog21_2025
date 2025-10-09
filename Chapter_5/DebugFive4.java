import java.util.*;
public class DebugFive4
{
   public static void main (String args[]) 
   {
      int one= 0;
      int two = 0;
      int three = 0;
      int four = 0;
      int highest;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      one = input.nextInt();
      System.out.print("Enter an integer >> ");
      two = input.nextInt();
      System.out.print("Enter an integer >> ");
      three = input.nextInt();
      System.out.print("Enter an integer >> ");
      four = input.nextInt();
      if(one > two && one > three && one > four)
         highest = one;
      else
         if(two > one && two > three && two > four)
            highest = two;
         else
           if(three == one && three > two && three > four)
              highest = three;
           else
              highest = four;
      System.out.println("The highest number is " + highest);
   }
}


