package Keywords;
class parent
{
	int age = 56;
	String name = "suyash";
	void get()
	{
		System.out.println("age is "+age);
	}
	
	void name()
	{
		System.out.println("The name is "+name);
	}
	
}

class child extends parent
{
	
	String name="ABC";
	void childinfo()
	{
		System.out.println("The name is "+name);
		System.out.println("Tha parent name is "+super.name);
	}
	
}
public class Super_keyword_variable 
{

	public static void main(String[] args) 
	{

		child c=new child();
		c.childinfo();
		
	}

}

