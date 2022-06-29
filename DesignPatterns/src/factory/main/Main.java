package factory.main;

import factory.implementation.Phone;
import factory.implementation.PhoneFactory;
import factory.implementation.Redmi;


public class Main {
    public static void main(String[] args) {
        Phone newRedmiPhone = new Redmi();
        newRedmiPhone.getCompany();
        
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone newVivoPhone = phoneFactory.getPhone("Vivo");
        newVivoPhone.getCompany();
        Phone newSamsungPhone = phoneFactory.getPhone("Samsung");
        newSamsungPhone.getCompany();
    }
}
