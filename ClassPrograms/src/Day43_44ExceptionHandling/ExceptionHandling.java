package Day43_44ExceptionHandling;
//Different Types of Unchecked Exceptions
public class ExceptionHandling {
	public static void main(String[] args) {
		//types of exceptions
		int i=10;
		int j=i/0;//ArithmathicException
		System.out.println(j);
		
		
		int arr[]=new int[3];
		arr[6]=100;////ArrayIndexOutOfBoundsException
		System.out.println(arr[6]);
		String s=null;
		System.out.println(s.length()); //NullPointerException
		
		String str="pqr";
		int s1=Integer.parseInt(str);
		System.out.println(s1);//NumberFormatException
	}

}
