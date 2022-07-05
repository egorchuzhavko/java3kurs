package workers;

public abstract class Worker 
{
    public double salary;


    public Worker(double salary) 
    {
        this.salary = salary;
    }

    public abstract double Calculate();

}
