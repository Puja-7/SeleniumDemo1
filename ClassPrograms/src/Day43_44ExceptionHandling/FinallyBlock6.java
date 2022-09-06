package Day43_44ExceptionHandling;
//program from internet 
//https://www.scientecheasy.com/2020/05/java-finally-block-not-executed.html/#:~:text=Condition%20where%20finally%20block%20is%20not%20executed%20in%20Java&text=When%20the%20System.,block%20will%20not%20be%20executed.
public class FinallyBlock6 {

		
		public static void main(String[] args) 
		 {
		 //FinallyBlock6 obj = new FinallyBlock6();
		  System.out.println(methodName());
		  }
		
			public static int methodName()
			{ 
			 int a = 20, b = 0;	
			try {
			   System.out.println("I am in try block");
			   int c = a/b;
			   System.out.println("Result: " +c);
			  }
			catch(ArithmeticException ae)
			{
			  System.out.println("I am in catch block");
			  //System.exit(0);
			  return 20;
			}
			finally 
			{
				//int p=23/0;
			  System.out.println("I am in finally block");
		 return 50;
			 }
			}
}
