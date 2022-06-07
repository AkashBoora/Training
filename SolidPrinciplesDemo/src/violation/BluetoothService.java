package violation;

public class BluetoothService implements Service {
    Media media;

    public BluetoothService(Media media) {
        this.media = media;
    }

    @Override
    public void shareViaExternal() {

        System.out.println("document is started sharing");
        System.out.println("sharing...");
        System.out.println("sharing"+media+" successfull!");
    }

    @Override
    public void shareViaInternal() {

        throw new UnsupportedOperationException("bluetooth doesn't support");
    }
}
