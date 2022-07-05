package z3;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee("���������", dolgnost.emp, -500);
        ShtatEmployee shtatEmp = new ShtatEmployee("�������", dolgnost.zam, 1000, 1000);
        ContractEmployee contractEmployee = new ContractEmployee("����", dolgnost.dir, 1500);
        Department dep = new Department("����������� �1", 3, emp, shtatEmp, contractEmployee);
        Firm firm = new Firm("����� �1", dep);
        
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
