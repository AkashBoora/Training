package valid.services;

import valid.media.Media;

public class WhatsAppSerice implements InternalShareService, Texting {
    Media media;
    public WhatsAppSerice(Media media) {
        this.media = media;
    }

    @Override
    public void share() {
        System.out.println(media.getFilename()+" is started sharing via whatsapp");
        System.out.println("Sharing... ");
        System.out.println("sharing "+media+" successful.");
    }

    @Override
    public void texting() {
        System.out.println("Texting from Whatsapp");
    }
}