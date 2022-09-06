package Day15NonStaticMEthods;

public class MethodWithVoid1 {
	public static void main(String[] args) {
		final MethodWithVoid1 m=new MethodWithVoid1();  
		System.out.println("Address of object is: "+m);
		m.display();
		m.call(45555);
		m.print('l');
		
		
	}
		
	void display() {
		//final MethodWithVoid1 m=new MethodWithVoid1();
		System.out.println("I am display method");
	}
	
	void print(char c1) {
		System.out.println("I am print method and printing char as: "+c1);
	}
	
	void call(long num) {
		long num1=1234;
		System.out.println("I am call method and calling number is: "+num);
		System.out.println("I am call method and calling num1 is: "+num1);
	}
	{
		String s="i am puja";
		System.out.println("string is : "+s);
	}


}