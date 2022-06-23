package lambdas;

public class CapturingLambda {
    Trade trade = new Trade();

    interface ITrade{
        public boolean check(Trade t);
    }

    public boolean isOpenTrade(){
        ITrade simpleLambda = t -> t.isOpen()?true:false;
        return simpleLambda.check(trade);
    }

    public boolean checkStatus(String status){
        ITrade statusLambda = t -> t.getStatus().equals(status)?true:false;
        return statusLambda.check(trade);
    }

    public boolean isOpenAndLargeTradeLambda(String status, int quantity){
        ITrade openAndLargeTardeLambda = t -> {
            return (t.getStatus().equals(status) && t.getQuantity() > quantity);
        };
        return openAndLargeTardeLambda.check(trade);
    }
    public static void main(String[] args) {
        CapturingLambda capturingLambda = new CapturingLambda();
        System.out.println("Is Open trade using non-capturing lambda: "+capturingLambda.isOpenTrade());

        // Local, instance and satic variables not to be mutated in lambda expressions.
    }
}
