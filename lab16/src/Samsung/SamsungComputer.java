package Samsung;

import Interface.IComputer;

public class SamsungComputer implements IComputer {
    @Override
    public String getComputerType() {
        return "Компьютер марки Samsung";
    }
}
