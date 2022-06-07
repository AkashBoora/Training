package valid.services;


public class InternalServicePlatformInValid {
    BlutoothServie blutoothServie;

    public InternalServicePlatformInValid(BlutoothServie blutoothServie) {
        this.blutoothServie=blutoothServie;
    }

    public void shareMedia() {
        blutoothServie.share();
    }
}
