import java.util.Scanner;
class Evensum{
public static void main (String args[]){
int i,num;  
int evenSum=0;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number for num:");
num=scan.nextInt();

i=0;
while(i<=num){  
if(i%2==0) 
    evenSum=evenSum+i;
 i++;
}
System.out.println("Sum of all even numbers are: "+evenSum);
}
}