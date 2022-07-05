package NewModel;

public class Employee {
    private int age;
    private String name;
    private String gender;
    private String role;
    private float salary;

    public Employee(int age, String name, String gender, String role, float salary) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.role = role;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}