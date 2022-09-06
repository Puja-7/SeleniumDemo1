package class_SelfPractice;
class single
{
	int age=25;
	static single s=new single(); //static object gets created that will loaded into memory at compile time
	//make constructor private as below
	private single()
	{
		System.out.println("private constructor running....");
	}
	static single getObj() //static method to access/get/return object
	{
		return s;
	}
	/*
	static single obj=new single();
	static single getobj2()
	{
		return obj;
	}
	you can create more than one object in same class and access it outside class but we have
	use nethod always to access that object
	*/
}

public class SingletonEx1 
{
	public static void main(String[] args) {
		//single s=new single(); as constructor is private
		//we can not create object outside of class
		single s2= single.getObj(); //we can only access object of single class can not create it outside class
		System.out.println(s2.age);
		s2.age=30;
		System.out.println(s2.age);
		single s3=single.getObj();
		System.out.println(s3.age);//new reference will also have same age value as previous object
		//bcoz it is singleton class we can only create one object and access it all the changes will 
		//reflect in that same single object only
		/*single newobj=single.getobj2();
		System.out.println(newobj.age);
		you can create more objetc but in that same single class and you have
		 to write that many methods to access the object of class
		*/
	}

}
