import java.util.Scanner;
public class CountAlphabets{
public static void main(String args[]){

    String str;
int Alphabets=0,num=0,space=0,Special=0;

 Scanner scan=new Scanner(System.in); 
   
    
System.out.println("Enter the String  ");
str=scan.nextLine();
for(int i=0; i<str.length(); i++){
char ch=str.charAt(i);
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){  
    Alphabets++;
}
else if(ch>='0' && ch<='9'){ 
    num++;
}
else if(ch ==' '){ 
    space++;
}
else{   
    Special++;
}
}
System.out.println("\nAlphabet letters: "+Alphabets);
System.out.println("Number: "+num);
System.out.println("Space: "+space);
System.out.println("Special characters: "+Special);
}
}