package oop.reservation_movie.ticket;

public class Bag {
    public Bag(long amount){
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public boolean hasInvitation(){
        return ticket !=null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
