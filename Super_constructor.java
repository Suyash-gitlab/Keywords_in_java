package Keywords;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    int age;

    public Dog(String name, int age) {
        super(name);  
        this.age = age;
        System.out.println("Dog constructor called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Super_constructor 
	{
	public static void main(String[] args) {
        Dog dog = new Dog("Rocky", 10); 
        dog.display();
    }
}




	
