package Day47_Collection2;

public class GC {
public static void main(String[] args) {
	System.out.println("main started...");
	GC g=new GC();
	System.out.println("String representation of GC obj is: "+g);
	System.out.println("HashCode is: "+g.hashCode());
	
	
	System.out.println("Program main ends");
	System.out.println("hello");
	g=null;
	System.gc();
}
@Override
protected void finalize()
{
	System.out.println("Hi...I am finalize method");
}
}
