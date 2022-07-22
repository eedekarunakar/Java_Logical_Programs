import java.util.Scanner;
public class Natural
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();  
    int i=0;
    while(i<=n)
        {
        System.out.print(i+" ");
          i++;
        }                        
    }
}