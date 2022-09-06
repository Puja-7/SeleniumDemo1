package day35Array;
//MArray1 and MArray2 from Day36
public class MArray1 {
	public static void main(String[] args) {
			//declaring and initializing 2 dimentional array
		int a[][]= {{1,2,},{4,5,},{7,8,}};
		System.out.println("Accessing 2D array elements using for loop");
		int i,j=0;
		for(i=0;i<a.length;i++)//For Row 
		{
			for(j=0;j<a[i].length;j++)//Column 
			{
				//System.out.println("Row: "+i+" cell: "+a[i].length);
				//System.out.println("row: "+i+"  Column : "+a[i].length);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
	
		}
		System.out.println("rows : "+i+" Columns : "+j);
		char[] c[]={{'a','b','c'},{'d','e'},{'f','g','h'}};
		System.out.println("Second 2D array elements are: ");
		int k;
		int b=0;
		for(k=0;k<c.length;k++)
		{
			for(b=0;b<c[k].length;b++)
			{
				System.out.print(c[k][b]+" ");
			}
			System.out.println();
		}
		System.out.println("rows : "+k+"  Columns : "+b);
		
	}
}
