package z3;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee("Александр", dolgnost.emp, -500);
        ShtatEmployee shtatEmp = new ShtatEmployee("Дмитрий", dolgnost.zam, 1000, 1000);
        ContractEmployee contractEmployee = new ContractEmployee("Егор", dolgnost.dir, 1500);
        Department dep = new Department("Департамент №1", 3, emp, shtatEmp, contractEmployee);
        Firm firm = new Firm("Фирма №1", dep);
        
        try {
            System.out.println(firm.dep.emp.Rate());
            System.out.println(firm.dep.shtatEmp.Rate());
            System.out.println(firm.dep.contractEmp.Rate());
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

	}

}
