package z3;

public class Firm 
{
    String name;
    Department dep;

    Firm (String name, Department dep) {
        this.name = name;
        this.dep = dep;
    }

    public String getName(){
        return name;
    } 
    public void setName(String a){
        name=a;
    }
}