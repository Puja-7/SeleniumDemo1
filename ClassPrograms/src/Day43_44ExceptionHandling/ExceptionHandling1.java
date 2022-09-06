package Day43_44ExceptionHandling;

import java.util.Scanner;

/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> if catch() donesn't have that type of declaration 
then jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/
public class ExceptionHandling1 {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter i value:");
		i=sc.nextInt();
		System.out.println("enter j value:");
		j=sc.nextInt(); //if we give invalid input like for int if we give string input it will give InputMisMatchException
		try
		{
			System.out.println("*****in try block*******");
			k=i/j;//this may gives an exception as divide by zero i.e. ArithmaticException
			System.out.println("result k= "+k);
			
		}
		//catch(Throwable t)
		catch(ArithmeticException t)
		{
			System.out.println("In Catch block");
			System.out.println(t);
			System.out.println("Please enter valid divisor it should not be zero");
		}
	}

}
