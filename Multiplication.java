import java.util.Scanner;

public class Multiplication
{
   public static void main(String args[])
{
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = reader.nextInt();
    for( int i=0;i<11;i++)
   {
   	System.out.print(num + " *" + i + "  = " + num*i + "\n");
    }

 }
}