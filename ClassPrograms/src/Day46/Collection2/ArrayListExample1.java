//Use of add(), size(),set(index,elementValue) methods
//traversing through forloop,forEach(regular),forEach(using lambda),iterator
/**
		  * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */
package Day46.Collection2;
import java.util.*;
public class ArrayListExample1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	/* As in Above a arrayList is empty so traversing using iterator will gives exception as NoSuchElementException
	 *  Iterator it=a.iterator();
	System.out.println(it.next());
	
	*/
	System.out.println();
	a.add("oops");
	a.add("java");
	a.add("c");
	a.add("cpp");
	a.add("python");
	//accessing elements directly
	System.out.println("ArraList a :");
	System.out.println(a);
	System.out.println("\nUsing for loop ArrayList a :");
	for(int i=0;i<a.size();i++)
	{
		System.out.print(a.get(i)+" ");
	}
	System.out.println();
	System.out.println("\nusing forEach loop ArrayList a: ");
	for(Object o:a)
	{
		System.out.print(o+" ");
	}
	System.out.println();
	a.set(3, "new c++"); //set method will replace/override previous value
	System.out.println("\nupdated ArrayList a after using a.set(index,elementValue)");
	System.out.println(a);
	System.out.println("\nTraversing list through forEach() method:");
	// The forEach() method is a new feature, introduced in Java 8.
	// Here, we are using lambda expression
	a.forEach(b -> { 
		System.out.println(b);
	});
	a.remove("python");
	System.out.println("\ntraversing through iterator :");
	Iterator itr=a.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	//System.out.println(itr.next()); as there is no next element present so it will give NoSuchElementException
	
}
}
