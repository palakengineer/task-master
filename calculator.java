import java.util.Scanner;
 class Calculator
{
public static void main(String [] args)
{
int n1,n2,ch,cal;
System.out.println("Enter two numbers ");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
System.out.println("Select operation ");
ch=sc.nextInt();

if(ch==1)
{
cal=n1+n2;
System.out.println("Addition "+cal);
}
else if(ch==2)
{
cal=n1-n2;
System.out.println("Substraction "+cal);
}
else if(ch==3)
{
cal=n1*n2;
System.out.println("Multiplication "+cal);
}
else if(ch==4)
{
cal=n1/n2;
System.out.println("Division "+cal);
}
}
}




