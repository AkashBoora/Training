package valid.media;

public class Document extends Media{
    public Document(String fileName) {
        super(fileName);
    }

    @Override
    public void mediaType() {
        System.out.println("docType");
    }
}
