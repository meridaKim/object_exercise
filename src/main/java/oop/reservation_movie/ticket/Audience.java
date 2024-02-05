package oop.reservation_movie.ticket;

public class Audience {

    private Bag bag;
    //가방 객체를 필드로 가진다.

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag(){
        return bag;
    }

    public Long buy(Ticket ticket){
        //가방에 초대장이 있는지 없는지를 가방의 주인인 관객이 확인한다.
        if(bag.hasInvitation()){
            bag.setTicket(ticket);
            return 0L;

        }else{
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();

        }
    }
}
