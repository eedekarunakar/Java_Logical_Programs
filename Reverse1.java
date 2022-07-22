import java.util.*;
public class Reverse1  
{    
    public static void main(String[] args) {  
      Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        //String string = "Dream big";    
            
        String reversedStr = "";    
            
          
        for(int i = str.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + str.charAt(i);    
        }    
            
        System.out.println("Original string: " + str);    
        
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}    