package lambdas;

public class Trade {

    public String getInstrument;
    String tradeName;
    int quantity;
    String status;
    String instrument;

    int id;
    public Trade() {
        this.tradeName=tradeName;
        this.quantity=quantity;
        this.status=status;
    }

    public boolean isOpen() {
        if(this.status.equals("OPEN"))
            return true;
        return false;
    }

    public String getStatus() {
        return this.status;
    }

    public int getQuantity() {
        return  this.quantity;
    }

    public boolean isBigTrade() {
        return true;
    }

    public boolean isCancelled() {
        return true;
    }

    public int getID() {
        return this.id;
    }

    public String getInstrument() {
        return this.instrument;
    }
}
