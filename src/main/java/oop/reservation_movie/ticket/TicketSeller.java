package oop.reservation_movie.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }
    public void sellTo(Audience audience){
        //이제 판매원은 관객과 접근만 하면 가방의 구매절차와 office의 현금수금절차에 직접 접근하지 않아도 티켓을 판매할 수 있다.
        ticketOffice.sellTicketTo(audience);
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

}
