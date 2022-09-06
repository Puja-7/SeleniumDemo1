package Day33_TypeCasting;
class test
{
	void display(double a)
	{	

		System.out.println("display(int a) calling..."+a);
	}
}
public class PrimitiveCasting5 {
public static void main(String[] args) {
	test t=new test();
	t.display(12);
}
}
