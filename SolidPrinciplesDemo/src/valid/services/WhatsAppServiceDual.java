package valid.services;

import valid.media.Media;

public class WhatsAppServiceDual extends WhatsAppSerice{
    Media media;
    public WhatsAppServiceDual(Media media) {
        super(media);
    }
    @Override
    public void share() {
        System.out.println(media.getFilename()+" is started sharing via whatsapp");
        System.out.println("Sharing... ");
        System.out.println("sharing "+media+" successful.");
    }

    @Override
    public void texting() {
        System.out.println("Texting from WhatsappDual");
    }

}
