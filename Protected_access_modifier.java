package Keywords;

public class Protected_access_modifier 
{

	protected String message = "This is a protected message!";
			    
			    // Protected method
			    protected void displayMessage() 
			    {
			        System.out.println(message);
			    }

			    public static void main(String[] args) 
			    {
			    	Protected_access_modifier obj = new Protected_access_modifier();
			        
			        System.out.println(obj.message);   
			        obj.displayMessage();              
			    }

		

	


}
