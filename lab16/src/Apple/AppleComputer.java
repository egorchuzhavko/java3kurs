package Apple;

import Interface.IComputer;

public class AppleComputer implements IComputer {
    @Override
    public String getComputerType() {
        return "Компьютер марки Apple";
    }
}
