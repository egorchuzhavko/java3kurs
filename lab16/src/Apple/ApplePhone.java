package Apple;

import Interface.Iphone;

public class ApplePhone implements Iphone {
    @Override
    public String getPhoneType() {
        return "Телефон марки Apple";
    }
}
