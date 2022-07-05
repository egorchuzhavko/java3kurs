package Xiaomi;

import Interface.IAbstractFactory;
import Interface.IComputer;
import Interface.ITablet;
import Interface.Iphone;
import Samsung.SamsungComputer;
import Samsung.SamsungPhone;
import Samsung.SamsungTablet;

public class XiaomiAbstractFactory implements IAbstractFactory {
    @Override
    public ITablet getTablet() {
        return new XiaomiTablet();
    }

    @Override
    public Iphone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public IComputer getComputer() {
        return new XiaomiComputer();
    }
}
