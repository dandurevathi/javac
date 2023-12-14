import java.util.Scanner;

public class Leapyear
   {
      public static void main(String args[])
      { 
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter the year: ");
        int year = reader.nextInt();
       
        if(year%400==0)
        {
           System.out.print("Entered year is leap year\n");
        }
        else if(year%4 ==0 && year%100 ==0)
        {
          System.out.print("Entered year is leap year\n");
        }
        else
        {
          System.out.print("Entered year is not leap year\n");
        }
    }
}