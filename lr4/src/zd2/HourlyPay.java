package zd2;

public class HourlyPay extends Worker{

    public HourlyPay(String name, double zp_m) {
        super(name, zp_m);
    }

    @Override
    public double Calculate()  {
        return 20.8*8 * zp_m;
    }


}
