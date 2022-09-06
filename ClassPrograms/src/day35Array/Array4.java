package day35Array;
//Testarray2 program - finding max and min number from array
public class Array4 {
public static void main(String[] args) {
	int a[]= {1,2,3,45,65,0,-7};
	System.out.println("Given array elements are: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}
	findMax(a);
	findMin(a);
}
static void findMax(int a[])
{
	
	int max=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println("\nMaximum number is : "+max);
	
}
static void findMin(int a[])
{
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
	}
	System.out.println("Minimum number is: "+min);
}
}
