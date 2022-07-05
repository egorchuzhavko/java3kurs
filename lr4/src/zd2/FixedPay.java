package zd2;

public class FixedPay extends Worker{
    public FixedPay(String name, double zp_m) {
        super(name, zp_m);
    }

    @Override
    public double Calculate() {
        return zp_m;
    }
}
