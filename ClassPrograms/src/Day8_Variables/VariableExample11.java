package Day8_Variables;
class VariableExample11
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare & initlize a variable: datatype variablename = value;
		// 25 + 15 =30
		int num1=25;
		int num2=15;
		double result=num1/num2;//1.6666666
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Division of two number is : "+result);// 1 | 1.... | NOA
		System.out.println("Program ends");
	}
}
class selfExample
{
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare & initlize a variable: datatype variablename = value;
		// 25 + 15 =30
		double num1=25;
		//int num2=15;
		int num2=15; //if both variables are int then result will be in int i.e. in .0
		//therefor we use double num1 in above line
		double result=num1/num2;//1.6666666
		System.out.println("Number 1 is : "+num1);
		System.out.println("Number 2 is : "+num2);
		System.out.println("Division of two number is : "+result);// 1 | 1.... | NOA
		System.out.println("Program ends");
	}
}