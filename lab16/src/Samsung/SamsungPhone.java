package Samsung;

import Interface.Iphone;

public class SamsungPhone implements Iphone {
    @Override
    public String getPhoneType() {
        return "Телефон марки Samsung";
    }
}
