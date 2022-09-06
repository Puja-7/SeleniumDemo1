package Day33_TypeCasting;
public class PrimitiveCasting3 {

	public static void main(String[] args) {

		double myDouble = 9.78d;
	//	int myInt =myDouble;//CT Error narrowing is done explicitly or manually only 
		int myInt = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}

}