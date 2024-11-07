package Keywords;

public class This_constructor {
    private String name;
    private int age;

    public This_constructor(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public This_constructor(String name) 
    {
        this.name=(name);  
    }

    public void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) 
    {
    	This_constructor p1 = new This_constructor("Suyash", 30);  
        p1.display();

        This_constructor p2 = new This_constructor("Sarthak");  
        p2.display();
    }
}


	


