package Keywords;

class clg
{
	String name="PVP";
	
	void disp()
	{
		System.out.println("The name of college is "+name);
	}
	
	void id()
	{
		System.out.println("Collge ID is "+121245);
	}
}

class student extends clg
{
	String stdname="XYZ";
	
	void show()
	{
		super.disp();
		
		System.out.println("Log Out");
	}
}

public class Super_Method 
{

	public static void main(String[] args) 
	{
		student s=new  student();
		s.show();
		
	}

}
