import java.util.*;
public class NumberOfWords{
 
    public static void main(String[] args) {
      int count = 0;
      Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
     for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}
 