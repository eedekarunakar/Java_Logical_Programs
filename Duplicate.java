import java.util.Scanner;
class Duplicate{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter array size:");
int size= sc.nextInt();
      System.out.println("enter elements");
      int arr[]=new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
           for(int i=0;i<size;i++)
             {
               for(int j=i+1;j<size;j++)
                 {
                   if(arr[i]==arr[j])
                   {
                     System.out.println("the duplicate elements are:"+arr[i]);
                   }
                 }
             }
        
        }

    }
