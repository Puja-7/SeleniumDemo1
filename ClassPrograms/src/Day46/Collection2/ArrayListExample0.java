package Day46.Collection2;
import java.util.*;
public class ArrayListExample0 {
	/*public String toString()
	{
		return "In overriden toString Method of ArrayList";
	}*/
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("puja");
	a.add("ramesh");
	a.add(232);
	a.add("suresh");
	a.add("String");
	a.add(23.4340);
	a.add(new ArrayListExample0());//it will call toString method
	System.out.println("ArrayList Elements are: "+a);
	System.out.println("Traversing ArrayList a using for loop");
	for(int i=0;i<a.size();i++)
	{
		System.out.print(a.get(i)+" ");
	}
	System.out.println();
}
}
