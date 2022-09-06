package day23Switch;

public class Cons0 {
	int age=34;
	String name="puja";
	void display()  //Method
	{
		System.out.println("age is "+age);
		System.out.println("name is "+name);
	}
	 Cons0()  //Constructor
	{
		System.out.println("in Cons0 constructor1");
	}
	 Cons0(int i) //constructor 
	 {
		 System.out.println("In Cons0(int i) constructor2 i= "+i);
	 }
	public Cons0(int i,double j)//Constructor
	 {
		 System.out.println("in Cons0(int i,double j) constructor3 i= "+i+" j= "+j);
	 }
	protected Cons0(double j,int i) //Constructor
	 {
		 System.out.println("In Cons0(double j,int i) Constructor4 j= "+j+" i= "+i);
	 }
	 
	 void Cons0() //Method having same name as Constructor as in method return type is must therefore we can use same name as class name
	 {
		 System.out.println("in Cons0 method");
	 }
	public static void main(String[] args) 
	{
		Cons0 c=new Cons0();//default constructor called by default by compiler
		//display(); can not call directly as it is non static method
		//c.display();
		c.Cons0();//method same name as constructor
		//System.out.println("age from main is "+c.age);
		c=new Cons0(10);//cons0(int)
	new Cons0(10,234.5);//cons0(int,double)
	new Cons0(32324.4,89);//cons0(double,int)
	//new Cons0(100,90);//CT Error as Constructor Cons0(int,double)is ambiguous----> Which constructor to call int,double or double,int
	
	
	}

}
