package Day33_TypeCasting;

import javax.swing.Spring;

class demo1
{
	private int id;
	private String name;
	private int age;
	private char grade;
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
		}
	public int getAge()
	{
		return age;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}
public class Encap2 
{
	public static void main(String[] args) 
	{
		demo1 d=new demo1();
		System.out.println("Initial id is : "+d.getId());
		System.out.println("initial name is : "+d.getName());
		System.out.println("initial age is : "+d.getAge());
		System.out.println("Initial grade is : "+d.getGrade());
		//setting values
		d.setId(777);
		d.setName("puja");
		d.setAge(30);
		d.setGrade('A');
		System.out.println("Updated id is : "+d.getId());
		System.out.println("Updated name is : "+d.getName());
		System.out.println("Updated age is : "+d.getAge());
		System.out.println("updated grade is "+d.getGrade());

	}
}
