package day35Array;
import java.net.StandardSocketOptions;
import java.util.Arrays;
//Array0,Array1,SampleArray last wala in day35 in this program
//copyOf and clone method used 
public class TryArray1 {
	public static void main(String[] args) {
		//String arr1[]=new String[3];
	//or String[] arr1=new String[3];
		String arr1[];
		arr1=new String[4];
		arr1[2]= "puja";
		arr1[0]="pooja";
		//String arr1[]= {"meera","syam","sunder"};
		System.out.println("Array length is : "+arr1.length); //4 i.e. no. of elements in array
		
		System.out.println("Third element in list is : "+arr1[2]);
		System.out.println("using forEach loop elements in array are ");
		for(String s:arr1)
		{
			//System.out.println(arr1); it will call toString() method internally and prints packagename.className.hexadecimalAddress
			System.out.println(s);
		}
		//CT Error	arr1= {"meera","shyam","sunder"};// error array constant only used in initialization 
		arr1[0]="Meera";
		arr1[1]="radha";
		arr1[2]="janki";
		
		System.out.println("Updated Elements in an array are: ");
		for(int i=0;i<arr1.length;i++)
		{
			//System.out.println(" "+i);//it will print only 0,1,2,3
			System.out.println(" "+arr1[i]);//it will gives elements in array i.e.meera,radha,janki,null
		}
		//for(int)
	
		//New Array
		System.out.println("*********New Araay**********");
		char arr[]= {'a','p','k','b','O','A'};;
		System.out.println("Length of char array is : "+arr.length);
		System.out.println("using forEach loop");
		for(char c:arr)
		{
			//System.out.println(arr);// 6 times it will print apkbmA
			System.out.println(" "+c);
		}
		
		
		System.out.println("New array of arr2 use of clone method*******");
		char arr2[]=arr.clone();
		System.out.println("elements in char arr2 using clone method are ");
		for(char c:arr2)
		{
			System.out.println(c);
		}
		System.out.println("Use of copyOf method");//use of copyOf method in Array class 
		char arr3[]=Arrays.copyOf(arr2,arr2.length);//copyOf(ArrayName,length of array) i.e. total array elements get copied
		arr3=Arrays.copyOf(arr2,5);          //copyOf(arrayNAme,how many elements you want to copy)
		for(char c:arr3)
		{
			System.out.println(c);//it will print first five elements i.e. a p k b o 
		}
	}

}
/*class M_Array3 {
	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		// declaring a destination array
		char[] copyTo=Arrays.copyOf(copyFrom, copyFrom.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.println(copyTo[i]);
		}
		System.out.println("************Copy using range****************");
		char[] copyWithRange=Arrays.copyOfRange(copyFrom, 3, copyFrom.length);
		for(int i=0;i<copyWithRange.length;i++) {
			System.out.println(copyWithRange[i]);
		}
		System.out.println("****************After Sorting********************");
		Arrays.sort(copyWithRange);
		for(char c: copyWithRange) {
			System.out.println(c);
		}
	}
}*/