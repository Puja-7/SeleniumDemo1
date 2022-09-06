package Day46.Collection2;

import java.util.ArrayList;

class book
{
	int id;
	String name;
	book(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	/*public String toString()
	{
		System.out.println(this.id);
		return name;
	}*/
	
}
public class ArrayListExample5 {
public static void main(String[] args) {
	ArrayList<book> list=new ArrayList<book>();
	book b1=new book(102,"prasad");
	book b2=new book(103,"omkar");
	list.add(new book(101,"puja"));
	list.add(b1);
	list.add(b2);
	System.out.println("List Elements are: "+list);//fullyQualifiedname@hexadecimalvalue
	System.out.println(list.get(0).name);//puja
	System.out.println(b1.name);//prasad
	System.out.println(list.get(2));//fullyqualifiedname@hexadecimalnumber
	System.out.println(list.get(2).name);//omkar
	//traversing list
	for(book b:list)
	{
		// System.out.println(b.toString()); same as below statement
		// OR System.out.println(b);// it will give fullyqualifiedname@hexadecimalNumber i.e. it will call toString() method of Object class
	System.out.println(b.id+" "+b.name);
	
	}
	for(Object o:list)
	{
		System.out.println(o);//fully qualified name@hexadecimalValue
	}
	
 }
}
