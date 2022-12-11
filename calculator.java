importjava.util.Scanner;
class Calculator
{
public staticvoid main(String args[])
{
int a,b;
Scanner sc=nrewScanner(System.in);
System.out.println("Enter two numbers");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Enter the operator(+,-,*,/)");
Char op=sc.next()ChartAt(0);
int c=0;
Switch(op);
{
case'+':
c=a+b;
break;
case'-':
c=a-b:
break;
case'*':
c=a*b;
break;
case'a/b':
c=a/b;
break;
default:
System.out.println("wrong number");
break;
}
System.out.println("The final result");
System.out.ptintln();
Stsrem.out.prrintln(a+""+op+""+b+""+c);
}
}


