package violation;

public class Media {
    private String fileName;

    public Media(String fileName) {
        this.fileName = fileName;
    }
    public void share(String via)
    {
        if(via.equals("whatsapp"))
        {
            System.out.println("Sharing via WhatsApp");
        }
        else if(via.equals("bluetooth"))
        {
            System.out.println("Sharing via Blutooth");
        }
    }
    public void edit()
    {
        System.out.println("edit the file");
    }
    public void mediaType()
    {

    }
}
