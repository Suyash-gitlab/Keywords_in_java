package Keywords;

public class Publix_access_modifier {


		public String message = "This is a public message!";
			    
			    public void displayMessage() 
			    {
			        System.out.println(message);
			    }

			    public static void main(String[] args) 
			    {
			    	Publix_access_modifier obj = new Publix_access_modifier();
			        
			        System.out.println(obj.message);   
			        obj.displayMessage();              
			    }
			

		

	}


