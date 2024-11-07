package Keywords;


// Compiler automatically add this keyword when calling a method invoking / implicitly 

class stud
{
	void id()
	{
		System.out.println("Student id is :101");
	}
	
	void disp()
	{
		id();
	}
}


public class This_method 
{

	public static void main(String[] args) 
	{
		
		stud s = new stud ();
		s.disp();

	}

}
