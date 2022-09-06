package Day46.Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Generic Collection: means it force collection to store similar type of data only-----
//--->if you try to add different data then CT error will occur
public class ArrayListExample6 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		//ArrayList list=new ArrayList();
		list.add(null);
		list.add(123);
		list.add(45);
		list.add(-77);
		list.add(0);
		System.out.println("List elements are: "+list);//[null, 123, 45, -77]
		System.out.println("size of list is: "+list.size());//4
		//Collections.sort(list);//it will give error as null is there in list we cant sort
		//--->so we remove null
		list.remove(0);
		System.out.println("After removing 0th element size is : "+list.size());
	Collections.sort(list);
	System.out.println("Sorted elements :"+list);
	list.add(null);
	System.out.println("new list elements :"+list);
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i)==null)
		{
			list.remove(i);
		}
		else
		{
			System.out.println(list.get(i));
		}
	}
	}

}
