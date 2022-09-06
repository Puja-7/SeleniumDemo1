package Day15NonStaticMEthods;

public class TotalRecallConcepts {

	
		//global variables ---> static and non-static
		static int age1;
		static double salary = 2536.0326;
		int age2;
		double salary2 = 568.898;
		// method---> static and non-static method
		void display()        //non static method without parameter and no return type
		{
			System.out.println("nsgv age2 is: "+age2);
			//System.out.println("sgv age is :"+age1); we can call static global variables directly in nostatic method of same class or we can use classname.variable_name
			System.out.println("nsgv salary is : "+salary2);
		}
		double getInterest(int amount, int numOfYrs, double irt)  //non static with parameter and return type 
		{
			System.out.println("amount,noy and irt are : "+amount+" ,"+numOfYrs+" ,"+irt);

			return 253.5465;
		}
		static void display2()  //static method without return value and no parameter
		{
			System.out.println("sgv age1 is: "+age1);
			System.out.println("sgv salary is: "+salary);
			//we have to create object to access nonstatic global variable from static method
			TotalRecallConcepts t=new TotalRecallConcepts();
			System.out.println("nsgv age2 is : "+t.age2);
		}
		static double getInterest2(int amount, int numOfYrs, double irt) //static method with parameters and return type double
		{
			System.out.println("amount,numOfyrs,irt are : "+amount+" ,"+numOfYrs+" ,"+irt);

			return 253.5465;
		}
		public static void main(String[] args) {
			//local variable
			int age=100;
			double salary;
			System.out.println("Accessing local variable of main***********");
			System.out.println("main local age is "+age);
			//System.out.println("main local salary is "+salary);CT error we have to initialize local variable before its use so we can't directly access salary as it is not initialized
			
			//access static members
			System.out.println("...............accessing Static members from main........................");
			System.out.println("value of static gv age1 is: "+age1);
			System.out.println("value of static salary is : "+TotalRecallConcepts.salary);//as local and global variables have same name so we used classname.sgvName else we can directly access sgv in static main method
			System.out.println("calling static getInterest2(int,int,double) method "+getInterest2(1000,3,4.5));
			System.out.println("calling static void display2 method from main......");
			display2();
			
			//access non-static members
			System.out.println("............Accessing non static members from main************");
			//System.out.println("value of nsgv age2 is"+age2); we have to create obje to access non static members
			TotalRecallConcepts t=new TotalRecallConcepts();
			t.age2=60;
		 System.out.println("updated value of nsgv age2 is "+t.age2);
		 System.out.println("value of nsgv salary2 is "+t.salary2);
		 System.out.println("calling non static getInterest{int,int,double} from main using obje reference "+t.getInterest(34567, 2,5.5));
		 System.out.println("calling non static void display method from main.......");
		 t.display();
		}
}