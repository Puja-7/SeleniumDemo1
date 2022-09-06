//use of isEmpty() method return true or false
//use Of add(index,Object element)
//use of ArrayList.addAll(ArrrayList)
package Day46.Collection2;
import java.util.*;
public class ArrayListExample2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	//use of isEmpty() method
	System.out.println("is a1 empty? "+a1.isEmpty());
	a1.add("puja");
	a1.add("tv");
	a1.add("table");
	a1.add("remote");
	System.out.println("is a1 empty? "+a1.isEmpty());
	System.out.println("a1 elements are:");
System.out.println(a1);
	;
	ArrayList a2=new ArrayList();
	a2.add("showcase");
	a2.add("tv");
	a2.add("fan");
	System.out.println("a2 elements are:");
	System.out.println(a2);
	//Use of add(index,elemeny)
	a2.add(2,"newValue"); //newValue will be added at 2nd index i.e after tv
	System.out.println("updated a2 element after using add(2,newValue)");
	System.out.println(a2);
	//Use of addAll() method
	a1.addAll(a2);
	System.out.println("a1 elements after using addAll(a2) method: ");
	System.out.println(a1);
	System.out.println("a2 elements :");
	System.out.println(a2);
	a2.addAll(a2);
	System.out.println("after using a2.addAll(a2) method a1 elements are: ");
	System.out.println(a2);
	a1.addAll(3, a2); //it will all elements from a2 in a1 from index 3
	System.out.println("after using a1.addAll(3,a2) a1 elements are: ");
	System.out.println(a1);
}
}
