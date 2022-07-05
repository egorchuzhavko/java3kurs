package example.domain;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee() {}

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int GetEmpId() {return empId;}
    public String GetName() {return name;}
    public String GetSsn() {return ssn;}
    public double GetSalary() {return salary;}

    public void SetName(String name) {this.name=name;}

    public void raiseSalary(double increase){
        if (increase>0){
            salary += increase;
        }
    }

    public void printEmployee(Employee emp) {
        System.out.println("Employee ID: " + emp.GetEmpId());
        System.out.println("Employee Name: " + emp.GetName());
        System.out.println("Employee Soc Sec # " + emp.GetSsn());
        System.out.println("Employee salary: " + emp.GetSalary());
    }

}
