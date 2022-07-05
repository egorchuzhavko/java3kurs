package example.domain;

public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play(){
        System.out.println(name + " любит играть с веревочкой");
    }
    }
