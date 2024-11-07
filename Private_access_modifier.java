package Keywords;

public class Private_access_modifier 
{
	    // Private variable
	    private String message = "This is a private message!";
	    
	    // Private method
	    private void displayMessage() 
	    {
	        System.out.println(message);
	    }

	    public static void main(String[] args) 
	    {
	    	Private_access_modifier obj = new Private_access_modifier();
	        
	        obj.showMessage();  
	    }
	    
	    public void showMessage() {
	        System.out.println(message);
	        displayMessage();  
	    }
	


}
