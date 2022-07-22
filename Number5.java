import java.util.Scanner;
public class Number5
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();  
    int i=n;
    while(i>=1)
        {
        System.out.print(i+" ");
          i--;
        }                        
    }
}