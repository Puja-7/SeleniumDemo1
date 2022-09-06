package Day40_String;
//In String class == operator used to compare two objects based of=n their address
// equals() overriden method used to compare object based on values
public class StringClass1 {
public static void main(String[] args) {
	//Creating string object using literals
	String s="puja";//create one object in String constant pool
	String s1="puja";//object will not be created it only refer to previous object---
	//-----bcoz of same value
	System.out.println("is s and s1 having same address "+(s==s1));//compare object based on Address
	System.out.println("is s and s1 have same value ?"+s.equals(s1));//compare objects values
	String s3="Puja";
	System.out.println("is s and s3 having same address "+(s==s3));//false because puja and Puja different
	System.out.println("is s and s3 have same value ?"+s.equals(s3));//false
	System.out.println("is s and s3 have same value after ignoring case? "+s.equalsIgnoreCase(s3));//true---
	//---as equalsIgnoreCase will ignore case p and P are same then
	
	
	//Creating object using new keyword
	String s4=new String("puja");//one object gets created in heap memory as---
	//--- puja is already present in string constant pool so it will not create 2nd obj in that pool----
	//--- if puja value was not in constant pool then this will create 2 objet one in heap----
	//--- and another in string constant pool 
	String s5=new String("puja");//it will create one object as new keyword is used
	String s6=new String("Pooja");//it will create two objects in heap and one in string constant pool
	System.out.println("using equals() method i.e. comparing values of string is same? i.e. puja and Pooja same :"+s5.equals(s6));//false
	System.out.println("using== operator i.e. comparing address of string is same? i.e. puja and Pooja same :"+(s5==s6));	//false

	String s7=new String("Pooja");
	s6="pooja";//it will create new object in String constant Pool as Pooja is present---
	//--- but given pooja is not present in pool
	System.out.println("Lets compare objects created using new keyword");
System.out.println("using equals() method i.e. comparing values of string is same? i.e. puja and puja same :"+s4.equals(s5));//true
System.out.println("using== operator i.e. comparing address of string is same? i.e. puja and puja same :"+(s4==s5));	//false

System.out.println("using equals() method i.e. comparing values of string is same? i.e. pooja and Pooja same :"+s6.equals(s7));//false
System.out.println("using== operator i.e. comparing address of string is same? i.e. pooja and Pooja same :"+(s6==s7));	//false

}
}
