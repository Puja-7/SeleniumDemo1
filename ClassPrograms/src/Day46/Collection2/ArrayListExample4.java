package Day46.Collection2;
//using retainAll() method of ArrayList
//use of Iterator for iterating elements using hasNext() and next() method
import java.util.*;
public class ArrayListExample4 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("meera");
		a1.add("radha");
		a1.add(null);
		a1.add("gauri");
		a1.add("abc");
		System.out.println("elements in a1 list are: "+a1);
		ArrayList a2=new ArrayList();
		a2.add("shyam");
		a2.add("sunder");
		a2.add(null);
		a2.add("radha");
		a2.add("abc");
		System.out.println("elements in a2 list are: "+a2);
		//using retainAll();
		a1.retainAll(a2); // it will give common values in a1 and a2 and stored in a1
		System.out.println("after using retain all a1 list is: "+a1); //radha null abc
		//System.out.println(a2);
		//Use Of Iterator to iterate elements in a1 list
		System.out.println("iterating elements form a1 using iterator: ");
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
