import java.util.*;
public class Electricity
{
    public static void main(String args[])
    {
        int units;
        double billtopay=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of units for calculating electricity bill:");
        units=sc.nextInt();
        if(units<50)
        {
            billtopay=units*0.50;
            
        }
        else if(units<150)
        {
            billtopay=(50*0.50)+((units-100)*0.75);
        }
        else if(units<250)
        {
            billtopay=(50*0.50)+(50*0.75)+((units-150)*1.20);
        }
        else
        {
            billtopay=(50*0.50)+(50*0.75)*((units-200)*1.50);
        }
        System.out.println("the electricity bill for "+units+" is: "+billtopay);
    }
}