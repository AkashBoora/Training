package valid.services;

import valid.media.Media;

public class BlutoothServie implements ExternalShareService {

    Media media;
    public BlutoothServie(Media media) {
        this.media = media;
    }

    @Override
    public void share() {
        System.out.println(media.getFilename()+" is started sharing via blutooth");
        System.out.println("Sharing... ");
        System.out.println("sharing "+media+" successful.");
    }
}
