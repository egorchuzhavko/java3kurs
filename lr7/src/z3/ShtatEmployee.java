package z3;

public class ShtatEmployee extends Employee {
    double premiya;
    
    ShtatEmployee (String fullName, dolgnost _dolgnost, double oklad, double premiya)  {
        super(fullName, _dolgnost, oklad);
        this.premiya = premiya;
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

    @Override
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
        if (premiya < 0) {
            throw new PremiyaExeption("Премия не может быть отрицательным значением");
        }
        return salary + premiya;
    }
}