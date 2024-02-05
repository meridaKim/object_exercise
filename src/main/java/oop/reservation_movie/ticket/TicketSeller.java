package oop.reservation_movie.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }
    public void sellTo(Audience audience){
        //매표소에 접근할 수 있는 판매원이 티켓을 가져다주고 구매에 대한 결정은 관객이 처리한다. 관객이 구매했을 경우의 금액을 매표소에 전달한다.
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

}
