import Interface.IAbstractFactory;
import Interface.IComputer;
import Interface.ITablet;
import Interface.Iphone;
import Samsung.SamsungAbstractFactory;
import Xiaomi.XiaomiAbstractFactory;
import Apple.AppleAbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер фирмы: \n1-Samsung \n2-Apple \n3-Xiaomi");
        int firm=0;
        firm=in.nextInt();
        switch (firm){
            case (1):
                System.out.println("Введите номер предмета: \n1-Телефон \n2-Планшет \n3-Компьютер");
                int item=0;
                item=in.nextInt();
                IAbstractFactory factory=new SamsungAbstractFactory();
                switch (item){
                    case (1):
                        Iphone phone=factory.getPhone();
                        System.out.println(phone.getPhoneType());
                        break;
                    case (2):
                        ITablet tablet=factory.getTablet();
                        System.out.println(tablet.getTablet());
                        break;
                    case (3):
                        IComputer comp=factory.getComputer();
                        System.out.println(comp.getComputerType());
                        break;
                    default:
                        System.out.println("Такого предмета нет");
                        break;
                }
                break;
            case (2):
                System.out.println("Введите номер предмета: \n1-Телефон \n2-Планшет \n3-Компьютер");
                int item1=0;
                item1=in.nextInt();
                IAbstractFactory factory1=new AppleAbstractFactory();
                switch (item1){
                    case (1):
                        Iphone phone=factory1.getPhone();
                        System.out.println(phone.getPhoneType());
                        break;
                    case (2):
                        ITablet tablet=factory1.getTablet();
                        System.out.println(tablet.getTablet());
                        break;
                    case (3):
                        IComputer comp=factory1.getComputer();
                        System.out.println(comp.getComputerType());
                        break;
                    default:
                        System.out.println("Такого предмета нет");
                        break;
                }
                break;
            case (3):
                System.out.println("Введите номер предмета: \n1-Телефон \n2-Планшет \n3-Компьютер");
                int item2=0;
                item2=in.nextInt();
                IAbstractFactory factory2=new XiaomiAbstractFactory();
                switch (item2){
                    case (1):
                        Iphone phonex=factory2.getPhone();
                        System.out.println(phonex.getPhoneType());
                        break;
                    case (2):
                        ITablet tabletx=factory2.getTablet();
                        System.out.println(tabletx.getTablet());
                        break;
                    case (3):
                        IComputer compx=factory2.getComputer();
                        System.out.println(compx.getComputerType());
                        break;
                    default:
                        System.out.println("Такого предмета нет");
                        break;
                }
                break;
            default:
                System.out.println("Такой фирмы нет");
                break;
        }
    }
}
