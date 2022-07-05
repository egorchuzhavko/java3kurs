package example.domain;

public class Spider extends Animal implements Pet {
    public Spider(String name) {
        super(name);
    }

    public Spider() {
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
