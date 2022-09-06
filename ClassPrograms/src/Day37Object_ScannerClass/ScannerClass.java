package Day37Object_ScannerClass;

import java.util.Scanner;

//Scanner class use of scanner object for talking input from user you have to import java.util package
public class ScannerClass {
public static void main(String[] args) {
	int age;
	String name;
	double salary;
	boolean valid;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Age: ");
	age=sc.nextInt();
	System.out.println("Eneter Name : ");
	name=sc.next();
	System.out.println("Enter Salary : ");
	salary=sc.nextDouble();
	System.out.println("Is valid enter true or false :");
	valid=sc.nextBoolean();
	System.out.println("name is "+name);
	System.out.println("age is "+age);
	System.out.println("salary is "+salary);
	System.out.println("is valid ?"+valid);
	double a;
	int b;
	char ch;
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter value of a: ");
	a=sc1.nextDouble();
	System.out.println("enter value of b: ");
	b=sc1.nextInt();
	System.out.println("enter operation: ");
	ch=sc1.next().charAt(0);
	getResult(a,b,ch);
	
	
}
static void getResult(double a,int b,char ch)
{
	if(ch=='+')
	{
		System.out.println("Addition is "+(a+b));
	}
	else if(ch=='-')
	{
		System.out.println("subtraction is : "+(a-b));
	}
	else if(ch=='*')
	{
		System.out.println("multiplication is : "+(a*b));
	}
	else if(ch=='/')
	{
		System.out.println("Division is "+(a/b));
	}
	else
	{
		System.out.println("Invalid Operation.....please enter valid operation as + - * or /");
	}
}
}
