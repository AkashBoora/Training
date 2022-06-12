package oops;

import java.util.ArrayList;

interface Mobile{
    public void calling(String number);


    public  void sendMessage(String Message);
}
class Apple implements Mobile{

    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContacts(String number){
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling "+number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message "+message);
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Apple myPhone = new Apple();
        myPhone.calling("86535464511");
        myPhone.sendMessage("Hello, This is Abstraction");
        myPhone.addContacts("6876346765");
        Samsung myNewPhone = new Samsung();
        myNewPhone.addContact("4815313541");
        myNewPhone.calling("9788676");
        myNewPhone.sendMessage("Abbstract Class");
    }
}
abstract class  Mobilee{
    private ArrayList<String> contacts = new ArrayList<String>();
    abstract void calling(String number);

    abstract void sendMessage(String message);

    public void addContact(String contact){//concrete method
        contacts.add(contact);
    }
}

class Samsung extends Mobilee{

    @Override
    public void calling(String number) {
        System.out.println("Calling from Samsung "+number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message from samsung"+message);
    }
}
