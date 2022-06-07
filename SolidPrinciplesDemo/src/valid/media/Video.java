package valid.media;

public class Video extends Media {
    public Video(String fileName) {
        super(fileName);
    }

    @Override
    public void mediaType() {
        System.out.println("videoType");
    }
}
