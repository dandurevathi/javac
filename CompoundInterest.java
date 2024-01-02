import java.util.Scanner;
import java.lang.Math;

public class CompoundInterest{
  
   public static void main(String args[]){


      double p,r,t,c_interest; 
      p = 50000;
      r = 35;
      t = 4;
      System.out.print("Principal = "+p);
      System.out.print("Rate of Interest = "+r);
      System.out.print("Time = "+t);
      c_interest  = p*Math.pow(1 + (r/100.0), t); 
      System.out.print("Compound Interest = "+c_interest);
   }
}