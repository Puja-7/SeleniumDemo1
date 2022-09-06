package Day46.Collection2;
//use of remove(Object) and remove(index) method
//remove(object) will return true or false i.e. boolean value
//remove(index) will return value/element of list
import java.util.ArrayList;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("meera");
		a.add("vijay");
		a.add("kapil");
		a.add("new");
		a.add("kapil");
		System.out.println("elements in list are: "+a);
		//removing specific element using remove(object) method
		System.out.println("remove new from list using remove(object): "+a.remove("new"));//true
		System.out.println("new list after removing new "+a);
		System.out.println(a.remove("kapil"));//it will only remove one kapil name
		System.out.println("new list after removing kapil"+a);//meera vijay kapil 
		System.out.println("removing vijay using remove(index) method: "+a.remove(1)); //vijay
		System.out.println("new list after removing vijay using remove(index) method:"+a);//meera kapil
	}

}
