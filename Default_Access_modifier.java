package Keywords;

public class Default_Access_modifier
{

		    String message = "This is a default message!";
	    
	    void displayMessage()
	    {
	        System.out.println(message);
	    }

	    public static void main(String[] args)
	    {
	    	Default_Access_modifier obj = new Default_Access_modifier();
	        
	        // Accessing the default variable and method within the same package
	        System.out.println(obj.message);   
	        obj.displayMessage();             
	    }
	

}
