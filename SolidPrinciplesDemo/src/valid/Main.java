package valid;

import valid.media.Document;
import valid.media.Media;
import valid.media.MediaEdit;
import valid.media.Video;
import valid.services.*;

public class Main {
    public static void main(String[] args) {

        //Single Responsibility Principle
        Media media = new Document("Akash.txt");
        MediaEdit edit = new MediaEdit(media);
        edit.editMedia();
        ExternalShareService externalShareService = new BlutoothServie(media);
        ExternalServicePlatform externalServicePlatform = new ExternalServicePlatform(externalShareService);
        externalServicePlatform.shareMedia();

        //Open Closed Principle
        Media media1 = new Document("Akash.txt");
        Media media2 = new Video("Akash.mp4");

        //Liskov Substitution Principle
        ExternalShareService externalShareService1 = new BlutoothServie(media1);
        ExternalServicePlatform externalServicePlatform1 = new ExternalServicePlatform(externalShareService1);
        externalServicePlatform1.shareMedia();
        InternalShareService internalShareService1 = new WhatsAppSerice(media2);
        InternalServicePlatform internalServicePlatform1 = new InternalServicePlatform(internalShareService1);
        internalServicePlatform1.shareMedia();

        //Interface Segregation Principle
        ExternalShareService externalShareService2 = new BlutoothServie(media);
        InternalShareService internalShareService2 = new WhatsAppSerice(media);

        //Dependency Inversion Principle
        ExternalShareService externalShareService3 = new BlutoothServie(media1);
        ExternalServicePlatform externalServicePlatform3 = new ExternalServicePlatform(externalShareService3);
        externalServicePlatform3.shareMedia();
        ExternalShareService externalShareService4 = new TelegramService(media1);
        ExternalServicePlatform externalServicePlatform4 = new ExternalServicePlatform(externalShareService4);
        externalServicePlatform3.shareMedia();
        InternalShareService internalShareService3 = new WhatsAppSerice(media2);
        InternalServicePlatform internalServicePlatform3 = new InternalServicePlatform(internalShareService3);
        internalServicePlatform3.shareMedia();

    }
}
