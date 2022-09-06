package Day33_TypeCasting;
//example of upcasting and downcasting
class super1
{
	void display()
	{
		System.out.println("display od super1");
	}
}
class sub1 extends super1
{
	void display1()
	{
		System.out.println("display1 of sub1 class");
	}
}
class sub2 extends sub1
{
	void display2()
	{
		System.out.println("display2 of sub2 class");
	}
}

public class SelfDerivedCasting 
{
	public static void main(String[] args) {
		
		sub2 s=new sub2(); //homogenous statement
		s.display();
		s.display1();
		s.display2();
		sub1 s2=s;//implicit upcasting from child sub2 to parent sub1
		s2.display();
		//s2.display2(); cant call childs method through parents referenc
		s2.display1();
		super1 s3=s2;//implicit upcasting
		s3.display();
		//s3.display1(); can't access method of child class as reference is of parent class and upcasting is there,,,, 
	//	s3.display2();   therefore child class object converted into parent class object thats why cant access child class object
			
		
		super1 s4=(super1)new sub2(); //explicit casting
//  OR			super1 s4=s; //implicit upcasting
		s4.display();
		System.out.println("Hashcode method output: "+s4.hashCode());

		
	
	}
}
