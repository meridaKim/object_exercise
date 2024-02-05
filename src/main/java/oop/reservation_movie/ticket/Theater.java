package oop.reservation_movie.ticket;

public class Theater {
    private  TicketSeller ticketSeller;

    public Theater (TicketSeller ticketSeller){
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        //invitation이 존재할 때 -> 요금을 내지 않는다.
        if(audience.getBag().hasInvitation()){
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        //invitation이 없을 때 티켓을 구매하기 위해 요금을 낸다. 매표소에 요금을 저장
        }else{
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
