package workers;

public class HourlyPay extends Worker
{
	public double salInHo;
    public HourlyPay(double salaryInHour, double salary) 
    {
        super(salary);
        salInHo=salaryInHour;
    }

    @Override
    public double Calculate()  
    {
    	salary=20.8*8 * salInHo;
        return salary;
    }


}
