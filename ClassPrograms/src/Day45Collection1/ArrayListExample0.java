package Day45Collection1;

import java.util.ArrayList;

public class ArrayListExample0 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("puja");//upcasting is done implicitly i.e. auto-upcasting from string to Object class object
		list.add(123);//boxing is done i.e. coversion from int to INTEGER and then upcsting is done from wrapper class to Object class
		list.add('e');
		System.out.println(list);
		System.out.println("Size of list is : "+list.size());
		for(Object o:list)// So we have taken Object type as all the above elements are converted into Object Implicitly
		{
			System.out.println(o);
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
