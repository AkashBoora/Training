package violation;

public class WhatsAppLite extends WhatsappService{
    public  void texting(){
        System.out.println("Texting from lite");
    }


    @Override
    public void shareViaExternal() {
        throw new UnsupportedOperationException("whatsapp doesn't require device to connect!!");
    }

    @Override
    public void shareViaInternal() {
        throw new UnsupportedOperationException("whatsapp lite doesn't require device to connect!!");
    }
}
