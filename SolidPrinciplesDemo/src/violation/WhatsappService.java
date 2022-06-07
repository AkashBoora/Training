package violation;

public class WhatsappService implements Service{

    public  void texting(){
        System.out.println("Texting");
    }


    @Override
    public void shareViaExternal() {
        throw new UnsupportedOperationException("whatsapp doesn't require device to connect!!");
    }

    @Override
    public void shareViaInternal() {

    }
}
