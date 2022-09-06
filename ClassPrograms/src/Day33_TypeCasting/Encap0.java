package Day33_TypeCasting;
class Demo
{
	private int id=100;
	private double salary=123456d;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
}
public class Encap0 {
		public static void main(String[] args) {
			Demo d=new Demo();
			System.out.println("current value of id is "+d.getId());
			System.out.println("current salary is : "+d.getSalary());
			d.setId(700);
			System.out.println("updated id value is : "+d.getId());
			d.setSalary(700000.5477d);
			System.out.println("updated salary is "+d.getSalary());
		}

}
