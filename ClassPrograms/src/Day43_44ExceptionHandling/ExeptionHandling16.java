package Day43_44ExceptionHandling;

import java.util.Scanner;
class UserDefinedException extends Exception
{
	UserDefinedException(String msg)
	{
		super(msg);
	}
	UserDefinedException()
	{
		System.out.println("UserDefinedException Constructor");
	}
	}
public class ExeptionHandling16 {
	    public static void main(String[] args)
	    {
	    	System.out.println("program starts");
	    	setSleep(3000);
	    	try {
	    	checkNumber(-1);
	    	}catch(UserDefinedException e)
	    	{
	    		System.out.println(e);
	    	}
	    	System.out.println("Hello Geeks");
	    }
	    static void setSleep(long time) {
	    	try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	    static void checkNumber(int num) throws UserDefinedException{
	    	if(num<0){
	    		try {
					throw new UserDefinedException("Number less dn zero");
				} catch (UserDefinedException e) {
					e.printStackTrace();
				}
	    	}else {
	    		System.out.println("Number is :"+num);
	    	}
	    }
}