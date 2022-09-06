package day22DoWhile;

//revision of post and pre-decrement
public class DoWhileLoop {

	public static void main(String[] args) {
		
		
		int c = -1;
		System.out.println("--c = "+--c);//-2
		System.out.println("c= "+c);//-2
		c--;//-3
		System.out.println("c is "+c);//-3
		c=c--+1;//-3+1=-2
		System.out.println("c is : "+c);//-2
	//System.out.println("c is "+c);
		/*System.out.println("Printing all the numbers from 10 till 1");
		do {
			// printing all the numbers till 10
			System.out.println(c);
			++c;
		} while (c <0);*/
	}
}