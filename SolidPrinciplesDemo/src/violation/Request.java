package violation;

public class Request {

    public static void main(String[] args) {
        Media media = new Document("Akash.txt");
        Service blutooth = new BluetoothService(media);

        //Dependacy Inversion
        BluetoothService blutooth2 = new BluetoothService(media);
        blutooth.shareViaInternal();
        blutooth.shareViaExternal();
    }
}
