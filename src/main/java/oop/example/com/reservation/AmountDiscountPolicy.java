package oop.example.com.reservation;

public class AmountDiscountPolicy extends DiscountPolicy{
    private Money discouintAmount;

    public AmountDiscountPolicy(Money discouintAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discouintAmount = discouintAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discouintAmount;
    }
}
