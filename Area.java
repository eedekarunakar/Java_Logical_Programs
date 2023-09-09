
 import java.util.Scanner;
 class Area
 {
     public static void main (String args[])
     {
         
      Scanner sc=new Scanner(System.in);     
       int r;
       float pi=3.14f;
       float area;
       
       System.out.println("Enter Radius of Circle:");
       r=sc.nextInt();
       
       area=pi*r*r;
       
       System.out.println("The Area of the circle is:"+area);
      
     }
 }
