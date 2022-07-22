import java.util.*;
class Bank
{
Scanner sc=new Scanner(System.in);
int ch;
int Customer_ID;
String Customer_Name;
String Customer_DOB;
int Mobile_Number;
String Address;
long Aadhar_Id;
String Type_of_Account;
String Date_of_Opening;
int Deposite_Amount;
String Nominee_Name;
Bank()
{
System.out.println("State Bank of India");
System.out.println("-------------------");
System.out.println("[1].New Account Opening");
System.out.println("[2].Amount Deposite");
System.out.println("[3].Amount Withdraw");
System.out.println("[4].Balance Enquiry");
System.out.println("[5].Pin Validation");
System.out.println("[6].Display Customer Information");

 System.out.println("Enter Your Choice:");
ch=sc.nextInt();
switch(ch)
{
case 1:
account_Open();
break;
case 2:
amount_Deposite();
break;
case 3:
amount_Withdraw();
break;
case 4:
balance_enquiry();
    break;
//case 5:
//pin_Validation();
    //break;
  case 6:
  display_customerinfo();
    break;
default:
System.out.println("Wrong Choice");
}
}
void account_Open()
{
System.out.println("Enter Customer ID:");
Customer_ID=sc.nextInt();
System.out.println("Enter Customer Name:");
Customer_Name=sc.next();
System.out.println("Enter Customer Date of Birth:");
Customer_DOB=sc.next();
System.out.println("Enter Customer Mobile Number:");
Mobile_Number=sc.nextInt();
System.out.println("Enter Customer Address:");
Address=sc.next();
System.out.println("Enter Customer Aadhar ID Number:");
Aadhar_Id=sc.nextLong();
System.out.println("Enter Type of Account:");
Type_of_Account=sc.next();
System.out.println("Enter Account Data of Opening:");
Date_of_Opening=sc.next();
System.out.println("Enter Deposite Amount:");
Deposite_Amount=sc.nextInt();
System.out.println("Enter Nominee Name:");
Nominee_Name=sc.next();
}
void amount_Deposite()
{
System.out.println("Enter the Amount to Deposite:");
int deposite=sc.nextInt();
Deposite_Amount=deposite+Deposite_Amount;
System.out.println("Total Amount After Deposite is:"+Deposite_Amount);
}
void amount_Withdraw()
{
System.out.println("Enter the Amount to Withdraw:");
int withdraw=sc.nextInt();
Deposite_Amount=Deposite_Amount-withdraw;
System.out.println("Total Amount After Withdraw is:"+Deposite_Amount);
}

   void balance_enquiry()
  {
    int balance =10000;
    balance=balance-Deposite_Amount;
    System.out.println("The balance in your account after withdrawl is:"+balance);
  }
  void display_customerinfo()
  {
   System.out.println("Enter the name of customer:");
    String customername=sc.next();
       System.out.println("Enter the customer DOB:");
    String dob=sc.next();
    System.out.println("The name of customer: "+customername);
   System.out.println("Customer DOB : "+dob);
  }
  }
  

class Bank_Project
{
public static void main(String args[])
{
Bank b1=new Bank();
}
}
