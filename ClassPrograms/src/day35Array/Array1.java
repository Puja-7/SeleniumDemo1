package day35Array;

public class Array1 {
	public static void main(String[] args) {
		int[] arr=new int[5]; //delaration and initialization
		System.out.println("first element is :"+arr[0]);
		System.out.println("accessing default elements in array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
		//arr= {1,2,3,4,5,};
		arr[0]=1;arr[1]=2;arr[3]=4;
		System.out.println("\naccessing updated  elements in array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
	}

}
