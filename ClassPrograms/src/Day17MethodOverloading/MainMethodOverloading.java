package Day17MethodOverloading;

public class MainMethodOverloading {
	public static void main(String a[])
	{
		int i=01;
		int j=02;
		int k=03;
		int l=04;
		int m=05;
		int n=06;
		int o=07;
		
		//int p=08;  CT Error out of range error 
		//int q=09; CT Error out of range error 
		System.out.println("value of i is : "+i);
		System.out.println("value of i is : "+j);
		System.out.println("value of i is : "+k);
		System.out.println("value of i is : "+l);
		System.out.println("value of i is : "+m);
		System.out.println("value of i is : "+n);
		System.out.println("value of i is : "+o);
		main(100);
		System.out.println("value of c is "+main('p'));
	}
	public static void main(int a)   //main method overloading
	{
		System.out.println("main(int) calling value of a is= "+a);
	}
	public static char main(char c) //main method overloading by changing parametertype and return type but change in return type only will not do overloading
	{
		System.out.println("calling another method of same class directly");
		main(101);
		//refer new project OctalBaseTest for this type of int value output will be different
		main(0101);//it is taking 0101 as binary value so o/p will be 65  instead of 0101 search in net for this is pending
		main(0011);//from right to left---------> (1*8^0)+(1*8^1)+(0*8^2)+(0*8^3)=1+8+0+0=9 so 9 will be output
		//main(08); CT Error out of range error
		return c;
	}
	/*we cant overload method by changing non accessmodifier or return type only below method gives error
	 * 
	 * public int main(int i) //CT Error duplicate method
	{
		System.out.println("i= "+i);
	}*/
	/*we can overload method only by changing return type
	 * public static int main(int i)         //CT Error duplicate method
	{
		return i;
	}*/
	
}
