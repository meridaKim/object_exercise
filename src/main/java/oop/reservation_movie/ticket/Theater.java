package oop.reservation_movie.ticket;

public class Theater {
    private  TicketSeller ticketSeller;

    public Theater (TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        // ticketOffice에 더이상 접근하지 않는다. -> 자율성 보장
        ticketSeller.sellTo(audience);
    }
}
