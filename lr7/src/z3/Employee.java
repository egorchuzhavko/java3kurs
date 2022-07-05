package z3;

enum dolgnost 
{
    emp,
    zam,
    dir
}

public class Employee {
    String fullName;
    dolgnost _dolgnost;
    double oklad;

    Employee (String fullName, dolgnost _dolgnost, double oklad) {
        this.fullName = fullName;
        this._dolgnost = _dolgnost;
        this.oklad = oklad;
        try {
            if (oklad < 0) {
                throw new OkladExeption("Оклад не может быть отрицательным, оклад: " + oklad);
            }
        }
        catch (OkladExeption ex) {
            System.out.println(ex.getMessage());
            return;
        }
    }

    public String getFullName(){
        return fullName;
    } 
    public void setFullName(String a){
        fullName = a;
    }

    public String getDolgnost(){
        return fullName;
    } 
    public void setDolgnost(String a){
        fullName = a;
    }

    public String getOklad(){
        return fullName;
    } 
    public void setOklad(String a){
        fullName = a;
    }

    public double Rate() throws PremiyaExeption {
        double rating = 0;
        switch (_dolgnost) {
            case emp: 
                rating = 1;
                break;
            case zam:
                rating = 50;
                break;
            case dir:
                rating = 100;
                break;
        }
        double salary = oklad + oklad * (rating*10)/100;
        if (salary <= 0) {
            throw new ArithmeticException("Зарплата не может быть меньше либо равна 0");
        }
        return salary;
    }
}

class PremiyaExeption extends Exception {
    public PremiyaExeption(String message){
        super(message);
    }
}

class OkladExeption extends Exception {
    public OkladExeption(String message){
        super(message); 
    }
}
