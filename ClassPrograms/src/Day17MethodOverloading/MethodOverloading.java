package Day17MethodOverloading;
class demo
{
	static double result;
	static int square(int a)
	{
		result=a*a;
		return (int)result; //narrowing
	}
	static double square(double b)
	{
		result=b*b;
		return result;
	}
	static void square()
	{
		System.out.println("no parameterized method");
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("  "+demo.square(2));
	}

}
