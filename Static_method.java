package Keywords;


//we cannot create object of static object
class Static_method 
{
    public static int square(int number)
    {
        return number * number;
    }
    
    public static void show(int b)
    {
    	System.out.println("The value of b is :"+b);
    	
    }

    public static void main(String[] args) 
    {
        int result = Static_method.square(5);  
        System.out.println("Square of 5 is: " + result);
        Static_method s=new Static_method();
        s.show(5);
    }
}


	



