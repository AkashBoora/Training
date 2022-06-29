package factory.implementation;

public class PhoneFactory {
    public Phone getPhone(String phoneCompany){
        if(phoneCompany.equalsIgnoreCase("Samsung")){
            return new Samsung();
        }else if(phoneCompany.equalsIgnoreCase("Redmi")){
            return new Redmi();
        }else if(phoneCompany.equalsIgnoreCase("Vivo")){
            return new Vivo();
        }
        return null;
    }
}
