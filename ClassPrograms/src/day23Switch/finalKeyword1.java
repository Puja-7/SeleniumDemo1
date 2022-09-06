//First assignment in Day21Assignment Project write n refer all programs 
package day23Switch;
// it include all the programs upto ConstantVariable3 and covers block concepts also upto Day26
//Day25 is assignment solution
//after this package go to Day28 i.e. inheritance
final public class finalKeyword1 {
	static int age=77;
	final static int id=777;
	final static char grade; //blank final static variable and it can only initialized in static block
	static {grade='A';
	System.out.println("final static grade value assigned from static block is "+grade);} //static block is used to initialize static members
	final String name; //blank final NSGV and it can be initialized in Constructor or in Non static Block
	//constructor to initialize final NSGV i.e. String name
	/*finalKeyword1()
	{
		this.name="puja";
		System.out.println("name is assigned from Constructor "+name);
	}*/
	finalKeyword1()
	{
		System.out.println("In Constructor");
	}

	public static void main(String[] args) {
		//grade='A' ;  CT Error Can not assign value to final variable
		System.out.println("Age is "+age);
		age=79;
		System.out.println("Updated Age is : "+age);
		System.out.println("Id is : "+id);
		//id=775;  CT Error final variable can not be changed 
		finalKeyword1 k =new finalKeyword1();  //it will call non static block first and then call constructor
		//k.name="puja"; //we can not initialize final NSGV in method it can be initialized only in NS Block or COnstructor
	}
	//non static block	for initialization of final NSG variable String name
		{
			name="Puja";
			System.out.println("name is assigned from NS block"+name);
		}
		final void demo()//we can overload final method but cant override it
		{
			System.out.println("in demo method");
		}
		final void demo(int i)
		{
			System.out.println("in demo(int)");
		}

}
/*/class demo extends finalKeyword1  CT Error as finalKeyword1 is final class we cant extend it

/*we cant change value of final variable
and initialization of final variable is must orif initialization is not done while declaration then that varibale
 is called as blank final variable and if that variable is static then it is called as blank static variable
 
final nsgv can be initialized only in ns block or constructor

and final sgv can only be initialized in static block*/

/*Object creation is must to invoke non static block when we create object first non static block called 
 * and then default constructor gets called implicitly
 * non static block is also used to provide information before object creation
 * 
Static block is called before the main() method....but without main method static block can not be invoked 
and static block used to initialize final static variable and if we want to provide any information before main() */
/*final can be a variable as above*/
//final can be method and final method can be overloaded and inherited but can NOT be overriden
//final can be a class and final class can not be inherited