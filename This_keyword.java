package Keywords;

// This keyword is to initialize current class instance variable

class college
{
	int a=10;
	
	void info(int a)
	{
		this.a=a;	
	}
	
	void display()
	{
		System.out.println("student Id is :"+a);
	}
}
public class This_keyword 
{

	public static void main(String[] args)
	{
		college c=new college();
		c.display();

		
	}

}
