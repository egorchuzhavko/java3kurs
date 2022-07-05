package example.domain;

public class Laska extends Animal implements Pet {
    public Laska(String name) {
        super(name);
    }

    public Laska() {
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
        System.out.println(name + "is playing");
    }
}
