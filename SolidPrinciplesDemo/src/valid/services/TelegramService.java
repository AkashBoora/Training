package valid.services;

import valid.media.Media;

public class TelegramService implements ExternalShareService{
    Media media;
    public TelegramService(Media media) {
        this.media = media;
    }
    @Override
    public void share() {
        System.out.println(media.getFilename()+" is started sharing via telegram");
        System.out.println("Sharing... ");
        System.out.println("sharing "+media+" successful.");
    }
}
