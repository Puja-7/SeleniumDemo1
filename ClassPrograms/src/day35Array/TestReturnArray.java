package day35Array;
//Array5 and Array6 Program combined in this
//returning array from method i.e. Array5 and exception occcurs is program Array6
class test
{
	int[] getArray()
	{
		int a[]= {10,20,30,40,50};
		return a;
	}
	
}
public class TestReturnArray {
	public static void main(String[] args) {
		test t=new test();
		int a[]=t.getArray();
		System.out.println("Accessing array from othwer class method getArray using forEach loop: ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		//exception occurs if we use <= operator in for loop
		for(int i=0;i<=a.length;i++)         //java.lang.ArrayIndexOutOfBoundsException bcoz we use i<=a.length, we must use i<a.length
		{
			System.out.println(a[i]);       //java.lang.ArrayIndexOutOfBoundsException
		}
	}

}
