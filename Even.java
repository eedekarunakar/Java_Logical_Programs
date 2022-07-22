import java.util.*;
//creating class
public class Even
  {
    //main method
    public static void main(String args[])
    {
      int a;
      System.out.println("enter value");
      //scanner class
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      //if statement
      if(a%2==0)
      
        System.out.println("given number is even");
      
      else
        
        System.out.println("given number is odd");
      
    }
  }