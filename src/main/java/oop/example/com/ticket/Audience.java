package oop.example.com.ticket;

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
        //가방의 자율성 보장을 위해 가방 호출만 한다.
        return bag.hold(ticket);
    }
}
