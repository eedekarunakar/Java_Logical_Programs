import java.util.Scanner;

public class AlternateElement {
 public static void main(String[] args) {
  int i, n;
  Scanner scan = new Scanner(System.in);
  System.out.print("How many numbers? \t");
  n = scan.nextInt();
  int a[] = new int[n];
  for (i = 0; i < n; i++) {
   System.out.print("Enter number " + (i + 1));
   a[i] = scan.nextInt();
  }
  scan.close();
  System.out.print("\nOriginal array is :\t");
  for (i = 0; i < n; i++)
   System.out.print(a[i] + "\t");

  System.out.print("\n\nAlternate elements :\t");
  for (i = 0; i < n; i = i + 2)
   System.out.print(a[i] + "\t");
 }
}