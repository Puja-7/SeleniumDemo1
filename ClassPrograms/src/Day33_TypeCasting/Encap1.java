package Day33_TypeCasting;
class Person {
	private String name="johny"; // private = restricted access
	// Getter
	public String getName() {
		return name;
	}
	// Setter
	public void setName(String newName) {
		this.name = newName;
	}
}
public class Encap1 {

	public static void main(String[] args) {
		Person myObj = new Person();
//	myObj.name = "John"; // error as name is private member
//		System.out.println(myObj.name); // error 
		System.out.println("current name is : "+myObj.getName());
		 myObj.setName("John"); // Set the value of the name variable to "John"
		 System.out.println("updated name is : "+myObj.getName());
		 
	}

}