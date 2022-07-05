package workers;

public class FixedPay extends Worker
{
    public FixedPay(double salary) 
    {
        super(salary);
    }

    @Override
    public double Calculate() 
    {
        return salary;
    }
}
