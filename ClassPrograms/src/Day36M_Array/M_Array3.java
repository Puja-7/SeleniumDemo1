package Day36M_Array;

import java.util.Arrays;

//Use Of Arrays.copyOf and Arrays.copyOfRange and clone method and Arrays.sort method
public class M_Array3 {
	public static void main(String[] args) {
			char[] ch={'p','r','s','l','a','n','h','o','X'};

			System.out.println("characters in array ch are :");
			for(char i:ch)
			{
				System.out.print(i+"   ");
			}
			
			//Use of copyOf Method
			//char[] ch2=Arrays.copyOf(ch, ch.length);//it will all elements from array ch
			char[] ch2=Arrays.copyOf(ch, 10);//it will copy 10 elements from array ch
			System.out.println("\naccessing char in ch2 inserted using copyOf method and acessing using forEach loop");
			for(char i:ch2)
			{
				System.out.print(i+"  "); //p,r,s,l,a,n,blank,blank,blank,blank(i.e. small square)
			}
			
			//use of copyOfRange method of Arrays
			char ch3[]=Arrays.copyOfRange(ch, 0, 3);//0 included and 3 excluded therefore output will be from index 0 to 2 i.e.
			//i.e. p r s
			System.out.println("\nelements in copied arrays ch3 using copyOfRange are ");
			for(char c:ch3)
			{
				System.out.print(c+"  ");//p r s
			}
			char[] ch4=Arrays.copyOfRange(ch, 2, 7);
			System.out.println("\nIn between elements in ch4 using copyOfRange method");
			for(char c:ch4)
			{
				System.out.print(c+" ");//s l a n h
			}
			
			ch4=ch2.clone(); 
			System.out.println("\nupdated ch4 using clone method with ch2 ");
			for(char c:ch4)
			{
				System.out.print(c+" ");
			}
			//Use of Arrays.sort
			Arrays.sort(ch2); //Sort elements in Ascending Order
			System.out.println("\nsorted array element using sort method");
			for(char c:ch2)
			{
				System.out.print(c+" ");
			}
			int[] i= {13,56,42,0,-8};
			Arrays.sort(i);
			System.out.println("\nsorted int array");
			for(int j:i)
			{
				System.out.println(j+" ");
			}
	}
	
}
	


