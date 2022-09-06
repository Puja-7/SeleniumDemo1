package Day14StaticMethods;

public class Method001 {
	static int id;
	static double salary;
	public static int empid(int a,int b)
	{
		System.out.println("In empid method");
		System.out.println("numbers are a="+a+" b="+b);
		int res=a+b;
		return res;
	}
	public static void display(int a,int b)
	{
		System.out.println("In display method");
		System.out.println("result from empid method calling empid from display method "+empid(40,40));
		System.out.println("a= "+a+" b= "+b);
		int res=a+b;
		System.out.println("addition ="+res);
	}

	public static void main(String a[])
	{
		int res=empid(10,20);
		System.out.println("result from int empid is:"+res);
		display(25,25);
	}
}

