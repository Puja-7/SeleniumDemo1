package Day15NonStaticMEthods;

public class fareinheitToCelcius {
	public static void main(String[] args) {
		//for temperature converter
		convert1(45.5f);
		convert1(0);
		convert1(45);
		convert1(32);
		//for area of triangle 
		System.out.println("area of triangle is "+areaoftriangle(30,70));
		//area of rectangle
		System.out.println("area of rectangle is "+area(10.9f,20));
		//Simple interest
		System.out.println("Simple interest will be: "+simpleInterest(10000,3,4.5f));
		System.out.println("Simple interest will be: "+simpleInterest(15000,6,4.9f));
		
	}
	public static void convert1(float ftemp)
	{
		System.out.println("given temperature in fahreinheit is "+ftemp);
		float celcius=(ftemp-32)*5/9;
		System.out.println("temperature in celcius is "+celcius);
		
	}
	public static double areaoftriangle(float height,float base) //area of triangle
	{
		double area=(height*base)/2; //area of triangle
		//System.out.println("area of triangle is :"); 
		return area;
	}
	public static double area(float width,float length)  ///Area of rectangle 
	{
		double area=width*length; //rectangle area formula
		return area;
	}
	public static double simpleInterest(double principal,int n,float roi )// method to calculate Simple Interest
	{
		double si=(principal*n*roi)/100;
		return si;
	}
}
