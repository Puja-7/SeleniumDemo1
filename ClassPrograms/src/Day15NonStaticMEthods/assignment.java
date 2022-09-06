/*public class Assignment {

/**
 * Global variables 
 * static and non-static
 *

 * Method for both static and non-static
 * with and without parameter
 * with and without return type


public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}*/
package Day15NonStaticMEthods;
public class assignment {
 static char grade;
 int age;
 void setvalues()
 {
	 grade='A';
	  age=100;
	  System.out.println("age is "+age);
	  System.out.println("grade is "+grade);
 }
 static void display()
 {
	  assignment a=new assignment();
	  a.age=90;
	  grade='q';
	 System.out.println("value of grade is "+grade);
	 System.out.println("value of age is "+a.age);
 }
 int getvalue(int age)
 {
	 this.age=age;
	 return this.age;
 }
 static char getgrade(char c)
 {
	 return c;
 }
 public static void main(String[] args) {
	display(); //static method of same class
	assignment a=new assignment(); //object creation to access non static method
	System.out.println("age from main is "+a.getvalue(70));//accessing non static method getvalue value of age
	char ch=getgrade('p');//static getgrade method calling 
	System.out.println("getting grade from main "+ch);
	//accessing nonstatic method setvalues
	a.setvalues();
	
}
  
}


