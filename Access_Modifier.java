package Keywords;


class Access_Modifier 
{
	    
	    // Public variable (accessible everywhere)
	    public String publicVar = "I am a public variable!";
	    
	    // Private variable (accessible only within this class)
	    private String privateVar = "I am a private variable!";
	    
	    // Protected variable (accessible within the same package or by subclasses)
	    protected String protectedVar = "I am a protected variable!";
	    
	    // Default (package-private) variable (accessible only within the same package)
	    String defaultVar = "I am a default variable!";

	    // Public method
	    public void displayPublic() {
	        System.out.println(publicVar);
	    }

	    // Private method (accessible only within this class)
	    private void displayPrivate() {
	        System.out.println(privateVar);
	    }

	    // Protected method (accessible within the same package or by subclasses)
	    protected void displayProtected() {
	        System.out.println(protectedVar);
	    }

	    // Default method (accessible within the same package)
	    void displayDefault() {
	        System.out.println(defaultVar);
	    }

	    public static void main(String[] args) {
	    	Access_Modifier obj = new Access_Modifier();

	        obj.displayPublic();     // Accessible everywhere
	        obj.displayProtected();  // Accessible within the package or by subclass
	        obj.displayDefault();    // Accessible within the package
	        obj.displayPrivate();  // Not accessible outside the class
	        
	        // Accessing the variables
	        System.out.println(obj.publicVar);   // Accessible
	        System.out.println(obj.privateVar); // Not accessible, will give a compile-time error
	        System.out.println(obj.protectedVar); // Accessible
	        System.out.println(obj.defaultVar);   // Accessible
	    
	    }
	
}

	



