package oop.reservation_movie.ticket;

public class Bag {
    public Bag(long amount){
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }
    public Long hold(Ticket ticket){
        //가방의 자율성을 보장하기 위해 티켓 구매시 지출되는 메소드를 bag에서 수행하도록 설계한다.
        // 관객이 가방의 내부 상태로 직접 접근하지 않도록 캡슐화
        if(hasInvitation()){
            setTicket(ticket);
            return 0L;

        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
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
