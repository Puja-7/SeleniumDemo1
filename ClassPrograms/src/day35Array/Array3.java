package day35Array;
//finding average of array elements
public class Array3 {
	public static void main(String[] args) {
		int a[]= {12,3,45,67,89,-7,-19,89};//array elements
		//int a[]= {54,79};
		System.out.println("array elements are: "); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int num=a.length; //total number of ements in array
			int sum=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+a[i]; //sum of elements
		}
		double avg=(double)sum/num; //formula to calculate average is avg=sum/length
		System.out.println("\n Average of array elements is : "+avg);
	}

}
