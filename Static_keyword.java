package Keywords;

public class Static_keyword 
{
		//static variable does'nt allowed to initialize as local variable  only with global/ instance variable
	    static int count = 0;  // Static variable

	    public Static_keyword() 
	    {
	        count++;
	    }

	    public static void displayCount() 
	    {
	        System.out.println("Count: " + count);
	    }

	    public static void main(String[] args) {
//	    	Static_keyword c1 = new Static_keyword();  // count becomes 1
//	    	Static_keyword c2 = new Static_keyword();  // count becomes 2
//	    	Static_keyword c3 = new Static_keyword();  // count becomes 3

	    	Static_keyword.displayCount();  
	    }
	


}
