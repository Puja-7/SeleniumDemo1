package Day43_44ExceptionHandling;

public class ExeptionHandling01 {
	public static void main(String[] args) {
		System.out.println("Started main......");
		try
		{
			System.out.println("in try block");
			int a=30/0;
			System.exit(0);
		}catch(ArithmeticException a)
		{
			//System.exit(0);   if we write system.exit here then finally block will executed
			System.out.println("In catch block for handling exception...");
			System.out.println(a);
		}
		finally
		{
			
			//return 10; CT Error
			System.out.println("in finally block");
		}
		}
	

}
