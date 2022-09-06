package day22DoWhile;
//day22 all programs done in this program
public class DoWhileLoop3 {

	public static void main(String args[]) {
		/* local variable Initialization */ 
		int n = 1, times = 0;

		/* do-while loops execution */ 
		do {
			System.out.println("Java do while loops:" + n);
			n++;
		} while (n <= times);
		do
		{
			System.out.println("everything gone be alright....;)");
		}while(false);
		int i=0;
		while(i<11)
		{
			++i; //if we use  1st this then prints 1 to 11
			System.out.println("numbers from 0 to 10 "+i);
			//i++;// print 0 to 10
		}
		char a='a';
		while(a<='z')
		{
			System.out.print(" "+a);
			a++;
		}
		System.out.println();
		a='z';
		while(a>'a')
		{
			System.out.print(" "+a);
			a--;
		}
	}
}