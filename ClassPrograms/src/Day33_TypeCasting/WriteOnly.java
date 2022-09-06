package Day33_TypeCasting;
class Student3
{
	// private data member
	private String college="COEP";

	// getter method for college
	public void setCollege(String college) {
		this.college = college;
	}
	public String getClg() {
		return college;
	}
	void display() {
		System.out.println("initialized college name is: "+college);
	}
}
public class WriteOnly {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student3 s = new Student3();
		// getting value of the name member
		System.out.println("Initial college name : "+s.getClg());
		s.setCollege("COEPune");
		System.out.println("Updated college name is: "+s.getClg());
		Student3 s1 = new Student3();//new object will get initial value only not updated in another objects value
		s1.display();
		System.out.println("Bye");
	}
}