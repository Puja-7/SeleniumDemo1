package Day40_String;
//SELF PROGRAM
/*created string object using literal value which resides in constant pool...
 * if two string has same value 
then  it will not create new object it will just refer to previous same value
BUT in when we create object using new keyword then all the time 
it will create new object everytime even if same value is given*/
public class String1 {
	public static void main(String[] args) {
		String s1="puja";
		System.out.println("s1.puja Hashcode "+s1.hashCode());//3452412
		s1="puja";
		System.out.println("s1.puja Hashcode "+s1.hashCode());//3452412 same hashcode bcoz of same value
		s1="pooja";
		System.out.println("s1.pooja Hashcode "+s1.hashCode());//106851207 different hashcode for same reference 
		//becoz value gets changed and new object gets created
		System.out.println("s1.pooja value= "+s1);//pooja
		
		System.out.println("New String s2 reated using literal value....");
		String s2="puja";
		System.out.println("s2.puja Hashcode "+s2.hashCode());//3452412
	
		s2="pooja";
		System.out.println("s2.pooja Hashcode "+s2.hashCode());//106851207
		System.out.println("s1.pooja euqual s2.pooja : "+s1.equals(s2)); //true
		s2="POOJA";
		System.out.println("s2.POOJA Hashcode "+s2.hashCode());//76313447
		System.out.println("s2.POOJA value= "+s2);
		
		System.out.println("**************String Obj creation using new keyword***********");
	}

}

