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
}
