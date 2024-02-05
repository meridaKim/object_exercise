package oop.reservation_movie.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice = ticketOffice;
    }
    public void sellTo(Audience audience){
        //invitation이 존재할 때 -> 요금을 내지 않는다.
        if(audience.getBag().hasInvitation()){
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
            //invitation이 없을 때 티켓을 구매하기 위해 요금을 낸다. 매표소에 요금을 저장
        }else{
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

}
