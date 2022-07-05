package example.domain;

public abstract class Animal {
    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat()
    {
        System.out.println(name +" is Eat");
    }
    public void walk()
    {
        System.out.println(name +" is Walk");
    }
}
