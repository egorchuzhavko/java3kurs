package Samsung;

import Apple.AppleTablet;
import Interface.IAbstractFactory;
import Interface.IComputer;
import Interface.ITablet;
import Interface.Iphone;

public class SamsungAbstractFactory implements IAbstractFactory {
    @Override
    public ITablet getTablet() {
        return new SamsungTablet();
    }

    @Override
    public Iphone getPhone() {
        return new SamsungPhone();
    }

    @Override
    public IComputer getComputer() {
        return new SamsungComputer();
    }
}
