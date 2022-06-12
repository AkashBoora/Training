package oops;
interface TravelBooking{
    public  void bookTicket();
}
class Trainticket implements  TravelBooking{
    public void bookTicket(){
        System.out.println("Train ticket Booked");
    }
}
class Flightticket implements  TravelBooking{
    public void bookTicket(){
        System.out.println("Flight ticket Booked");
    }
}
class TicketBookingByAgent implements  TravelBooking{
    public TravelBooking t;
    public TicketBookingByAgent(TravelBooking t){
        this.t=t;
    }
    public  void bookTicket(){
        t.bookTicket();
    }
}
public class DelegationDemo {
    public static void main(String[] args) {
        TicketBookingByAgent agent = new TicketBookingByAgent(new Flightticket());
        agent.bookTicket();
    }

}
