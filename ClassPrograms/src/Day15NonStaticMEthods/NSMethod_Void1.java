package Day15NonStaticMEthods;
public class NSMethod_Void1 {

	int age;
	static int id;
	public void display() {
		System.out.println("I am display() of Method03 class and age value is: "+age);
	}
	public void display(int a) {
		age=a;
		System.out.println("I am display(int) of Method03 class and age value is: "+age);
	}

	static public void display1() {
		System.out.println("I am display1() of Method03 class and static id value is: "+id);
	}
	static public void display1(int a) {
		id=a;
		System.out.println("I am display1(int) of Method03 class and static id value is: "+id);
	}

	public static void main(String[] args) {
		
		
		NSMethod_Void1 m2=new NSMethod_Void1();//yes,object got created and with the help m1 reference we can access it's members
		System.out.println("age: "+m2.age);//age=0
		m2.display();//age=0
		m2.display(25);//age=25		
		System.out.println("age: "+m2.age);//25
		display1();
		display1(25);
		System.out.println("id: "+id);
		
		NSMethod_Void1 m3=new NSMethod_Void1();//yes,object got created and with the help m1 reference we can access it's members
		m3.display(75);//age=75
		System.out.println("age: "+m3.age);//age=75
		m3.display();//age=75
		display1(50);
		display1();
		System.out.println("updated id is: "+id);
	}
}