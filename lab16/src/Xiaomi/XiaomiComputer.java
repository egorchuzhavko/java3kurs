package Xiaomi;

import Interface.IComputer;

public class XiaomiComputer implements IComputer {
    @Override
    public String getComputerType() {
        return "Компьютер марки Xiaomi";
    }
}
