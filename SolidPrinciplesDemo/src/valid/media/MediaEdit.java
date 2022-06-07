package valid.media;

public class MediaEdit {
    Media media;

    public MediaEdit(Media media) {
        this.media=media;
    }
    public void editMedia() {
        System.out.println("Media is in edit mode");
        System.out.println("Editing....");
        System.out.println("Media edited successfully");
    }
}
