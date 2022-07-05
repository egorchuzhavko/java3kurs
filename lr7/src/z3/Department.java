package z3;

public class Department {
    String name;
    int countEmployee;
    Employee emp;
    ShtatEmployee shtatEmp;
    ContractEmployee contractEmp;

    Department (String name, int countEmployee, Employee emp, ShtatEmployee shtatEmp, ContractEmployee contractEmp) {
        this.name = name;
        this.countEmployee = countEmployee;
        this.emp = emp;
        this.contractEmp = contractEmp;
        this.shtatEmp = shtatEmp;
    }

    public String getName(){
        return name;
    } 
    public void setName(String a){
        name = a;
    }

    public int getCountEmployee(){
        return countEmployee;
    } 
    public void setCountEmployee(int a){
        countEmployee = a;
    }
}
