package Xiaomi;

import Interface.Iphone;

public class XiaomiPhone implements Iphone {
    @Override
    public String getPhoneType() {
        return "Телефрон марки Xiaomi";
    }
}
