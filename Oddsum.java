import java.util.*;
 
public class Oddsum {
    public static void main(String args[]) {
        int n, i, sum = 0;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n= in.nextInt();
 
        for(i = 0; i <= n; i++){
            if((i%2) == 1){
                sum += i;
            }
        }
     
        System.out.print("Sum of all odd numbers between 0 to " + n + " = " + sum);
    }
}