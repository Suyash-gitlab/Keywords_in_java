package Keywords;

class show
{
	void disp()
	{
		System.out.println("suyassh");
	}
}

class Static_block 
{
    static int value;

    static 
    {
        value = 10;  
        System.out.println("Static block is executed");
    }


    public static void main(String[] args) 
    {
    	 show s = new show();
         s.disp();
        System.out.println("Value: " + value); 
       
    }
    
    static
    {
    	System.out.println("Out of boundry");
    }
}


